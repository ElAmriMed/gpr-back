package tn.msis.gpr.entities;

import java.time.LocalDateTime;
import java.util.List;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;

import tn.msis.gpr.deserializer.MyLocalDateTimeDeserializer;
import tn.msis.gpr.deserializer.MyLocalDateTimeSerializer;

public class Panne {

	private String reference;

	private String matricule;

	@JsonDeserialize(using = MyLocalDateTimeDeserializer.class)
	@JsonSerialize(using = MyLocalDateTimeSerializer.class)
	private LocalDateTime dateOccurence;

	private String cause;

	private String description;

	private Reparation reparation;

	private Facture facture;

	private List<String> referencesDevis;

	private String etat;

	public Panne() {
	}

	public Panne(String reference, String matricule, LocalDateTime dateOccurence, String cause, String description,
			Reparation reparation, Facture facture, List<String> referencesDevis) {
		super();
		this.reference = reference;
		this.matricule = matricule;
		this.dateOccurence = dateOccurence;
		this.cause = cause;
		this.description = description;
		this.reparation = reparation;
		this.facture = facture;
		this.referencesDevis = referencesDevis;
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

	/**
	 * @return the referencesDevis
	 */
	public List<String> getReferencesDevis() {
		return referencesDevis;
	}

	/**
	 * @param refDevisList
	 *            the referencesDevis to set
	 */
	public void setReferencesDevis(List<String> refDevisList) {
		this.referencesDevis = refDevisList;
	}

	/**
	 * @return the etat
	 */
	public String getEtat() {
		return etat;
	}

	/**
	 * @param etat the etat to set
	 */
	public void setEtat(String etat) {
		this.etat = etat;
	}

}
