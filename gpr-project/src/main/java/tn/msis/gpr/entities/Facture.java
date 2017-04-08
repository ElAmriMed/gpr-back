package tn.msis.gpr.entities;

import java.math.BigDecimal;
import java.time.LocalDateTime;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;

import tn.msis.gpr.deserializer.MyLocalDateTimeDeserializer;
import tn.msis.gpr.deserializer.MyLocalDateTimeSerializer;

public class Facture {

	@JsonProperty("facture")
	private String referenceFacture;

	@JsonDeserialize(using = MyLocalDateTimeDeserializer.class)
	@JsonSerialize(using = MyLocalDateTimeSerializer.class)
	private LocalDateTime dateCreationFacture;

	private BigDecimal cout;

	public Facture() {
	}

	public Facture(String referenceFacture, LocalDateTime dateCreationFacture, BigDecimal cout) {
		this.referenceFacture = referenceFacture;
		this.dateCreationFacture = dateCreationFacture;
		this.cout = cout;
	}

	public String getReferenceFacture() {
		return referenceFacture;
	}

	public void setReferenceFacture(String reference) {
		this.referenceFacture = reference;
	}

	public LocalDateTime getDateCreationFacture() {
		return dateCreationFacture;
	}

	public void setDateCreationFacture(LocalDateTime dateCreation) {
		this.dateCreationFacture = dateCreation;
	}

	public BigDecimal getCout() {
		return cout;
	}

	public void setCout(BigDecimal cout) {
		this.cout = cout;
	}
}
