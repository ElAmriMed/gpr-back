package tn.msis.gpr.domain;

import java.math.BigDecimal;
import java.time.LocalDateTime;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import tn.msis.gpr.enums.TypeAssurance;

@Entity
public class Assurance {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	private String reference;

	private String matricule;

	private LocalDateTime dateCreation;

	private LocalDateTime dateFin;

	private TypeAssurance type;

	private BigDecimal tarif;

}
