package tn.msis.gpr.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import tn.msis.gpr.domain.Engin;

@Repository
public interface EnginInformationRepository extends JpaRepository<Engin, Long> {

	@Query("select marque from EnginInformation group by marque")
	public List<String> getAllMarques();

	@Query("select modele from EnginInformation group by modele")
	public List<String> getAllModeles();

	@Query("select modele from EnginInformation where marque = :marque")
	public List<String> findAllModelesByMarque(String marque);

}
