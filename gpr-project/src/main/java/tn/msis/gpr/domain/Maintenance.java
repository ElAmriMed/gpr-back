package tn.msis.gpr.domain;

import java.io.Serializable;
import java.time.LocalDateTime;

import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Maintenance implements Serializable{

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	private String reference;

	private String matricule;

	private LocalDateTime dateDebut;

	private LocalDateTime dateFin;

	@Embedded
	private Facture facture;
	
	
	public Maintenance() { }

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
