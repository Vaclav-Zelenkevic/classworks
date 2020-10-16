package lt.vtmc.examthree;

import lt.itakademija.exam.ProjectManager;
import lt.itakademija.exam.test.BaseTest;

public class SolutionsTest extends BaseTest {

	@Override
	protected ProjectManager createProjectTracker() {
		return new ProjectManagerImplementation();
	}


}
