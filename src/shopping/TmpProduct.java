package shopping;

public class TmpProduct {
	private final String code;
	private final String name;
	private final int price;
	
	public TmpProduct(String code, String name, int price) {
		this.code = code;
		this.name = name;
		this.price = price;
	}
	
	public TmpProduct[] defaultProducts() {
		TmpProduct[] products = new TmpProduct[] {
				new TmpProduct("P001", "스마트폰", 100000),
				new TmpProduct("P002", "노트북", 150000),
				new TmpProduct("P003", "모자", 20000),
				new TmpProduct("P004", "상의", 40000),
				new TmpProduct("P005", "하의", 30000),
				new TmpProduct("P006", "샴푸", 10000),
				new TmpProduct("P007", "비누", 10000),
				new TmpProduct("P008", "수건", 50000),
		};
		
		return products;
	}
}
