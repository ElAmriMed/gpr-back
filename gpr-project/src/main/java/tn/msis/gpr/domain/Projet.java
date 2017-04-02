package tn.msis.gpr.domain;

import java.math.BigDecimal;
import java.time.LocalDateTime;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import tn.msis.gpr.enums.EtatProjet;

@Entity
public class Projet {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	private String reference;

	private LocalDateTime dateDebutEstime;

	private LocalDateTime dateFinEstime;

	private LocalDateTime dateDebut;

	private LocalDateTime dateFin;

	private BigDecimal coutEstime;

	private BigDecimal cout;

	private String localisation;

	private EtatProjet etat;
}
