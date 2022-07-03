package Round;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;

public class RoundPool {
	private final List<Round> rounds;
	private Round currentRound;
	private Iterator<Round> iterRound;
	
	private RoundPool(List<Round> rounds) {
		if(rounds == null) {
			throw new RuntimeException();
		}
		if(rounds.size() == 0) {
			throw new RuntimeException();
		}
		
		this.rounds = rounds;
		this.iterRound = rounds.iterator();
		this.currentRound = iterRound.next(); 
	}
	
	public static RoundPool createRounds(String[] names) {
		List<Round> rounds = new ArrayList<>();
		
		rounds.add(Round.previousRound());
		int order = 1;
		for(String name : names) {
			rounds.add(new Round(name, order++));
		}
		rounds.add(Round.endRound());
		
		return new RoundPool(rounds);
	}
	
	public void nextRound() {
		if(this.iterRound == null) {
			throw new RuntimeException();
		}
		this.currentRound = this.iterRound.next();
	}
	
	public void skipRound() {
	}
	
	public boolean onRound() {
		if(this.currentRound.isNotStart() || this.currentRound.isEnd()) {
			return false;
		}
		return true;
	}
	
	public boolean isFinal() {
		if(!iterRound.hasNext()) {
			return false;
		}
		if(iterRound.next().isEnd()) {
			return true;
		}
		return false;
	}
	
	public void init() {
		this.iterRound = rounds.iterator();
		this.currentRound = iterRound.next();
	}
	
	public String toString() {
		String str = "";
		int cnt = 0;
		for(Round round : rounds) {
			if(Objects.equals(round, this.currentRound)) {
				str += "[" + round + "]";
			}
			else {
				str += round;
			}
			cnt++;
			if(cnt != rounds.size()) {
				str += " -> ";
			}
		}
		return str;
	}
	
}
