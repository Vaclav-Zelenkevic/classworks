package lt.vtmc.singleton1;

import java.util.ArrayList;
import java.util.List;

public class TaskManager {

	public static void main(String[] args) {
		PrintSpooler printSpooler1 = PrintSpooler.getInstance();
		System.out.println(printSpooler1);
		PrintSpooler printSpooler2 = PrintSpooler.getInstance();
		System.out.println(printSpooler2);
		
		List<String> names = new ArrayList<>();
		names.add("Tomas");
		names.add("Dave");
		names.add("Murka");
		
		printSpooler1.print(names);
	}

}
