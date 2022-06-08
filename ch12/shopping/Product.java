package shopping;

public class Product {
	private final String code;
	private final String name;
	private final int price;
	
	public Product(String code, String name, int price) {
		this.code = code;
		this.name = name;
		this.price = price;
	}
	
	public static Product[] defaultProducts() {
		Product[] products = null;
		
		return products;
	}
}
