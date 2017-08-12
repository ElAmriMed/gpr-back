package tn.msis.gpr.service;

import tn.msis.gpr.domain.Engin;
import tn.msis.gpr.domain.Maintenance;
import tn.msis.gpr.domain.Panne;

public interface HistorizeEnginService {

	public void perform(final Engin engin);
	
	public void perform(final Panne panne);

	public void perform(final Maintenance maintenance);

}
