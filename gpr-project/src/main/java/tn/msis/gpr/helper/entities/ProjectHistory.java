package tn.msis.gpr.helper.entities;

import java.time.LocalDateTime;

public class ProjectHistory {

	private String reference;
	
	private LocalDateTime dateAction;
	
	private Project project;

	public String getReference() {
		return reference;
	}

	public void setReference(String reference) {
		this.reference = reference;
	}

	public LocalDateTime getDateAction() {
		return dateAction;
	}

	public void setDateAction(LocalDateTime dateAction) {
		this.dateAction = dateAction;
	}

	public Project getProject() {
		return project;
	}

	public void setProject(Project project) {
		this.project = project;
	}
	
}
