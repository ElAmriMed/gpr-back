package tn.msis.gpr.domain;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class EnginInformation implements Serializable {

	@Id
	@GeneratedValue

	private Long id;

	private String modele;

	private String marque;

	public EnginInformation() {
	}

	/**
	 * @return the id
	 */
	public Long getId() {
		return id;
	}

	/**
	 * @return the modele
	 */
	public String getModele() {
		return modele;
	}

	/**
	 * @return the marque
	 */
	public String getMarque() {
		return marque;
	}

	/**
	 * @param modele
	 *            the modele to set
	 */
	public void setModele(String modele) {
		this.modele = modele;
	}

	/**
	 * @param marque
	 *            the marque to set
	 */
	public void setMarque(String marque) {
		this.marque = marque;
	}

}
