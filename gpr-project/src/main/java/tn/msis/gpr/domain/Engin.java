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
@Table(name = "engin")
public class Engin implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 4748497345082994988L;

	@Id
	@Column(name = "id", unique = true, nullable = false)
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@Enumerated(EnumType.STRING)
	private TypeEngin type;

	@Column(name = "matricule", unique = true, nullable = false)
	private String matricule;

	private String marque;

	private String modele;

	@Enumerated(EnumType.STRING)
	private EtatEngin etat;

	public Engin() {
	}

	public Engin(TypeEngin type, String matricule, String marque, String modele, EtatEngin etat) {
		super();
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
