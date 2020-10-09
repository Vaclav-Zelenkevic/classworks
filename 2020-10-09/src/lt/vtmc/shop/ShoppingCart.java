package lt.vtmc.shop;

public class ShoppingCart {
//	private AbstractProduct[] items;
	private Product[] productItems;
	private int productIndex = 0; 
	private Medicine[] medicineItems;
	private int medicineIndex = 0; 
	private Periodical[] periodicalItems;
	private int periodicalIndex = 0; 

	public ShoppingCart() {
	}

	public void addItem(AbstractProduct item) {
		if (item instanceof Product) {
			productItems = new Product[10]; // Homework!!!
			productItems[productIndex] = (Product) item;
			productIndex++;
		} else if (item instanceof Medicine) {
			medicineItems[medicineIndex] = (Medicine)item;
			medicineIndex++;
		} else {
			periodicalItems[periodicalIndex] = (Periodical)item;
			periodicalIndex++;
		}
	}
	
	public double getTotalPrice() {
		double totalPrice = 0;
		for (Product product : productItems) {
			totalPrice += product.getPrice();
		}
		for (Medicine medicine : medicineItems) {
			totalPrice += medicine.getPrice();
		}
		for (Periodical periodical : periodicalItems) {
			totalPrice += periodical.getPrice();
		}
		return totalPrice;
	}
}
