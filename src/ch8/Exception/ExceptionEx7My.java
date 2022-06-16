package ch8.Exception;

public class ExceptionEx7My {
	public static void main(String args[]) {
		System.out.println(1);
		System.out.println(2);
		
		try {
			System.out.println(3); //여기까지 실행된다.
			System.out.println(0/0); 
			System.out.println(4);
		}
		catch(Exception ae) {
//			if(ae instanceof ArithmeticException) {
//				System.out.println("true");
//			}
			System.out.println("ArithmeticExeption");
		}
		catch(ArithmeticException e) { //전체 예외 처리가 먼저 나오는 경우 세부예외처리를 뒤에 놓을 수 없다.
			System.out.println("Exception");
		}
		System.out.println(6);
	}
}
