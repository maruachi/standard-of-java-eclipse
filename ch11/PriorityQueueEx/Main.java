package PriorityQueueEx;

import java.util.PriorityQueue;
import java.util.Queue;

public class Main {
	public static void main(String[] args) {
		Queue<Integer> pq = new PriorityQueue<>();
		pq.offer(3);
		pq.offer(new Integer(1));
		pq.offer(new Integer(2));
		pq.offer(new Integer(5));
		pq.offer(new Integer(4));
		System.out.println(pq);
		
		Object obj = null;
		
		while((obj = pq.poll()) != null) {
			System.out.println(pq);
		}
	}
}
