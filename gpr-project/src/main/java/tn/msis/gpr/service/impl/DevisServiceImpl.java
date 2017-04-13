package tn.msis.gpr.service.impl;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import tn.msis.gpr.service.DevisService;

@Service("devisService")
public class DevisServiceImpl implements DevisService {

	private static final String UPLOADED_FOLDER = "D://uploaded//";

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

}
