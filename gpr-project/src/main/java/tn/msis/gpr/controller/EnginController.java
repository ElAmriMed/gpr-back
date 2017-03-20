package tn.msis.gpr.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import tn.msis.gpr.domain.Engin;
import tn.msis.gpr.enums.EtatEngin;
import tn.msis.gpr.enums.TypeEngin;
import tn.msis.gpr.repository.EnginRepository;

@RequestMapping(value="/engin")
@RestController
public class EnginController {
	@Autowired	
	private EnginRepository enginRepository;
	
	@CrossOrigin
	@RequestMapping(value="/findByType/{typeEngin}", method=RequestMethod.GET)
	public List<Engin> findByType(@PathVariable("typeEngin") String typeEngin){
		
		return enginRepository.findByType(TypeEngin.valueOf(typeEngin));
	}
	
	@CrossOrigin
	@RequestMapping(value="/findAll", method=RequestMethod.GET)
	public List<Engin> listeEngins(){
		return enginRepository.findAll();
	}
	
	@CrossOrigin
	@RequestMapping(value="/find/reference/{ref}", method=RequestMethod.GET)
	public Engin getEngin(@PathVariable("ref") String reference){
		return enginRepository.findByReference(reference);
	}
	
	@CrossOrigin
	@RequestMapping(value="/find/id/{id}", method=RequestMethod.GET)
	public Engin getId(@PathVariable("id") Long id){
		return enginRepository.findById(id);
	}
	
	@CrossOrigin
	@RequestMapping(value="/add", method=RequestMethod.POST)
	public Engin enregistrerEngin(@RequestBody Engin e){
		return enginRepository.save(e);
	}
	
	@CrossOrigin
	@RequestMapping(value="/delete/id/{id}", method=RequestMethod.DELETE)
	public void supprimerEngin(@PathVariable("id") Long id){
		enginRepository.delete(id);
	}
	
	@CrossOrigin
	@RequestMapping(value="/getAllTypes", method=RequestMethod.GET)
	public List<TypeEngin> getAllTypes(){
		return Arrays.asList(TypeEngin.values());
	}
	
	@CrossOrigin 
	@RequestMapping(value="/getAllEtats", method=RequestMethod.GET)
	public List<EtatEngin> getAllStates(){
		return Arrays.asList(EtatEngin.values());
	}
	
}











