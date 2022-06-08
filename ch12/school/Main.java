package school;
import java.util.Arrays;
import java.util.Random;

public class Main {
	public static void main(String[] args) {
		int[][] ages = new int[][] {new int[]{1, 2, 3, 4, 5}, new int[]{11, 12, 13, 14, 15}};
		String[][] pNames = new String[][]{new String[]{"a", "b", "c", "d", "e"}, new String[] {"az", "bz", "cz", "dz", "ez"}};
		String[][] degrees = new String[][]{new String[] {"xdeg1", "xdeg2", "xdeg3", "deg2", "xdeg4"}, new String[] {"deg1", "deg2", "deg3", "deg2", "deg4"}};
		int[] ids = new int[] {1, 2};
		String[] rNames = new String[] {"r1", "r2"};
		String sName = "SSS";
		Random random = new Random();
		
		Room[] rooms = new Room[2];
		for(int i = 0; i < 2; i++) {
			Person[] people = new Person[5];
			for(int j = 0; j < 5; j++) {
				int randomValue = random.nextInt(3);
				if(randomValue == 0) {
					people[j] = (Person) new Doctor(pNames[i][j], degrees[i][j], ages[i][j]);
				}
				else if(randomValue == 1) {
					people[j] = (Person) new Lawer(pNames[i][j], degrees[i][j], ages[i][j]);
				}
				else {
					people[j] = (Person) new Soldier(pNames[i][j], degrees[i][j], ages[i][j]);
				}
			}
			rooms[i] = new Room(rNames[i], ids[i], people);
		}
				
		School school = new School(sName, rooms);
		school.printAllStudent();
		//school.printDegStudent("xdeg1");
	}
}
