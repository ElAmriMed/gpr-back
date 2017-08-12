package tn.msis.gpr.service.impl;

import java.time.LocalDateTime;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.Assert;

import tn.msis.gpr.domain.Engin;
import tn.msis.gpr.domain.HistoriqueEngin;
import tn.msis.gpr.domain.Maintenance;
import tn.msis.gpr.domain.Panne;
import tn.msis.gpr.repository.EnginRepository;
import tn.msis.gpr.repository.HistoriqueEnginRepository;
import tn.msis.gpr.repository.PanneRepository;
import tn.msis.gpr.service.HistorizeEnginService;

@Service
public class HistorizeEnginServiceImpl implements HistorizeEnginService {

	@Autowired
	private HistoriqueEnginRepository historiqueEnginRepository;
	
	@Autowired
	private EnginRepository enginRepository;
	
	@Autowired
	private PanneRepository panneRepository;

	@Override
	public void perform(final Engin engin) {

		HistoriqueEngin histo = new HistoriqueEngin();
		histo.setDateAction(LocalDateTime.now());
		histo.setEngin(engin.getMatricule());
		histo.setEtatEngin(engin.getEtat());
		histo.setKm(engin.getKm());
		
		historiqueEnginRepository.save(histo);
	}

	@Override
	public void perform(final Panne panne) {

		HistoriqueEngin histo = new HistoriqueEngin();
		histo.setDateAction(LocalDateTime.now());
		histo.setEngin(panne.getMatricule());
		// TODO histo.setEngin();
		histo.setEtatPanne(histo.getEtatPanne());
		// TODO histo.setEtatEngin();
		// TODO histo.setKm();
		
		historiqueEnginRepository.save(histo);
	}

	@Override
	public void perform(final Maintenance maintenance) {

		HistoriqueEngin histo = new HistoriqueEngin();
		
		histo.setDateAction(LocalDateTime.now());
		histo.setEngin(maintenance.getMatricule());
		// TODO histo.setEtatProjet();
		// TODO histo.setKm();
		
		
		historiqueEnginRepository.save(histo);
	}

}
