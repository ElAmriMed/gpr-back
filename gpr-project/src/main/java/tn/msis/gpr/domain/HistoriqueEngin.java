package tn.msis.gpr.domain;

import java.time.LocalDateTime;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

import tn.msis.gpr.enums.EtatEngin;
import tn.msis.gpr.enums.EtatPanne;
import tn.msis.gpr.enums.EtatProjet;

/**
 * A denormilized class for historizing Engin activity.
 * 
 * @author monta
 */
@JsonInclude(value = Include.NON_NULL)
@Entity
public class HistoriqueEngin {

	@JsonIgnore
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	private String engin;
	
	private LocalDateTime dateAction;
	
	private EtatEngin etatEngin;
	
	private EtatPanne etatPanne;
	
	private EtatProjet etatProjet;
	
	private Integer km;
	
	private String projet;
	
	private String panne;
	
	private String maintenanace;
	
	private String reparation;
	
	private String assurance;

	public Long getId() {
		return id;
	}
	
	public String getEngin() {
		return engin;
	}

	public void setEngin(String engin) {
		this.engin = engin;
	}

	public LocalDateTime getDateAction() {
		return dateAction;
	}

	public void setDateAction(LocalDateTime dateAction) {
		this.dateAction = dateAction;
	}

	public EtatEngin getEtatEngin() {
		return etatEngin;
	}

	public void setEtatEngin(EtatEngin etatEngin) {
		this.etatEngin = etatEngin;
	}

	public EtatPanne getEtatPanne() {
		return etatPanne;
	}

	public void setEtatPanne(EtatPanne etatPanne) {
		this.etatPanne = etatPanne;
	}

	public EtatProjet getEtatProjet() {
		return etatProjet;
	}

	public void setEtatProjet(EtatProjet etatProjet) {
		this.etatProjet = etatProjet;
	}

	public Integer getKm() {
		return km;
	}

	public void setKm(Integer km) {
		this.km = km;
	}

	public String getProjet() {
		return projet;
	}

	public void setProjet(String projet) {
		this.projet = projet;
	}

	public String getPanne() {
		return panne;
	}

	public void setPanne(String panne) {
		this.panne = panne;
	}

	public String getMaintenanace() {
		return maintenanace;
	}

	public void setMaintenanace(String maintenanace) {
		this.maintenanace = maintenanace;
	}

	public String getReparation() {
		return reparation;
	}

	public void setReparation(String reparation) {
		this.reparation = reparation;
	}

	public String getAssurance() {
		return assurance;
	}

	public void setAssurance(String assurance) {
		this.assurance = assurance;
	}
	
}


