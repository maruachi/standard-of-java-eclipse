package ch8.Exception;

public class ExceptionEx6 {
	public static void main(String args[]) {
		System.out.println(1);
		System.out.println(2);
		
		try {
			System.out.println(3); //여기까지 실행된다.
			System.out.println(0/0); 
			System.out.println(4);
		}
		catch(Exception ae) {
			System.out.println(5);
		}
		System.out.println(6);
	}
}
