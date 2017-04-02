package tn.msis.gpr.controller;

import static org.springframework.web.bind.annotation.RequestMethod.DELETE;
import static org.springframework.web.bind.annotation.RequestMethod.GET;
import static org.springframework.web.bind.annotation.RequestMethod.PUT;

import java.util.Arrays;
import java.util.List;

import org.dozer.DozerBeanMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import tn.msis.gpr.domain.Engin;
import tn.msis.gpr.enums.EtatEngin;
import tn.msis.gpr.enums.TypeEngin;
import tn.msis.gpr.repository.EnginRepository;

@RequestMapping(value = "/engin")
@RestController
public class EnginController {

	@Autowired
	private EnginRepository enginRepository;

	@Autowired
	private DozerBeanMapper dozerBeanMapper;

	@CrossOrigin
	@RequestMapping(value = "/findAll", method = GET)
	public List<Engin> findAll() {
		return enginRepository.findAll();
	}

	@CrossOrigin
	@RequestMapping(value = "/find/id/{id}", method = GET)
	public Engin findOne(@PathVariable("id") Long id) {
		return enginRepository.findOne(id);
	}

	@CrossOrigin
	@RequestMapping(value = "/find/matricule/{matricule}", method = GET)
	public Engin findByMatricule(@PathVariable("matricule") String matricule) {
		return enginRepository.findByMatricule(matricule);
	}

	@CrossOrigin
	@RequestMapping(value = "/find/marque/{marque}", method = GET)
	public List<Engin> findByMarque(@PathVariable("marque") String marque) {
		return enginRepository.findByMarqueIgnoreCase(marque);
	}

	@CrossOrigin
	@RequestMapping(value = "/find/type/{type}", method = GET)
	public List<Engin> findByType(@PathVariable("type") String type) {
		return enginRepository.findByType(TypeEngin.valueOf(type));
	}

	@CrossOrigin
	@RequestMapping(value = "/find/modele/{modele}", method = GET)
	public List<Engin> findByModele(@PathVariable("modele") String modele) {
		return enginRepository.findByModele(modele);
	}

	@CrossOrigin
	@RequestMapping(value = "find/etat/{etat}", method = GET)
	public List<Engin> findByEtat(@PathVariable("etat") String etat) {
		return enginRepository.findByEtat(EtatEngin.valueOf(etat));
	}

	@CrossOrigin
	@PostMapping("/add")
	public void add(@RequestBody tn.msis.gpr.entities.Engin engin) {

		Engin domain = dozerBeanMapper.map(engin, Engin.class);

		enginRepository.save(domain);
	}

	@CrossOrigin
	@RequestMapping(value = "/update", method = PUT)
	public Engin update(@RequestBody Engin engin) {
		return enginRepository.save(engin);
	}

	@CrossOrigin
	@RequestMapping(value = "/delete/id/{id}", method = DELETE)
	public void supprimerEngin(@PathVariable("id") Long id) {
		enginRepository.delete(id);
	}

	@CrossOrigin
	@RequestMapping(value = "/getAllTypes", method = GET)
	public TypeEngin[] getAllTypes() {
		return TypeEngin.values();
	}

	@CrossOrigin
	@RequestMapping(value = "/getAllEtats", method = GET)
	public List<EtatEngin> getAllEtats() {
		return Arrays.asList(EtatEngin.values());
	}

	// ********** MIXED SEARCH ************

	@CrossOrigin
	@RequestMapping(value = "/find/type/{type}/etat/{etat}", method = GET)
	public List<Engin> findByTypeAndEtat(@PathVariable("type") String type, @PathVariable("etat") String etat) {
		return enginRepository.findByTypeAndEtatAllIgnoreCase(TypeEngin.valueOf(type), EtatEngin.valueOf(etat));
	}

	@CrossOrigin
	@RequestMapping(value = "/find/type/{type}/marque/{marque}", method = GET)
	public List<Engin> findByTypeAndMarque(@PathVariable("type") String type, @PathVariable("marque") String marque) {
		return enginRepository.findByTypeAndMarqueAllIgnoreCase(TypeEngin.valueOf(type), marque);
	}

	@CrossOrigin
	@RequestMapping(value = "/find/type/{type}/modele/{modele}", method = GET)
	public List<Engin> findByTypeAndModele(@PathVariable("type") String type, @PathVariable("modele") String modele) {
		return enginRepository.findByTypeAndModeleAllIgnoreCase(TypeEngin.valueOf(type), modele);
	}

	@CrossOrigin
	@RequestMapping(value = "/find/etat/{etat}/marque/{marque}", method = GET)
	public List<Engin> findByEtatAndMarque(@PathVariable("etat") String etat, @PathVariable("marque") String marque) {
		return enginRepository.findByEtatAndMarqueAllIgnoreCase(EtatEngin.valueOf(etat), marque);
	}

	@CrossOrigin
	@RequestMapping(value = "/find/etat/{etat}/modele/{modele}", method = GET)
	public List<Engin> findByEtatAndModele(@PathVariable("etat") String etat, @PathVariable("modele") String modele) {
		return enginRepository.findByEtatAndModeleAllIgnoreCase(EtatEngin.valueOf(etat), modele);
	}

	@CrossOrigin
	@RequestMapping(value = "/find/marque/{marque}/modele/{modele}", method = GET)
	public List<Engin> findByModeleAndMarque(@PathVariable("marque") String marque,
			@PathVariable("modele") String modele) {

		List<Engin> a = enginRepository.findByMarqueAndModeleAllIgnoreCase(marque, modele);
		return a;
	}

	@CrossOrigin
	@RequestMapping(value = "/find/type/{type}/etat/{etat}/marque/{marque}", method = GET)
	public List<Engin> findByTypeAndEtatAndMarque(@PathVariable("type") String type, @PathVariable("etat") String etat,
			@PathVariable("marque") String marque) {
		return enginRepository.findByTypeAndEtatAndMarqueAllIgnoreCase(TypeEngin.valueOf(type), EtatEngin.valueOf(etat),
				marque);
	}

	@CrossOrigin
	@RequestMapping(value = "/find/type/{type}/etat/{etat}/modele/{modele}", method = GET)
	public List<Engin> findByTypeAndEtatAndModele(@PathVariable("type") String type, @PathVariable("etat") String etat,
			@PathVariable("modele") String modele) {
		return enginRepository.findByTypeAndEtatAndModeleAllIgnoreCase(TypeEngin.valueOf(type), EtatEngin.valueOf(etat),
				modele);
	}

	@CrossOrigin
	@RequestMapping(value = "/find/type/{type}/marque/{marque}/modele/{modele}", method = GET)
	public List<Engin> findByTypeAndMarqueAndModele(@PathVariable("type") String type,
			@PathVariable("marque") String marque, @PathVariable("modele") String modele) {
		return enginRepository.findByTypeAndMarqueAndModeleAllIgnoreCase(TypeEngin.valueOf(type), marque, modele);
	}

	@CrossOrigin
	@RequestMapping(value = "/find/etat/{etat}/marque/{marque}/modele/{modele}", method = GET)
	public List<Engin> findByEtatAndMarqueAndModele(@PathVariable("etat") String etat,
			@PathVariable("marque") String marque, @PathVariable("modele") String modele) {
		return enginRepository.findByEtatAndMarqueAndModeleAllIgnoreCase(EtatEngin.valueOf(etat), marque, modele);
	}

	@CrossOrigin
	@RequestMapping(value = "/find/marque/{marque}/type/{type}/modele/{modele}/etat/{etat}", method = GET)
	public List<Engin> findByMarqueAndTypeAndModele(@PathVariable("marque") String marque,
			@PathVariable("type") String type, @PathVariable("modele") String modele,
			@PathVariable("etat") String etat) {
		return enginRepository.findByMarqueAndTypeAndModeleAndEtatAllIgnoreCase(marque, TypeEngin.valueOf(type), modele,
				EtatEngin.valueOf(etat));
	}
}