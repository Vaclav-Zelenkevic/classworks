package lt.vtmc.patterns;

public class ApplicationLogger {
	
	private static ApplicationLogger applicationLogger;
	private static String logSummary = "My nice logger ... \n";
	
	private ApplicationLogger() {}
	
	public synchronized static ApplicationLogger getApplicationLogger() {
		if (applicationLogger == null) {
			applicationLogger = new ApplicationLogger();
		}
		return applicationLogger;
	}
	
	public static void addLogInfo(String message) {
		logSummary += message + "\n";
	}
	
	public static void showAllLog() {
		System.out.println(logSummary);
	}

}
