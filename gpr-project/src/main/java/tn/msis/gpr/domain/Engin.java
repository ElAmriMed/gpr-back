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

	private String carburant;

	private String projet;

	public Engin() { }

	public Engin(TypeEngin type, String matricule, String marque, String modele, EtatEngin etat) {
		this.type = type;
		this.matricule = matricule;
		this.marque = marque;
		this.modele = modele;
		this.etat = etat;
	}

	/**
	 * @return the serialversionuid
	 */
	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	/**
	 * @return the id
	 */
	public Long getId() {
		return id;
	}

	/**
	 * @return the type
	 */
	public TypeEngin getType() {
		return type;
	}

	/**
	 * @return the matricule
	 */
	public String getMatricule() {
		return matricule;
	}

	/**
	 * @return the marque
	 */
	public String getMarque() {
		return marque;
	}

	/**
	 * @return the modele
	 */
	public String getModele() {
		return modele;
	}

	/**
	 * @return the etat
	 */
	public EtatEngin getEtat() {
		return etat;
	}

	/**
	 * @param type
	 *            the type to set
	 */
	public void setType(TypeEngin type) {
		this.type = type;
	}

	/**
	 * @param matricule
	 *            the matricule to set
	 */
	public void setMatricule(String matricule) {
		this.matricule = matricule;
	}

	/**
	 * @param marque
	 *            the marque to set
	 */
	public void setMarque(String marque) {
		this.marque = marque;
	}

	/**
	 * @param modele
	 *            the modele to set
	 */
	public void setModele(String modele) {
		this.modele = modele;
	}

	/**
	 * @param etat
	 *            the etat to set
	 */
	public void setEtat(EtatEngin etat) {
		this.etat = etat;
	}

}
