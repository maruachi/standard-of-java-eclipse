package IteratorEx1;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Main {
	public static void main(String[] args) {
		ArrayList list = new ArrayList();
		
		list.add("1");
		list.add("3");
		list.add("2");
		list.add("4");
		list.add("5");
		
		Iterator it = list.iterator();
		
		System.out.println("List");
		while(it.hasNext()) {
			Object obj = it.next();
			System.out.println(obj);
		}
		
		Set set = new HashSet();
		set.add("2");
		set.add("1");
		set.add("3");
		set.add("4");
		set.add("5");
		System.out.println("Set");

		it = list.iterator();
		
		while(it.hasNext()) {
			Object obj = it.next();
			System.out.println(obj);
		}
	}
}
