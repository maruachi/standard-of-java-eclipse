package Round;

public class Main {
	public static void main(String[] args) {
		RoundPool roundPool = RoundPool.createRounds(new String[]{"frist", "second", "last"});
		System.out.println(roundPool);
	}
}
