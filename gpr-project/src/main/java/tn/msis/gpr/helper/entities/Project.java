package tn.msis.gpr.helper.entities;

import java.math.BigDecimal;
import java.time.LocalDate;

import tn.msis.gpr.enums.EtatProjet;

public class Project {

	private String reference;
	
	private String type;
	
	private BigDecimal budget;

	private LocalDate estimateStart;
	
	private LocalDate start;
	
	private LocalDate finish;
	
	private EtatProjet etat;

	public String getReference() {
		return reference;
	}

	public void setReference(String reference) {
		this.reference = reference;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public BigDecimal getBudget() {
		return budget;
	}

	public void setBudget(BigDecimal budget) {
		this.budget = budget;
	}

	public LocalDate getEstimateStrat() {
		return estimateStart;
	}

	public void setEstimateStrat(LocalDate estimateStrat) {
		this.estimateStart = estimateStrat;
	}

	public LocalDate getStart() {
		return start;
	}

	public void setStart(LocalDate start) {
		this.start = start;
	}

	public LocalDate getFinish() {
		return finish;
	}

	public void setFinish(LocalDate finish) {
		this.finish = finish;
	}

	public EtatProjet getEtat() {
		return etat;
	}

	public void setEtat(EtatProjet etat) {
		this.etat = etat;
	}
	
	
}
