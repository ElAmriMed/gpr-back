package tn.msis.gpr.domain;

import java.io.Serializable;
import java.time.LocalDateTime;

import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;

import tn.msis.gpr.deserializer.MyLocalDateTimeDeserializer;
import tn.msis.gpr.deserializer.MyLocalDateTimeSerializer;

@Entity
public class Panne implements Serializable {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	private String reference;

	private String matricule;

	@JsonDeserialize(using = MyLocalDateTimeDeserializer.class)
	@JsonSerialize(using = MyLocalDateTimeSerializer.class)
	private LocalDateTime dateOccurence;

	private String cause;

	private String description;

	@Embedded
	private Reparation reparation;

	@Embedded
	private Facture facture;

	public Panne() {
	}

	public Panne(String reference, String matricule, LocalDateTime dateOccurence, String cause, String description,
			Reparation reparation, Facture facture) {

		this.reference = reference;
		this.matricule = matricule;
		this.dateOccurence = dateOccurence;
		this.cause = cause;
		this.description = description;
		this.reparation = reparation;
		this.facture = facture;
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
