package lt.vtmc.patterns;

public class Office {

	public static void main(String[] args) {
		System.out.println(ApplicationLogger.getApplicationLogger());
		ApplicationLogger.addLogInfo("I am Office application ...");
		
		AdobeReader adobe = new AdobeReader();
		adobe.getAdobe();
		ApplicationLogger.showAllLog();
	}

}
