package tn.msis.gpr.domain;

import java.io.Serializable;
import java.math.BigDecimal;
import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Embeddable;

@Embeddable
public class Facture implements Serializable {

	@Column(name = "facture")
	private String referenceFacture;

	private LocalDateTime dateCreationFacture;

	private BigDecimal cout;
	
	
	public Facture() { }

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
