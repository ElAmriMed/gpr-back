package tn.msis.gpr.controller;

import static org.springframework.web.bind.annotation.RequestMethod.DELETE;
import static org.springframework.web.bind.annotation.RequestMethod.GET;
import static org.springframework.web.bind.annotation.RequestMethod.POST;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
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

	@CrossOrigin
	@RequestMapping(value = "/findAll", method = GET)
	public List<Engin> findAll() {
		return enginRepository.findAll();
	}

	@CrossOrigin
	@RequestMapping(value = "/find/matricule/{matricule}", method = GET)
	public Engin findByMatricule(@PathVariable("matricule") String matricule) {
		return enginRepository.findByMatricule(matricule);
	}

	@CrossOrigin
	@RequestMapping(value = "/findByType/{typeEngin}", method = GET)
	public List<Engin> findByType(@PathVariable("typeEngin") String typeEngin) {

		return enginRepository.findByType(TypeEngin.valueOf(typeEngin));
	}

	@CrossOrigin
	@RequestMapping(value = "/find/id/{id}", method = GET)
	public Engin findOne(@PathVariable("id") Long id) {
		return enginRepository.findOne(id);
	}

	@CrossOrigin
	@RequestMapping(value = "/add", method = POST)
	public void add(@RequestBody Engin engin) {

		enginRepository.save(engin);
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

		return enginRepository.findByTypeAndEtat(TypeEngin.valueOf(type), EtatEngin.valueOf(etat));
	}

	@CrossOrigin
	@RequestMapping(value = "/find/type/{type}/marque/{marque}", method = GET)
	public List<Engin> findByTypeAndMarque(@PathVariable("type") String type, @PathVariable("marque") String marque) {

		return enginRepository.findByTypeAndMarque(TypeEngin.valueOf(type), marque);
	}

	@CrossOrigin
	@RequestMapping(value = "/find/type/{type}/modele/{modele}", method = GET)
	public List<Engin> findByTypeAndModele(@PathVariable("type") String type, @PathVariable("modele") String modele) {

		return enginRepository.findByTypeAndModele(TypeEngin.valueOf(type), modele);
	}

	@CrossOrigin
	@RequestMapping(value = "/find/etat/{etat}/marque/{marque}", method = GET)
	public List<Engin> findByEtatAndMarque(@PathVariable("etat") String etat, @PathVariable("marque") String marque) {

		return enginRepository.findByEtatAndMarque(EtatEngin.valueOf(etat), marque);
	}

	@CrossOrigin
	@RequestMapping(value = "/find/etat/{etat}/modele/{modele}", method = GET)
	public List<Engin> findByEtatAndModele(@PathVariable("etat") String etat, @PathVariable("modele") String modele) {

		return enginRepository.findByEtatAndModele(EtatEngin.valueOf(etat), modele);
	}
}
