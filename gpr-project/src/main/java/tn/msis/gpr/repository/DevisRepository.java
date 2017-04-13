package tn.msis.gpr.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import tn.msis.gpr.domain.Devis;

public interface DevisRepository extends JpaRepository<Devis, Long> {

	//
	@Query(nativeQuery = true,
			value = "select * from devis as d join panne as p on d.matricule = p.matricule where d.matricule = :matricule  ")
	public List<Devis> findByMatriculeInPanne(@Param("matricule") String matricule);
}
