package ListIteratorEx1;

import java.util.ArrayList;
import java.util.ListIterator;

public class Main {
	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<String>();
		list.add("1");
		list.add("2");
		list.add("3");
		list.add("4");
		list.add("5");
		
		ListIterator it = list.listIterator();
		
		while(it.hasNext()) {
			System.out.print(it.next());
		}
		System.out.println();
		
		while(it.hasPrevious()) {
			System.out.print(it.previous());
		}
		System.out.println();
		
		it.next();
		it.next();
		it.remove();
		it.next();
		it.remove();
		
		System.out.println(list);
	}
}
