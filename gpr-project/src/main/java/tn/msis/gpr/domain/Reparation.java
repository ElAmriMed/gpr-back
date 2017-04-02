package tn.msis.gpr.domain;

import java.io.Serializable;
import java.time.LocalDateTime;

import javax.persistence.Embeddable;
import javax.persistence.Embedded;

@Embeddable
public class Reparation implements Serializable {

	private LocalDateTime dateDebutReparation;

	private LocalDateTime dateFinReparation;
	
	
	
	public Reparation() { }

	public LocalDateTime getDateDebutReparation() {
		return dateDebutReparation;
	}

	public void setDateDebutReparation(LocalDateTime dateDebut) {
		this.dateDebutReparation = dateDebut;
	}

	public LocalDateTime getDateFinReparation() {
		return dateFinReparation;
	}

	public void setDateFinReparation(LocalDateTime dateFin) {
		this.dateFinReparation = dateFin;
	}
	
	
}
