package _20220519;

import java.text.MessageFormat;

public class LogUtills {
	private LogUtills() {
		
	}
	
	public static void print(String pattern, Object... args) {
		System.out.println(MessageFormat.format(pattern, args));
	}
}
