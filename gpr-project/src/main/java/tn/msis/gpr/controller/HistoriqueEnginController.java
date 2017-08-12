package tn.msis.gpr.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import tn.msis.gpr.domain.HistoriqueEngin;
import tn.msis.gpr.repository.HistoriqueEnginRepository;

@RestController
public class HistoriqueEnginController {

	@Autowired
	private HistoriqueEnginRepository historiqueEnginRepository;
	
	@GetMapping("/all/{refEngin}")
	public List<HistoriqueEngin> findByEngin(@PathVariable final String refEngin) {
		
		return historiqueEnginRepository.findByEngin(refEngin);
	}
	
}
