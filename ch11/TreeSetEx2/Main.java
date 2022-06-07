package TreeSetEx2;

import java.util.TreeSet;

public class Main {
	public static void main(String[] args) {
		TreeSet set = new TreeSet();
		int[] score = {80, 95, 50, 35, 45, 65, 10, 100};
		
		for(int i = 0; i < score.length; i++) {
			set.add(new Integer(score[i]));
		}
		
		System.out.println("more than 50 : " + set.headSet(new Integer(50)));
		System.out.println("less than 50 : " + set.tailSet(new Integer(50)));
 	}
}
