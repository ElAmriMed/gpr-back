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

	public List<Engin> findByMarqueIgnoreCase(String marque);

	public List<Engin> findByModele(String modele);

	// *********** MIXED ****************

	public List<Engin> findByTypeAndEtatAllIgnoreCase(TypeEngin type, EtatEngin etat);

	public List<Engin> findByTypeAndMarqueAllIgnoreCase(TypeEngin type, String marque);

	public List<Engin> findByTypeAndModeleAllIgnoreCase(TypeEngin type, String modele);

	public List<Engin> findByEtatAndMarqueAllIgnoreCase(EtatEngin etat, String marque);

	public List<Engin> findByEtatAndModeleAllIgnoreCase(EtatEngin etat, String modele);

	public List<Engin> findByMarqueAndModeleAllIgnoreCase(String marque, String modele);

	public List<Engin> findByTypeAndEtatAndMarqueAllIgnoreCase(TypeEngin type, EtatEngin etat, String marque);

	public List<Engin> findByTypeAndEtatAndModeleAllIgnoreCase(TypeEngin type, EtatEngin etat, String modele);

	public List<Engin> findByTypeAndMarqueAndModeleAllIgnoreCase(TypeEngin type, String marque, String modele);

	public List<Engin> findByEtatAndMarqueAndModeleAllIgnoreCase(EtatEngin etat, String marque, String modele);

	public List<Engin> findByMarqueAndTypeAndModeleAndEtatAllIgnoreCase(String marque, TypeEngin type, String modele,
			EtatEngin etat);

	// *********** PROJECT RELATED ****************

	public List<Engin> findByProjet(String referenceProjet);

}