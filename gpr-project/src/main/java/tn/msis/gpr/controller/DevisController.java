package tn.msis.gpr.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import tn.msis.gpr.domain.Devis;
import tn.msis.gpr.repository.DevisRepository;
import tn.msis.gpr.service.DevisService;

@Controller
public class DevisController {

	@Autowired
	private DevisService devisService;

	@Autowired
	private DevisRepository devisRepository;

	@GetMapping("/")
	public String index() {
		return "uploadForm";
	}

	// @GetMapping("/")
	// public String listUploadedFiles(Model model) throws IOException {
	//
	// model.addAttribute("files",
	// devisService.loadAll()
	// .map(path -> MvcUriComponentsBuilder
	// .fromMethodName(FileUploadController.class, "serveFile", path.getFileName().toString())
	// .build().toString())
	// .collect(Collectors.toList()));
	//
	// return "uploadForm";
	// }

	// @GetMapping("/files/{filename:.+}")
	// @ResponseBody
	// public ResponseEntity<Resource> serveFile(@PathVariable String filename) {
	//
	// Resource file = devisService.loadAsResource(filename);
	// return ResponseEntity.ok()
	// .header(HttpHeaders.CONTENT_DISPOSITION, "attachment; filename=\"" + file.getFilename() + "\"")
	// .body(file);
	// }

	@PostMapping("/create")
	public void create(@RequestBody Devis devis) {

		devisRepository.save(devis);
	}

	@PostMapping("/upload")
	public String handleFileUpload(@RequestParam("file") MultipartFile file, RedirectAttributes redirectAttributes) {

		if (file.isEmpty()) {
			redirectAttributes.addFlashAttribute("message", "Please select a file to upload");
			return "redirect:/";
		}

		devisService.upload(file);

		redirectAttributes.addFlashAttribute("message",
				"You successfully uploaded " + file.getOriginalFilename() + "!");

		return "redirect:/";
	}

	// @ExceptionHandler(StorageFileNotFoundException.class)
	// public ResponseEntity handleStorageFileNotFound(StorageFileNotFoundException exc) {
	// return ResponseEntity.notFound().build();
	// }

	@GetMapping("/devis/find/panne/{refPanne}")
	@ResponseBody
	public List<Devis> findByMatriculeInPanne(@PathVariable("refPanne") String refPanne) {

		return devisRepository.findByPanne(refPanne);
	}

	@PostMapping("/devis/{ref}/validate")
	public void update(@PathVariable("ref") String reference) {

		devisService.validate(reference);
	}

}