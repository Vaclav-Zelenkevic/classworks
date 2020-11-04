package lt.vtmc.enumerate;

public class JavaEnumTester {

	public static void main(String[] args) {
		Season seasons = Season.SPRING;

		switch (seasons) {
		case SPRING:
			System.out.println("It is spring (" + seasons.getTranslation() + ") now!");
			break;
		case SUMMER:
			System.out.println("It is summer now!");
			break;
		case AUTUMN:
			System.out.println("It is autumn now!");
			break;
		case WINTER:
			System.out.println("It is winter now!");
			break;
		default:
			System.out.println("No seasons ...");
		}

		System.out.println(seasons.name());
		System.out.println(seasons.getTemperature());
		System.out.println(Season.valueOf("WINTER").getTemperature());

		for (Season season : Season.values()) {
			System.out.print(season.name() + ":" + season.getTemperature() + " ");
		}
		System.out.println();
		System.out.println(Season.WINTER.equals(Season.WINTER));

	}

}
