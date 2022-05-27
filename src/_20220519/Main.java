package _20220519;

public class Main {
	public static void main(String[] args) {
		EmailBox emailBox = new EmailBox();
		Account acc1 = new Account(0, "dongyu");
		Account acc2 = new Account(1, "gyudong");
		Email email = new Email(emailBox);
		
		email.send(acc1, acc2, "hello world");
		
		
//		Account writer = new Account(0, "donggyu");
//		Account reader1 = new Account(1, "reader1");
//		Account reader2 = new Account(2, "reader2");
//		Account reader3 = new Account(3, "reader3");
//		
		Document document = new Document("First Docuemnt", acc1);
		document.share(acc2);
		
		document.read(acc1);
		document.read(acc2);
//		document.share(reader2);
//		
//		Account[] accounts = new Account[] {writer, reader1, reader2, reader3};
//		
//		for(Account account : accounts) {
//			document.read(account);
//		}
//		
//		document.read(email1);
	}
}
