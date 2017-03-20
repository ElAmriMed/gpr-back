package tn.msis.gpr.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.stereotype.Repository;

import tn.msis.gpr.domain.Engin;
import tn.msis.gpr.enums.EtatEngin;
import tn.msis.gpr.enums.TypeEngin;

/**
 * EnginRepository.
 * 
 * @author El Amri Med
 *
 */
@Repository
public interface EnginRepository extends JpaRepository<Engin, Long> {

	/**
	 * findById.
	 * 
	 * @param id
	 * @return
	 */
	public Engin findById(Long id);
	
	/**
	 * findByReference.
	 * 
	 * @param reference
	 * @return
	 */
	
	public Engin findByReference(String reference);
	
	/**
	 * findByType.
	 * 
	 * @param type
	 * @return {@link List} of {@link Engin}
	 */
	public List<Engin> findByType(TypeEngin type);
	
	/**
	 * findByEtat.
	 * 
	 * @param etat
	 * @return {@link List} of {@li Engin}
	 */
	public List<Engin> findByEtat(EtatEngin etat);

}



















