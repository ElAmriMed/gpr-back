package tn.msis.gpr.domain;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import tn.msis.gpr.enums.EtatEngin;
import tn.msis.gpr.enums.TypeEngin;

@Entity
public class Engin implements Serializable {

	private static final long serialVersionUID = 4748497345082994988L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@Enumerated(EnumType.STRING)
	private TypeEngin type;

	@Column(unique = true, nullable = false)
	private String matricule;

	private String marque;

	private String modele;

	@Enumerated(EnumType.STRING)
	private EtatEngin etat;

	public Engin() {
		// TODO Auto-generated constructor stub
	}

	public Engin(TypeEngin type, String matricule, String marque, String modele, EtatEngin etat) {
		this.type = type;
		this.matricule = matricule;
		this.marque = marque;
		this.modele = modele;
		this.etat = etat;
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

	public String getmatricule() {
		return matricule;
	}

	public void setmatricule(String matricule) {
		this.matricule = matricule;
	}

	public String getMarque() {
		return marque;
	}

	public void setMarque(String marque) {
		this.marque = marque;
	}

	public String getmodele() {
		return modele;
	}

	public void setmodele(String modele) {
		this.modele = modele;
	}

	public EtatEngin getEtat() {
		return etat;
	}

	public void setEtat(EtatEngin etat) {
		this.etat = etat;
	}

}
