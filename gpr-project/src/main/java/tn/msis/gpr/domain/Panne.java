package tn.msis.gpr.domain;

import java.io.Serializable;
import java.time.LocalDateTime;

import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Panne implements Serializable {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	private String reference;

	private String matricule;

	private LocalDateTime dateOccurence;

	private String cause;

	private String description;

	@Embedded
	private Reparation reparation;

	@Embedded
	private Facture facture;
	

	public Panne() {
	}

	public String getReference() {
		return reference;
	}

	public void setReference(String reference) {
		this.reference = reference;
	}

	public String getMatricule() {
		return matricule;
	}

	public void setMatricule(String matricule) {
		this.matricule = matricule;
	}

	public LocalDateTime getDateOccurence() {
		return dateOccurence;
	}

	public void setDateOccurence(LocalDateTime dateOccurence) {
		this.dateOccurence = dateOccurence;
	}

	public String getCause() {
		return cause;
	}

	public void setCause(String cause) {
		this.cause = cause;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Reparation getReparation() {
		return reparation;
	}

	public void setReparation(Reparation reparation) {
		this.reparation = reparation;
	}

	public Facture getFacture() {
		return facture;
	}

	public void setFacture(Facture facture) {
		this.facture = facture;
	}

	public Long getId() {
		return id;
	}
	
	

}
