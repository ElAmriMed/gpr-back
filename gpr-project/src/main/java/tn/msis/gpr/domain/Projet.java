package tn.msis.gpr.domain;

import java.io.Serializable;
import java.math.BigDecimal;
import java.time.LocalDateTime;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import tn.msis.gpr.enums.EtatProjet;

@Entity
public class Projet implements Serializable{

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
	
	
	public Projet() { }

	public String getReference() {
		return reference;
	}

	public void setReference(String reference) {
		this.reference = reference;
	}

	public LocalDateTime getDateDebutEstime() {
		return dateDebutEstime;
	}

	public void setDateDebutEstime(LocalDateTime dateDebutEstime) {
		this.dateDebutEstime = dateDebutEstime;
	}

	public LocalDateTime getDateFinEstime() {
		return dateFinEstime;
	}

	public void setDateFinEstime(LocalDateTime dateFinEstime) {
		this.dateFinEstime = dateFinEstime;
	}

	public LocalDateTime getDateDebut() {
		return dateDebut;
	}

	public void setDateDebut(LocalDateTime dateDebut) {
		this.dateDebut = dateDebut;
	}

	public LocalDateTime getDateFin() {
		return dateFin;
	}

	public void setDateFin(LocalDateTime dateFin) {
		this.dateFin = dateFin;
	}

	public BigDecimal getCoutEstime() {
		return coutEstime;
	}

	public void setCoutEstime(BigDecimal coutEstime) {
		this.coutEstime = coutEstime;
	}

	public BigDecimal getCout() {
		return cout;
	}

	public void setCout(BigDecimal cout) {
		this.cout = cout;
	}

	public String getLocalisation() {
		return localisation;
	}

	public void setLocalisation(String localisation) {
		this.localisation = localisation;
	}

	public EtatProjet getEtat() {
		return etat;
	}

	public void setEtat(EtatProjet etat) {
		this.etat = etat;
	}

	public Long getId() {
		return id;
	}
	
	
}
