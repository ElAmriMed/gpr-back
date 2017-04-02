package tn.msis.gpr.domain;

import java.math.BigDecimal;
import java.time.LocalDateTime;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Consommation {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	private String matricule;

	private LocalDateTime dateVersement;

	private BigDecimal montant;

	private Integer km;

	public Consommation() {
	}

}
