package lt.vtmc.prototype1;

public class ProjectCreateCopies {
	Project project;

	public ProjectCreateCopies(Project project) {
		this.project = project;
	}
	
	public void setProject(Project project) {
		this.project = project;
	}
	
	Project cloneProject() {
		return (Project) project.copy();
	}
	
}
