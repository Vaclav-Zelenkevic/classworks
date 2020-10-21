package lt.vtmc.iterator1;

public class IteratorMain {

	public static void main(String[] args) {
		String[] skills = {"Write Hello world", "HTML", "CSS", "PHP"};
		JavaDeveloper javaDeveloper = new JavaDeveloper("Viktoras", skills);
		Iterator director = javaDeveloper.getIterator();
		while (director.hasNext()) {
			System.out.println(director.next().toString());
		}

	}

}
