package tn.msis.gpr.controller;

import java.util.List;

import org.dozer.DozerBeanMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import tn.msis.gpr.domain.Panne;
import tn.msis.gpr.repository.PanneRepository;

@RestController
@RequestMapping(value = "/panne")
public class PanneController {

	@Autowired
	private PanneRepository panneRepository;

	@Autowired
	private DozerBeanMapper dozerBeanMapper;

	@CrossOrigin
	@GetMapping("/findAll")
	public List<Panne> findAll() {
		List<Panne> list = panneRepository.findAll();

		return list;
	}

	@CrossOrigin
	@PostMapping("/add")
	public void add(@RequestBody tn.msis.gpr.entities.Panne panne) {

		Panne domain = dozerBeanMapper.map(panne, Panne.class);

		panneRepository.save(domain);
	}
}
