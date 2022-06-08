package ch8.Exception;

public class ExceptionEx1 {
	public static void main(String[] args) {
		try {
			try {
				
			}
			catch(Exception e) {
				
			}
		}
		catch(Exception e) {
			try {
				
			}
			catch(Exception e1) { //e로 쓰면 안 된다 상단 catch문에서 주소가 같아진다.
				
			}
		}
		
		try {
			
		}
		catch(Exception e) {
			
		}
	}
}
