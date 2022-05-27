package _20220512;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

public class Main {
	public static void main(String[] args) {
		//Person p = new Person("donggyu", 30);
		Person p = null;
		Person p2 = new Person("donggyu", 30);
		System.out.println(p);
		Set<Person> people = new HashSet<>();
		people.add(p);
		System.out.println(people);
		System.out.println(people.contains(p2));
//		System.out.println(p.equals(p2));
//		System.out.println(p2.equals(p));
		System.out.println(Objects.equals(p, p2));
	}
}