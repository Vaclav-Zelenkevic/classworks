package lt.vtmc.prototype1;

public class PrototypeMain {
	public static void main(String[] args) {
		Project project = new Project(1, "Patterns", "GitHub", "Crazy days ...");
		ProjectCreateCopies projectCreateCopies = new ProjectCreateCopies(project);
		
		Project cloneProjectOne = projectCreateCopies.cloneProject();
		Project cloneProjectTwo = projectCreateCopies.cloneProject();
		
		System.out.println(project.equals(cloneProjectOne));
		
		cloneProjectOne.setId(2);
	}
}
