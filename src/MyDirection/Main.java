package MyDirection;

public class Main {
	public static void main(String[] args) {
		Position p1 = new Position(1, 2);
		Position p2 = new Position(2, 3);
		
		System.out.println(p1);
		System.out.println(p2);
		
		Direction[] dirs = p1.findDirectionTo(p2);
		
		for(Direction dir : dirs) {
			if(dir == null) {
				continue;
			}
			System.out.print(dir.name() + " ");
		}
		
		System.out.println();
	}
}
