package _20220519;

public class EmailBox {
	private final String[] texts = new String[100];
	
	public void write(String text, Account account) {
		this.texts[(int)account.getId()] = account + text;
	}
	
	public String read(Account account) {
		String text = this.texts[(int)account.getId()];
		if(text == null) {
			return "";
		}
		return text;
	}
}