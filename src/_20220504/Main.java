package _20220504;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Main {
	public static void main(String[] args) {
		List l = new ArrayList();
		l.add("donggyu");
		l.add(1);
		l.add(true);
		
		System.out.println(l.get(0));
		System.out.println(l.get(1));
		System.out.println(l.get(2));
		
		printList(l);
		List<String> l2 = new ArrayList<String>();
		l2.add("dongs");
	}
	
	public static void printList(List l) {
	}
	
	public static void printList2(List<String> l) {
	}
}