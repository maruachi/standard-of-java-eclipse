package _20220519_assignment;

public class Main {
	public static void main(String[] args) {
		Account account1 = new Account("donggdfdsyu", 0);
		Document document = new Document("hello world", account1);
		document.read(account1);
	}
}