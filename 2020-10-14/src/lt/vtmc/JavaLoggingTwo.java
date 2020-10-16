package lt.vtmc;

import java.io.IOException;
import java.util.logging.FileHandler;
import java.util.logging.Level;
import java.util.logging.Logger;

public class JavaLoggingTwo {

	private static Logger logger = Logger.getLogger(JavaLoggingTwo.class.getName());
	
	public static void main(String[] args) {
		System.out.println(JavaLoggingTwo.class.getName());
		logger.setLevel(Level.CONFIG);
		System.out.println(logger.getLevel());
		logger.severe("Power lost - running on UPS"); // Server
		logger.warning("DB connection lost ..."); // App + DB + ...
		logger.info("App started!"); // App
		logger.fine("Screen control module started!"); // Modules
		logger.finer("Draw logo on screen ..."); // Classes
		logger.finest("Bubble sort started at value " + 58); // Methods
		Throwable throwable = new Throwable();
		logger.log(Level.WARNING, "Exception error message", throwable);
		
		try {
			logToFile();
		} catch (SecurityException | IOException e) {
			e.printStackTrace();
		}
	}

	private static void logToFile() throws SecurityException, IOException {
		boolean append = true;
		FileHandler handler = new FileHandler("programm.log", append);
		Logger fileLogger = Logger.getLogger("My beutiful logger");
		fileLogger.addHandler(handler);
		fileLogger.setLevel(Level.FINEST);
		fileLogger.severe("PC die ...");
		fileLogger.finest("My method work ...");
	}

}
