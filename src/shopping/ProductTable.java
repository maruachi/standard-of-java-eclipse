package shopping;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class ProductTable {
	private final Set<Product> products = new HashSet();
	private final Map<String, Product> categoryTable = new HashMap();
	private final Map<String, Product> brandTable = new HashMap();
	
	public ProductTable() {
		Product[] defaultProducts = Product.defaultProducts();
		for(int i = 0; i < defaultProducts.length; i++) {
			products.add(defaultProducts[i]);
		}
	}
}
