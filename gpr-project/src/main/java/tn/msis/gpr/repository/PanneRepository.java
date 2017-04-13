package tn.msis.gpr.repository;

import java.math.BigDecimal;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import tn.msis.gpr.domain.Panne;
import tn.msis.gpr.enums.EtatPanne;

public interface PanneRepository extends JpaRepository<Panne, Long> {

	//
	public Panne findByReference(String reference);

	public List<Panne> findByMatricule(String matricule);

	// method de test
	public List<Panne> findByFacture_coutGreaterThan(BigDecimal cout);

	public List<Panne> findByEtat(EtatPanne etat);

}
