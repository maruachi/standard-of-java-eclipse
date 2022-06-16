package Enum;

public class Card {
	enum Kind { CLOVER, HEART, DIAMOND, SPADE}; //typesafe enum
	enum Value { ONE, TWO, THREE, FOUR};
	enum Direction {EAST, SOUTH, WEST, NORTH};
	
	public static void main(String[] args) {
//		if(Kind.CLOVER == Value.ONE) {
//			System.out.println("Kind.CLOVER == Value.ONE is true");
//		}
//		else {
//			System.out.println("Kind.CLOVER == Value.ONE is false");
//		}
//		컴파일 에러
		
		Direction dir = Direction.EAST;
//		비교연산 사용불가
//		if(dir > Direction.EAST) {
//			
//		}
	}
}