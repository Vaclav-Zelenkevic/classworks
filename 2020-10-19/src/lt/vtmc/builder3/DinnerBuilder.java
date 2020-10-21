package lt.vtmc.builder3;

public class DinnerBuilder {
	private String bread;
	private String meat;
	private String butter;
	private String wine;
	private String tea;
	
	public DinnerBuilder() {}
	
	public DinnerBuilder bread(String bread) {
		this.bread = bread;
		return this;
	}
	
	public DinnerBuilder meat(String meat) {
		this.meat = meat;
		return this;
	}
	
	public DinnerBuilder butter(String butter) {
		this.butter = butter;
		return this;
	}
	
	public DinnerBuilder wine(String wine) {
		this.wine = wine;
		return this;
	}
	
	public DinnerBuilder tea(String tea) {
		this.tea = tea;
		return this;
	}

	public String getBread() {
		return bread;
	}

	public String getMeat() {
		return meat;
	}

	public String getButter() {
		return butter;
	}

	public String getWine() {
		return wine;
	}

	public String getTea() {
		return tea;
	}

	public DinnerOrder build() {
		return new DinnerOrder(this);
	}
	
}
