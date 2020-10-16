package lt.vtmc.examtwo;

import com.eisgroup.javaexam.library.Library;
import com.eisgroup.javaexam.library.test.BaseLibraryTest;

public class SolutionsTest extends BaseLibraryTest {

	@Override
	protected Library getLibrary() {
		// Create own library object
		return new LibraryImplementation();
	}

}
