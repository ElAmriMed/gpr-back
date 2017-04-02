package tn.msis.gpr.entities;

public class Engin {

	private String type;

	private String matricule;

	private String marque;

	private String modele;

	private String etat;

	public Engin() {
		// TODO Auto-generated constructor stub
	}

	public Engin(String type, String matricule, String marque, String modele, String etat) {
		this.type = type;
		this.matricule = matricule;
		this.marque = marque;
		this.modele = modele;
		this.etat = etat;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
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

	public String getEtat() {
		return etat;
	}

	public void setEtat(String etat) {
		this.etat = etat;
	}

}
