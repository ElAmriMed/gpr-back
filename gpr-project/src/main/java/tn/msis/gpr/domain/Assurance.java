package tn.msis.gpr.domain;

import java.io.Serializable;
import java.math.BigDecimal;
import java.time.LocalDateTime;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import tn.msis.gpr.enums.TypeAssurance;

@Entity
public class Assurance implements Serializable{

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	private String reference;

	private String matricule;

	private LocalDateTime dateCreation;

	private LocalDateTime dateFin;

	private TypeAssurance type;

	private BigDecimal tarif;
	
	public Assurance() { }

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
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

	public LocalDateTime getDateCreation() {
		return dateCreation;
	}

	public void setDateCreation(LocalDateTime dateCreation) {
		this.dateCreation = dateCreation;
	}

	public LocalDateTime getDateFin() {
		return dateFin;
	}

	public void setDateFin(LocalDateTime dateFin) {
		this.dateFin = dateFin;
	}

	public TypeAssurance getType() {
		return type;
	}

	public void setType(TypeAssurance type) {
		this.type = type;
	}

	public BigDecimal getTarif() {
		return tarif;
	}

	public void setTarif(BigDecimal tarif) {
		this.tarif = tarif;
	}
	
	

}
