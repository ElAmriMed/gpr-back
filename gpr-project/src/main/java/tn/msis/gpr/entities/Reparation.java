package tn.msis.gpr.entities;

import java.time.LocalDateTime;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;

import tn.msis.gpr.deserializer.MyLocalDateTimeDeserializer;
import tn.msis.gpr.deserializer.MyLocalDateTimeSerializer;

public class Reparation {

	@JsonDeserialize(using = MyLocalDateTimeDeserializer.class)
	@JsonSerialize(using = MyLocalDateTimeSerializer.class)
	private LocalDateTime dateDebutReparation;

	@JsonDeserialize(using = MyLocalDateTimeDeserializer.class)
	@JsonSerialize(using = MyLocalDateTimeSerializer.class)
	private LocalDateTime dateFinReparation;

	public Reparation() {
	}

	public Reparation(LocalDateTime dateDebutReparation, LocalDateTime dateFinReparation) {

		this.dateDebutReparation = dateDebutReparation;
		this.dateFinReparation = dateFinReparation;
	}

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
