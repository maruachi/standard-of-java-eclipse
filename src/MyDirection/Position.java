package MyDirection;

public class Position{
	final int x;
	final int y;
	
	public Position(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	public Direction[] findDirectionTo(Position position) {
		Direction[] directions = new Direction[] {null, null};
		
		if(this.x > position.x) {
			directions[0] = Direction.EAST;
		}
		else if (this.x < position.x) {
			directions[0] = Direction.WEST;
		}
		
		if(this.y > position.y) {
			directions[1] = Direction.SOUTH;
		}
		else if (this.y < position.y) {
			directions[1] = Direction.NORTH;
		}
		
		return directions;
	}
	
	@Override
	public String toString() {
		return "(" + this.x + ", " + this.y + ")";
	}
}
