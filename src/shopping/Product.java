package shopping;

public class Product {
	private final String pCode;
	private final String bCode;
	private final String kCode;
	private final String name;
	private final int price;
	
	public Product(String pCode, String bCode, String kCode, String name, int price) {
		this.pCode = pCode;
		this.bCode = bCode;
		this.kCode = kCode;
		this.name = name;
		this.price = price;
	}
	
	public static Product[] defaultProducts() {
		Product[] products = null;
		
		return products;
	}
	
	public String getCategory() {
		return kCode;
	}
	
	public String getBrand() {
		return bCode;
	}
}
