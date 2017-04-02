package tn.msis.gpr.domain;

import java.io.Serializable;
import java.time.LocalDateTime;

import javax.persistence.Embeddable;
import javax.persistence.Embedded;

@Embeddable
public class Reparation implements Serializable {

	private LocalDateTime dateDebut;

	private LocalDateTime dateFin;

	@Embedded
	private Facture facture;
}
