package tn.msis.gpr.converter;

import org.dozer.DozerConverter;

import tn.msis.gpr.domain.Facture;
import tn.msis.gpr.domain.Panne;
import tn.msis.gpr.domain.Reparation;
import tn.msis.gpr.enums.EtatPanne;

public class PanneConverter extends DozerConverter<Panne, tn.msis.gpr.entities.Panne> {

	public PanneConverter() {
		super(Panne.class, tn.msis.gpr.entities.Panne.class);
	}

	@Override
	public Panne convertFrom(tn.msis.gpr.entities.Panne source, Panne destination) {

		Panne panne = new Panne();

		panne.setReference(source.getReference());
		panne.setMatricule(source.getMatricule());
		panne.setDateOccurence(source.getDateOccurence());
		panne.setCause(source.getCause());
		panne.setDescription(source.getDescription());
		if (source.getEtat() != null) {
			panne.setEtat(EtatPanne.valueOf(source.getEtat()));

		}
		if (source.getReparation() != null) {
			panne.setReparation(new Reparation(source.getReparation().getDateDebutReparation(),
					source.getReparation().getDateFinReparation()));
		}
		if (source.getFacture() != null) {
			new Facture(source.getFacture().getReferenceFacture(), source.getFacture().getDateCreationFacture(),
					source.getFacture().getCout());
		}
		return panne;

	}

	@Override
	public tn.msis.gpr.entities.Panne convertTo(Panne source, tn.msis.gpr.entities.Panne destination) {

		tn.msis.gpr.entities.Panne panne = new tn.msis.gpr.entities.Panne();

		panne.setReference(source.getReference());
		panne.setMatricule(source.getMatricule());
		panne.setDateOccurence(source.getDateOccurence());
		panne.setCause(source.getCause());
		panne.setDescription(source.getDescription());
		if (source.getEtat() != null) {
			panne.setEtat(source.getEtat().name());

		}
		if (source.getReparation() != null) {
			panne.setReparation(new tn.msis.gpr.entities.Reparation(source.getReparation().getDateDebutReparation(),
					source.getReparation().getDateFinReparation()));
		}
		if (source.getFacture() != null) {
			new tn.msis.gpr.entities.Facture(source.getFacture().getReferenceFacture(),
					source.getFacture().getDateCreationFacture(), source.getFacture().getCout());
		}
		return panne;
	}

}
