package StackEx1;

import java.util.Stack;

public class Main {
	public static Stack back = new Stack();
	public static Stack forward = new Stack();
	
	public static void main(String[] args) {
		goURL("1. nate");
		goURL("2. yahoo");
		goURL("3. naver");
		goURL("4. daum");
		
		printStatus();
		
		goBack();
		System.out.println("= '뒤로' 버튼을 누룬 후 =");
		printStatus();
		
		goBack();
		System.out.println("= 'back' after click button =");
		printStatus();
		
		goForward();
		System.out.println("= 'forward' after click button =");
		printStatus();
		
		goURL("codechobo.com");
		System.out.println("= go to new url =");
		printStatus();
		
		
	}
	
	public static void printStatus() {
		System.out.println("back:"+back);
		System.out.println("forward:"+forward);
		System.out.println("Current display :" + back.peek());
		System.out.println();
	}
	
	public static void goURL(String url) {
		back.push(url);
		if(!forward.empty()) {
			forward.clear();
		}
	}
	
	public static void goForward() {
		if(!forward.empty()) {
			back.push(forward.pop());
		}
	}
	
	public static void goBack() {
		if(!back.empty()) {
			forward.push(back.pop());
		}
	}
}
