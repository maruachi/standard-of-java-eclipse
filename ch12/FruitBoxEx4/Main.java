package FruitBoxEx4;

import java.util.ArrayList;
import java.util.Comparator;

class Fruit{
	String name;
	int weight;
	
	Fruit(String name, int weight){
		this.name = name;
		this.weight = weight;
	}
	
	public String toString() {
		return name+"("+weight+")";
	}
}

class Apple extends Fruit{
	Apple(String name, int weight){
		super(name, weight);
	}
}

class Grape extends Fruit{
	Grape(String name, int weight){
		super(name, weight);		
	}
}

class FruitComp implements Comparator<Fruit>{
	public int compare(Fruit t1, Fruit t2) {
		return t1.weight - t2.weight;
	}                                                                                                                                                                                                                               
}
class FruitBox<T extends Fruit> extends Box<T> {
	
}

class Box<T> {
	ArrayList<T> list = new ArrayList<T>();
	
	void add(T item) {
		list.add(item);
	}
	
	T get(int i) {
		return list.get(i);
	}
	
	ArrayList<T> getList(){
		return list;
	}
	
	int size() {
		return list.size();
	}
	
	public String toString() {
		return list.toString();
	}
}

public class Main {
	public static void main(String[] args) {
		
	}
}
