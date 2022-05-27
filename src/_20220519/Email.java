package _20220519;

import java.text.MessageFormat;

public class Email{
	private final EmailBox emailBox;
	
	public Email(EmailBox emailBox) {
		this.emailBox = emailBox;
	}
	
	public void send(Account from, Account to, String textMessage) {
		LogUtills.print("[send] from {0} to {1} text : {2}", from, to, textMessage);
		emailBox.write(textMessage, to);
		LogUtills.print("[Receive] to {0} from {1}  text : {2}", to, from, emailBox.read(to));
	}
}
