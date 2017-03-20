package tn.msis.gpr.domain;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.joda.time.LocalDate;
@Entity
@Table(name="panne")
public class Panne implements Serializable{
	@Id 
	@GeneratedValue(strategy= GenerationType.IDENTITY) 
	@Column(name="id_panne")
	private Integer idPanne;
	@Column(name="reference_panne")
	private String referencePanne;
	@Column(name="date_panne")
	private LocalDate datePanne;
	
	public Panne(){
		
	}
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
	public LocalDate getDatePanne() {
		return datePanne;
	}
	public void setDatePanne(LocalDate datePanne) {
		this.datePanne = datePanne;
	}
	
}
