package FruitBoxEx3;

import java.util.ArrayList;

public class Main {
	public static void main(String[] args) {
		FruitBox<Fruit> fruitBox = new FruitBox<Fruit>();
		FruitBox<Apple> appleBox = new FruitBox<Apple>();
		
		fruitBox.add(new Apple());
		fruitBox.add(new Grape());
		appleBox.add(new Apple());
		appleBox.add(new Apple());
		
		System.out.println(Juicer.makeJuice(fruitBox));
		System.out.println(Juicer.makeJuice(appleBox));
	}
}

class Juicer{
	private Juicer(){
		
	}
	
	static Juice makeJuice(FruitBox<? extends Fruit> box) {
		String tmp = "";
		
		for(Fruit f : box.getList()) {
			tmp += f + " ";
		}
		return new Juice(tmp);
	}
}

class Juice{
	String name;
	Juice(String name){	
		this.name = name + "Juice";
	}
	public String toStirng() {
		return name;
	}
}

class Fruit {
	@Override
	public String toString() {
		return "Fruit";
	}
}

class Apple extends Fruit{
	@Override
	public String toString() {
		return "Apple";
	}
}

class Grape extends Fruit{
	@Override
	public String toString() {
		return "Grape";
	}
}

class FruitBox<T extends Fruit> extends Box<T>{

}

class Box<T>{
	ArrayList<T> list = new ArrayList<T>();
	void add(T item) {
		list.add(item);
	}
	T get(int i) {
		return list.get(i);
	}
	int size() {
		return list.size();
	}
	ArrayList<T> getList(){
		return list;
	}
	public String toString() {
		return list.toString();
	}
}