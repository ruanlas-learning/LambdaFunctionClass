package entity;


public class Product {
	private String name;
	private Double price;
	
	public Product(String name, Double price) {
		this.name = name;
		this.price = price;
	}
	
	public Product() {
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Double getPrice() {
		return price;
	}
	public void setPrice(Double price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "Product [name=" + name + ", price=" + price + "]";
	}
	
	/*
	 * Lambda Functions
	 * */
	
	// Predicate
	public static boolean staticProductPredicate(Product p) {
		return p.getPrice() >= 100.0;
	}
	
	public boolean nomStaticProductPredicate() {
		return price >= 100.0;
	}
	
	//Consumer
	public static void staticPriceUpdate(Product p) {
		p.setPrice(p.getPrice() * 1.1);
	}
	
	public void nomStaticPriceUpdate() {
		this.price = this.price * 1.1;
	}
	
	//Function
	public static String staticUpperCaseName(Product p) {
		return p.getName().toUpperCase();
	}
	
	public String nomStaticUpperCaseName() {
		return this.name.toUpperCase();
	}
}
