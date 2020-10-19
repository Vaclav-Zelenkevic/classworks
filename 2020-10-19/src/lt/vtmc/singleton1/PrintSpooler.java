package lt.vtmc.singleton1;

import java.util.List;

public class PrintSpooler { // Print service
	
	private static final PrintSpooler PRINT_SPOOLER = new PrintSpooler();
	private static boolean initialized = false;
	
	private PrintSpooler() {}
	
	public static synchronized PrintSpooler getInstance(){
		if (initialized) {
			return PRINT_SPOOLER;
		}
		PRINT_SPOOLER.start();
		initialized = true;
		return PRINT_SPOOLER;
	}

	private void start() {
		System.out.println("Print spooler initialized ...");
	}
	
	public void print(List<String> list) {
		System.out.println("Printing ...");
		System.out.println(list);
	}
}
