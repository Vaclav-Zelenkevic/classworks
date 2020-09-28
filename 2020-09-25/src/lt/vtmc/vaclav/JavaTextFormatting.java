package lt.vtmc.vaclav;

import java.util.Date;
import java.util.Locale;

public class JavaTextFormatting {

	public static void main(String[] args) {
		
		System.out.printf("%S%n%s%n", "Hello", "World!");
		// s -String
		// d - decimal point numbers
		// f - float point numbers
		// t - time and date 
		// c - char
		double db = 12.578978978779879798;
		System.out.printf("%S%1.4f%n", "Mano: ", db);
		System.out.printf(Locale.ITALY, "%S%1.4f%n", "Mano: ", db);
		long lg = 10000L;
		System.out.printf(Locale.US, "%d%n", lg);
		System.out.format(Locale.US, "%020d%n", lg);
		Date date = new Date();
		System.out.printf("%tT%n", date);
	}

}
