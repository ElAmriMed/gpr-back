package tn.msis.gpr.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import tn.msis.gpr.repository.EnginInformationRepository;

@CrossOrigin(origins = "http://192.168.1.8:4200")
@RestController
@RequestMapping(value = "/engin")
public class EnginInformationController {

	@Autowired
	private EnginInformationRepository repo;

	@CrossOrigin
	@GetMapping("/getAllMarques")
	public List<String> getAllMarques() {

		return repo.getAllMarques();
	}

	@CrossOrigin
	@GetMapping("/getAllModeles")
	public List<String> getAllModeles() {

		return repo.getAllModeles();
	}

	@CrossOrigin
	@GetMapping("/findAllModelesByMarque/{marque}")
	public List<String> findAllModelesByMarque(@PathVariable("marque") String marque) {

		return repo.getAllModelesByMarque(marque);
	}
}
