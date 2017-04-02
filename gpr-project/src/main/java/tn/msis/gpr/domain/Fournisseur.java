package tn.msis.gpr.domain;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Fournisseur implements Serializable{

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	private String reference;

	private String nom;

	private String adresse;

	private String tel;

	private String compteBancaire;
	
	
	public Fournisseur() { }

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getAdresse() {
		return adresse;
	}

	public void setAdresse(String adresse) {
		this.adresse = adresse;
	}

	public String getTel() {
		return tel;
	}

	public void setTel(String tel) {
		this.tel = tel;
	}

	public String getCompteBancaire() {
		return compteBancaire;
	}

	public void setCompteBancaire(String compteBancaire) {
		this.compteBancaire = compteBancaire;
	}

	public Long getId() {
		return id;
	}
	
	
}
