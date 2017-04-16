package tn.msis.gpr.repository;

import java.time.LocalDateTime;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import tn.msis.gpr.domain.Devis;

public interface DevisRepository extends JpaRepository<Devis, Long> {

	public Devis findByReference(String reference);

	public List<Devis> findByPanne(String refPanne);

	@Modifying
	@Query("UPDATE Devis d SET d.dateValidation = :dateValidation WHERE d.reference = :ref")
	public void updateDateValidation(@Param("ref") String ref, @Param("dateValidation") LocalDateTime dateValidation);

}