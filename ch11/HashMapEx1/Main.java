package HashMapEx1;

import java.util.HashMap;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		HashMap map = new HashMap();
		
		map.put("myId", "1234");
		map.put("asdf", "1111");
		map.put("asdf", "1234");
		
		Scanner s = new Scanner(System.in);
		
		while(true) {
			System.out.println("Enter id and password");
			System.out.print("id: ");
			String id = s.nextLine().trim();
			
			System.out.print("password : ");
			String password = s.nextLine().trim();
			System.out.println();
			
			if(id.equals("")) {
				System.out.println("The empty is not id");
				continue; 
			}
			
			
			if(!map.containsKey(id)) {
				System.out.println("This id do not exist. Enter again your id");
			}
			if(!(map.get(id)).equals(password)) {
				System.out.println("Not consistent password. Enter again your password");
			}
			else {
				System.out.println("password consistent with id");
				break;
			}
		}
	}
}
