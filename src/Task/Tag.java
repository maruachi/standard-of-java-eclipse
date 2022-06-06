package Task;

import java.util.ArrayList;
import java.util.List;

public class Tag implements Comparable<Tag>{
	private final int num;
	
	public Tag(int num) {
		this.num = num;
	}
	
	public static List<Tag> defaultTags() {
		List<Tag> tags = new ArrayList<>();
		
		for(int value = 1; value <= 9; value++) {
			tags.add(new Tag(value));
		}
		
		return tags;
	}
	
	@Override
	public String toString() {
		return Integer.toString(this.num);
	}
	
	@Override
	public boolean equals(Object o) {
		if(o == null) {
			return false;
		}
		if(this == o) {
			return true;
		}
		if(!(o instanceof Tag)) {
			return false;
		}
		
		Tag other = (Tag) o;
		return other.num == this.num; 
	}

	@Override
	public int compareTo(Tag o) {
		return this.num - o.num;
	}
}
