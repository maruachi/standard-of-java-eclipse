package stream;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.StandardCharsets;

public class Main {
	public static void main(String[] args) throws IOException {
		String s = "abcd";
		byte[] bytes = s.getBytes(StandardCharsets.UTF_8);
		System.out.println(bytes.length);
		
		InputStream inputStream = new FileInputStream("test.txt");
		
		byte[] buffer = new byte[3];
		int len = inputStream.read(buffer);
		String string = new String(buffer, 0, len, StandardCharsets.UTF_8);
		System.out.println(string);
		
		len = inputStream.read(buffer);
		string = new String(buffer, 0, len, StandardCharsets.UTF_8);
		System.out.println(string);
	}
}