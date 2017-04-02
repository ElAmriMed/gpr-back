package tn.msis.gpr.domain;

import javax.persistence.Embeddable;

@Embeddable
public class Fournisseur {

	private Long id;

	private String nom;

	private String adresse;

	private String tel;

	private String compteBancaire;
}
