package _20220504;

public class Person implements Job, Age {
	@Override
	public String getName() {
		return "hello";
	}
	
	@Override
	public int getAge() {
		return 30;
	}
}
