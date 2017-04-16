package tn.msis.gpr.repository;

import java.math.BigDecimal;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import tn.msis.gpr.domain.Panne;
import tn.msis.gpr.enums.EtatPanne;

public interface PanneRepository extends JpaRepository<Panne, Long> {

	//
	public Panne findByReference(String reference);

	public List<Panne> findByMatricule(String matricule);

	// method de test
	public List<Panne> findByFacture_coutGreaterThan(BigDecimal cout);

	public List<Panne> findByEtat(EtatPanne etat);

	@Modifying
	@Query("UPDATE Panne p SET p.etat = :state WHERE p.reference = :ref")
	public void findByRefAndUpdateState(@Param("ref") String ref, @Param("state") EtatPanne state);
}
