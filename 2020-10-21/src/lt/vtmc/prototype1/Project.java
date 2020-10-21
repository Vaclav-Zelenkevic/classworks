package lt.vtmc.prototype1;

public class Project implements Copyable{
	private int id;
	private String projectName;
	private String sourceCode;
	private String summary;
	
	public Project(int id, String projectName, String sourceCode, String summary) {
		this.id = id;
		this.projectName = projectName;
		this.sourceCode = sourceCode;
		this.summary = summary;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getProjectName() {
		return projectName;
	}

	public void setProjectName(String projectName) {
		this.projectName = projectName;
	}

	public String getSourceCode() {
		return sourceCode;
	}

	public void setSourceCode(String sourceCode) {
		this.sourceCode = sourceCode;
	}

	public String getSummary() {
		return summary;
	}

	public void setSummary(String summary) {
		this.summary = summary;
	}
	
	

	@Override
	public String toString() {
		return "Project [id=" + id + ", projectName=" 
	+ projectName + ", sourceCode=" + sourceCode + ", summary="
				+ summary + "]";
	}

	@Override
	public Object copy() {
		Project copy = new Project(this.id, this.projectName, 
				this.sourceCode, this.summary);
		return copy;
	}
	
	
}
