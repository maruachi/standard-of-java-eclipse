package Round;

import java.text.MessageFormat;

import Task.Tag;

public class Round {
	private final String name;
	private final int order;
	
	public Round(String name, int order) {
		if(name == null) {
			throw new RuntimeException();
		}
		if(name.length() > 10) {
			throw new RuntimeException();
		}
		if(order < 1 || order > 10) {
			throw new RuntimeException();
		}
		
		this.name = name;
		this.order = order;
	}
	
	
	public static Round previousRound() {
		return new Round("NotStart", 0);
	}
	
	public static Round endRound() {
		return new Round("End", -1);
	}
	
	public boolean isEnd() {
		if(this.order == 0) {
			return true;
		}
		return false;
	}
	
	public boolean isNotStart() {
		if(this.order == -1) {
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
