package Round;

import java.text.MessageFormat;

public class Main {
	public static void main(String[] args) {
		RoundPool roundPool = RoundPool.createRounds(new String[]{"frist", "second", "last"});
		System.out.println(roundPool);
		System.out.println(MessageFormat.format("onRound: {0}", roundPool.onRound()));
		roundPool.nextRound();
		System.out.println(roundPool);
		System.out.println(MessageFormat.format("onRound: {0}", roundPool.onRound()));
		roundPool.skipRound();
		System.out.println(roundPool);
		System.out.println(MessageFormat.format("onRound: {0}", roundPool.onRound()));
		roundPool.nextRound();
		System.out.println(roundPool);
		System.out.println(MessageFormat.format("onRound: {0}", roundPool.onRound()));
		//System.out.println(MessageFormat.format("isFinal: {0}", roundPool.isFinal()));
	}
}
