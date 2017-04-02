package tn.msis.gpr.converter;

import org.dozer.DozerConverter;

import tn.msis.gpr.domain.Engin;
import tn.msis.gpr.enums.EtatEngin;
import tn.msis.gpr.enums.TypeEngin;

public class EnginConverter extends DozerConverter<Engin, tn.msis.gpr.entities.Engin> {

	public EnginConverter() {
		super(Engin.class, tn.msis.gpr.entities.Engin.class);
	}

	@Override
	public Engin convertFrom(tn.msis.gpr.entities.Engin entity, Engin domain) {

		return new Engin(TypeEngin.valueOf(entity.getType()), entity.getmatricule(), entity.getMarque(),
				entity.getmodele(), EtatEngin.valueOf(entity.getEtat()));
	}

	@Override
	public tn.msis.gpr.entities.Engin convertTo(Engin domain, tn.msis.gpr.entities.Engin entity) {

		return new tn.msis.gpr.entities.Engin(domain.getType().name(), domain.getmatricule(), domain.getMarque(),
				domain.getmodele(), domain.getEtat().name());
	}

}
