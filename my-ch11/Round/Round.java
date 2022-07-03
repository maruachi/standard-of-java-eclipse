package Round;

import java.text.MessageFormat;
import java.util.Objects;

import Task.Tag;

public class Round {
	private final String name;
	private final int order;
	private final static int MAX_ROUND = 10;
	private final static int MAX_NAME_LENTGH = 10;
	
	public Round(String name, int order) {
		if(name == null) {
			throw new RuntimeException();
		}
		if(name.length() > MAX_NAME_LENTGH) {
			throw new RuntimeException();
		}
		if(order < 0 || order > MAX_ROUND) {
			throw new RuntimeException();
		}
		
		this.name = name;
		this.order = order;
	}
	
	
	public static Round previousRound() {
		return new Round("NotStart", 0);
	}
	
	public static Round endRound() {
		return new Round("End", 0);
	}
	
	public boolean isEnd() {
		if(Objects.equals(this, Round.endRound())) {
			return true;
		}
		return false;
	}
	
	public boolean isNotStart() {
		if(Objects.equals(this, Round.previousRound())) {
			return true;
		}
		return false;
	}
	
	@Override
	public String toString() {
		return MessageFormat.format("#{0}:{1}", this.order, this.name);
	}
	
	@Override
	public boolean equals(Object other) {
		if(this == other) {
			return true;
		}
		
		if(!(other instanceof Round)) {
			return false;
		}
		
		Round round = (Round) other;
		if(this.name == round.name && this.order == round.order) {
			return true;
		}
		
		return false;
	}
	
	
}
