package tn.msis.gpr.domain;

import java.io.Serializable;
import java.math.BigDecimal;
import java.time.LocalDateTime;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;

import tn.msis.gpr.deserializer.MyLocalDateTimeDeserializer;
import tn.msis.gpr.deserializer.MyLocalDateTimeSerializer;

@JsonInclude(value = Include.NON_NULL)
@Entity
public class Devis implements Serializable {

	@JsonIgnore
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	private String reference;

	private String matricule; // TODO elliminate

	private String panne;

	private String fichier;

	@JsonDeserialize(using = MyLocalDateTimeDeserializer.class)
	@JsonSerialize(using = MyLocalDateTimeSerializer.class)
	private LocalDateTime dateCreation;

	private String fournisseur;

	private BigDecimal cout;

	@JsonDeserialize(using = MyLocalDateTimeDeserializer.class)
	@JsonSerialize(using = MyLocalDateTimeSerializer.class)
	private LocalDateTime dateValidation;

	public Devis() {
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

	/**
	 * @return the panne
	 */
	public String getPanne() {
		return panne;
	}

	/**
	 * @param panne
	 *            the panne to set
	 */
	public void setPanne(String panne) {
		this.panne = panne;
	}

	/**
	 * @return the fichier
	 */
	public String getFichier() {
		return fichier;
	}

	/**
	 * @param fichier
	 *            the fichier to set
	 */
	public void setFichier(String fichier) {
		this.fichier = fichier;
	}

	public LocalDateTime getDateCreation() {
		return dateCreation;
	}

	public void setDateCreation(LocalDateTime dateCreation) {
		this.dateCreation = dateCreation;
	}

	public String getFournisseur() {
		return fournisseur;
	}

	public void setFournisseur(String fournisseur) {
		this.fournisseur = fournisseur;
	}

	public BigDecimal getCout() {
		return cout;
	}

	public void setCout(BigDecimal cout) {
		this.cout = cout;
	}

	public Long getId() {
		return id;
	}

	/**
	 * @return the dateValidation
	 */
	public LocalDateTime getDateValidation() {
		return dateValidation;
	}

	/**
	 * @param dateValidation
	 *            the dateValidation to set
	 */
	public void setDateValidation(LocalDateTime dateValidation) {
		this.dateValidation = dateValidation;
	}

}
