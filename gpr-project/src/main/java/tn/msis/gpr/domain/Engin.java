package tn.msis.gpr.domain;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import tn.msis.gpr.enums.EtatEngin;
import tn.msis.gpr.enums.TypeEngin;

@Entity
@Table(name="engin")
public class Engin implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 4748497345082994988L;
	
	@Id 
	@Column(name="id", unique=true, nullable=false)
	@GeneratedValue(strategy=GenerationType.IDENTITY) 
	private Long id;
	@Column(name="reference", unique=true, nullable=false)
	private String reference;
	@Enumerated(EnumType.STRING)
	private TypeEngin type;
	@Column(name="immatriculation", unique=true, nullable=false)
	private String immatriculation;
	private String marque;
	private String categorie;
	@Enumerated (EnumType.STRING)
	private EtatEngin etat;
	private String carteGris;
	

	public Engin() {}
	
	public Engin(String reference, TypeEngin type, String immatriculation, String marque,
				String categorie, EtatEngin etat, String carteGris) {
		super();
		this.reference = reference;
		this.type = type;
		this.immatriculation = immatriculation;
		this.marque = marque;
		this.categorie = categorie;
		this.etat = etat;
		this.carteGris = carteGris;
		
	}

	/**
	 * @return the id
	 */
	public Long getId() {
		return id;
	}
	
	public TypeEngin getType() {
		return type;
	}

	public void setType(TypeEngin type) {
		this.type = type;
	}

	public String getReference() {
		return reference;
	}

	public void setReference(String referenceEngin) {
		this.reference = referenceEngin;
	}

	public String getImmatriculation() {
		return immatriculation;
	}

	public void setImmatriculation(String immatriculation) {
		this.immatriculation = immatriculation;
	}

	public String getMarque() {
		return marque;
	}

	public void setMarque(String marque) {
		this.marque = marque;
	}

	public String getCategorie() {
		return categorie;
	}

	public void setCategorie(String categorie) {
		this.categorie = categorie;
	}

	public EtatEngin getEtat() {
		return etat;
	}

	public void setEtat(EtatEngin etat) {
		this.etat = etat;
	}

	public String getCarteGris() {
		return carteGris;
	}

	public void setCarteGris(String carteGris) {
		this.carteGris = carteGris;
	}

}
	