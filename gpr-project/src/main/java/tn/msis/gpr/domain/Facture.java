package tn.msis.gpr.domain;

import java.io.Serializable;
import java.math.BigDecimal;
import java.time.LocalDateTime;

import javax.persistence.Embeddable;

@Embeddable
public class Facture implements Serializable {

	private String reference;

	private LocalDateTime dateCreation;

	private BigDecimal cout;

}
