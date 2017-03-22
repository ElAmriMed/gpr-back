package tn.msis.gpr.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
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

	public Engin findByMatricule(String matricule);

	public List<Engin> findByType(TypeEngin type);

	public List<Engin> findByEtat(EtatEngin etat);

	public List<Engin> findByMarque(String marque);

	public List<Engin> findByModele(String modele);

	// *********** MIXED ****************

	public List<Engin> findByTypeAndEtat(TypeEngin type, EtatEngin etat);

	public List<Engin> findByTypeAndMarque(TypeEngin type, String marque);

	public List<Engin> findByTypeAndModele(TypeEngin type, String modele);

	public List<Engin> findByEtatAndMarque(EtatEngin etat, String marque);

	public List<Engin> findByEtatAndModele(EtatEngin etat, String modele);

	public List<Engin> findByMarqueAndModele(String marque, String modele);

}
