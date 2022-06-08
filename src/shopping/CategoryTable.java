package shopping;

import java.util.HashMap;
import java.util.Map;

public class CategoryTable {
	private final Map<String, Product> categoryTable = new HashMap();
	
	public CategoryTable(Product[] products) {
		for(Product product : products) {
			categoryTable.put(product.getCategory(), product);
		}
	}
}
