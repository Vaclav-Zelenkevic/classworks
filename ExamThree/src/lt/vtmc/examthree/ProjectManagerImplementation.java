package lt.vtmc.examthree;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import lt.itakademija.exam.Issue;
import lt.itakademija.exam.Project;
import lt.itakademija.exam.ProjectManager;

public class ProjectManagerImplementation implements ProjectManager {

	private List<Project> projects = new ArrayList<>();
	
	@Override
	public Issue createIssue(Project arg0, String arg1) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Issue createIssue(String arg0, String arg1) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Project createProject(String id, String summary) {
		if (id == null || summary == null) {
			throw new NullPointerException();
		} else if (id.equals("") || summary.equals("")){
			throw new IllegalArgumentException();
		}
		Project newProject = new Project(id, summary);
		projects.add(newProject);
		return newProject;
	}

	@Override
	public Collection<Issue> getIssues(Project arg0) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Collection<Issue> getIssues(String arg0) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Project getProjectById(String id) {
		for (Project project : projects) {
			if (project.getId().equals(id)){
				return project;
			}
		}
		return null;
	}

	@Override
	public Collection<Project> getProjects() {
		return projects;
	}

}
