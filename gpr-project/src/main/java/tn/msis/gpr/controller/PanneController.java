package tn.msis.gpr.controller;

import java.util.ArrayList;
import java.util.List;

import org.dozer.DozerBeanMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import tn.msis.gpr.entities.Panne;
import tn.msis.gpr.repository.PanneRepository;

@CrossOrigin(origins = "http://192.168.1.8:4200")
@RestController
@RequestMapping(value = "/panne")
public class PanneController {

	@Autowired
	private PanneRepository panneRepository;

	@Autowired
	private DozerBeanMapper dozerBeanMapper;

	@GetMapping("/findAll")
	public List<Panne> findAll() {
		List<Panne> destinations = new ArrayList<>();
		List<tn.msis.gpr.domain.Panne> sources = panneRepository.findAll();

		for (tn.msis.gpr.domain.Panne source : sources) {
			destinations.add(dozerBeanMapper.map(source, Panne.class));
		}

		return destinations;
	}

	@PostMapping("/add")
	public void add(@RequestBody tn.msis.gpr.entities.Panne panne) {

		tn.msis.gpr.domain.Panne domain = dozerBeanMapper.map(panne, tn.msis.gpr.domain.Panne.class);

		panneRepository.save(domain);
	}

	@GetMapping("/findByMatricule/{matricule}")
	public List<Panne> findByMatricule(@PathVariable String matricule) {

		List<Panne> destinations = new ArrayList<>();
		List<tn.msis.gpr.domain.Panne> sources = panneRepository.findByMatricule(matricule);

		for (tn.msis.gpr.domain.Panne source : sources) {
			destinations.add(dozerBeanMapper.map(source, Panne.class));
		}

		return destinations;
	}

	@PutMapping("/update")
	public void update(@RequestBody tn.msis.gpr.entities.Panne panne) {

		tn.msis.gpr.domain.Panne domain = dozerBeanMapper.map(panne, tn.msis.gpr.domain.Panne.class);

		panneRepository.save(domain);
	}
}
