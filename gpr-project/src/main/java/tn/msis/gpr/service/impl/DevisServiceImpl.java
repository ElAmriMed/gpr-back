package tn.msis.gpr.service.impl;

import static tn.msis.gpr.enums.EtatPanne.ATTENTE_VALIDATION_DEVIS;
import static tn.msis.gpr.enums.EtatPanne.DEVIS_VALIDE;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.time.LocalDateTime;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.multipart.MultipartFile;

import tn.msis.gpr.domain.Devis;
import tn.msis.gpr.repository.DevisRepository;
import tn.msis.gpr.repository.PanneRepository;
import tn.msis.gpr.service.DevisService;

@Service("devisService")
public class DevisServiceImpl implements DevisService {

	private static final String UPLOADED_FOLDER = "D://uploaded//";

	@Autowired
	private DevisRepository devisRepository;

	@Autowired
	private PanneRepository panneRepository;

	@Override
	public void upload(MultipartFile file) {

		try {

			byte[] bytes = file.getBytes();
			Path path = Paths.get(UPLOADED_FOLDER + file.getOriginalFilename());
			Files.write(path, bytes);

		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	@Override
	@Transactional
	public void validate(String refDevis) {

		Devis devis = devisRepository.findByReference(refDevis);
		// check for null
		if (devis == null) {
			return;
		}
		// find the 3 devis of the panne
		List<Devis> devisList = devisRepository.findByPanne(devis.getPanne());

		// prepare idempotent validation
		for (Devis d : devisList) {
			devisRepository.updateDateValidation(d.getReference(), null);
			panneRepository.findByRefAndUpdateState(devis.getPanne(), ATTENTE_VALIDATION_DEVIS);
		}
		// do classic validation
		devisRepository.updateDateValidation(refDevis, LocalDateTime.now());
		panneRepository.findByRefAndUpdateState(devis.getPanne(), DEVIS_VALIDE);
	}

}
