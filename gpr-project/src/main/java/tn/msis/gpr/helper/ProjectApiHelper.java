package tn.msis.gpr.helper;


import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

import tn.msis.gpr.enums.EtatProjet;
import tn.msis.gpr.helper.entities.Project;
import tn.msis.gpr.helper.entities.ProjectHistory;

@Component
public class ProjectApiHelper {

	/**
	 * @return
	 */
	public List<Project> getAllProject() {
		
		List<Project> projects = new ArrayList<>();
		
		for(int i=0;i<5;i++) {
			
			Project p = new Project();
			p.setEtat(EtatProjet.PROGRAMME);
			p.setBudget(new BigDecimal(i*5000));
			p.setType("TYPE "+i);
			p.setEstimateStrat(LocalDate.now().plusWeeks(i));

		}
		return projects;
	}
	
	/**
	 * @param refProject
	 * @return
	 */
	public List<ProjectHistory> getHistoryByProject(final String refProject) {
		
		List<ProjectHistory> hitorix = new ArrayList<>();
		
		
		
		return hitorix;
	}
	
	/**
	 * @param refProject
	 */
	public void qualifyProject(final String refProject) {
		
	}		
}
