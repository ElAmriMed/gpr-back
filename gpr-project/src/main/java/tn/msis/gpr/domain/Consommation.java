package tn.msis.gpr.domain;

import java.io.Serializable;
import java.math.BigDecimal;
import java.time.LocalDateTime;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Consommation implements Serializable{

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	private String matricule;

	private LocalDateTime dateVersement;

	private BigDecimal montant;

	private Integer km;

	public Consommation() {
	}

	public String getMatricule() {
		return matricule;
	}

	public void setMatricule(String matricule) {
		this.matricule = matricule;
	}

	public LocalDateTime getDateVersement() {
		return dateVersement;
	}

	public void setDateVersement(LocalDateTime dateVersement) {
		this.dateVersement = dateVersement;
	}

	public BigDecimal getMontant() {
		return montant;
	}

	public void setMontant(BigDecimal montant) {
		this.montant = montant;
	}

	public Integer getKm() {
		return km;
	}

	public void setKm(Integer km) {
		this.km = km;
	}

	public Long getId() {
		return id;
	}
	
	

}
