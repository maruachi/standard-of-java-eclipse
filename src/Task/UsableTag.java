package Task;

import java.util.List;
import java.util.PriorityQueue;

public class UsableTag {
	private final PriorityQueue<Tag> pq = new PriorityQueue<>();
	private static final int TAG_START = 1;
	private static final int TAG_END = 9;
	private final boolean[] unUsableTags = new boolean[TAG_END+1];
	
	public UsableTag() {
		List<Tag> tags = Tag.defaultTags();
		
		for(Tag tag : tags) {
			this.pq.add(tag);
		}
	}
	
	public Tag use() {
		Tag usedTag = pq.poll();
		return usedTag;
	}
}
