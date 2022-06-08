package ch8.Exception;

public class ExceptionEx7 {
	public static void main(String args[]) {
		System.out.println(1);
		System.out.println(2);
		
		try {
			System.out.println(3); //여기까지 실행된다.
			System.out.println(0/0); 
			System.out.println(4);
		}
		catch(ArithmeticException ae) {
			if(ae instanceof ArithmeticException) {
				System.out.println("true");
			}
			System.out.println("ArithmeticExeption");
		}
		catch(Exception e) {
			System.out.println("Exception");
		}
		System.out.println(6);
	}
}
