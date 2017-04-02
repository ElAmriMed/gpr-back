package tn.msis.gpr.domain;

import java.time.LocalDateTime;

import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Maintenance {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	private String reference;

	private String matricule;

	private LocalDateTime dateDebut;

	private LocalDateTime dateFin;

	@Embedded
	private Facture facture;

}
