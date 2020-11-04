package lt.vtmc.enumerate;

import java.util.ArrayList;
import java.util.List;

public class Basket {

	public static void main(String[] args) {
		List<Product> products = new ArrayList<>();
		products.add(new Product(2.45, "Duona"));
		products.add(new Product(0.79, "Pienas"));

		double sum = 0.0d;

		for (Product product : products) {
			sum += product.getPriceWithVat();
		}

		System.out.println(sum);
	}

}
