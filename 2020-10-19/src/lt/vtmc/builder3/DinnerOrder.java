package lt.vtmc.builder3;

public class DinnerOrder { // StringBuilder
	private String bread;
	private String meat;
	private String butter;
	private String wine;
	private String tea;
	
	public DinnerOrder(DinnerBuilder order) {
		this.bread = order.getBread();
		this.meat = order.getMeat();
		this.butter = order.getButter();
		this.wine = order.getWine();
		this.tea = order.getTea();
	}
	
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		if (bread != null) {
			sb.append("Bread: " + bread + " 2 Eur \n");
		} 
		if(meat != null) {
			sb.append("Meat: " + meat + " 15 Eur \n");
		} 
		if(butter != null) {
			sb.append("Butter: " + butter + " 1.5 Eur \n");
		} 
		if(wine != null) {
			sb.append("Wine: " + wine + " 25 Eur \n");
		} 
		if (tea != null) {
			sb.append("Tea: " + tea + " 2.5 Eur \n");
		}
		
		return sb.toString();
	}
}










