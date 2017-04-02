package tn.msis.gpr.domain;

import java.io.Serializable;
import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Panne implements Serializable {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)

	@Column(name = "id")
	private Integer idPanne;

	@Column(name = "reference_panne")
	private String referencePanne;

	@Column(name = "date_panne")
	private LocalDateTime datePanne;

	public Integer getIdPanne() {
		return idPanne;
	}

	public void setIdPanne(Integer idPanne) {
		this.idPanne = idPanne;
	}

	public String getReferencePanne() {
		return referencePanne;
	}

	public void setReferencePanne(String referencePanne) {
		this.referencePanne = referencePanne;
	}

	public LocalDateTime getDatePanne() {
		return datePanne;
	}

	public void setDatePanne(LocalDateTime datePanne) {
		this.datePanne = datePanne;
	}

}
