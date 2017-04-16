package tn.msis.gpr.service;

import org.springframework.web.multipart.MultipartFile;

public interface DevisService {

	public void upload(MultipartFile file);

	public void validate(String reference);

}
