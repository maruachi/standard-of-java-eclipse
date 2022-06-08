package Task;

import java.util.PriorityQueue;

//tag를 담을 수 있는 pool -> usable
//create, execute를 실행할 수 있는 class
//create, execute -> 연결할 수 있는 base class
//base class는 tag를 받아서 처리
//자세한 구현은 create, execute
//데이터는 누가? -> tag실패횟수, 실패한 tag들
//사용가능한 태그 -> tag

public class Main {
	public static void main(String[] args) {
		PriorityQueue<Tag> pq = new PriorityQueue<>();
		pq.add(new Tag(9));
		pq.add(new Tag(7));
		pq.add(new Tag(5));
		
		System.out.println(pq.poll());
	}
}

