package lt.vtmc.shop;

public class Main {
	public static void main(String[] args) {
		ShoppingCart basket = new ShoppingCart();
//		Periodical periodical1 = new Periodical("Lietuvos rytas", 1.54);
//		Medicine medicine1 = new Medicine("Panadol", 3.65);
//		
//		basket.addItem(medicine1);
//		
//		System.out.println(periodical1.getPrice());
//		basket.addItem(periodical1);
		
		Product product1 =  new Product("Kazkas", 12.45);
		basket.addItem(product1);
		System.out.println(basket.getTotalPrice());
		
//		System.out.println(basket.getTotalPrice());
	}
}
