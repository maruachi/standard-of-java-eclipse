package HashMapEx2;

//collection과 collections의 차이?

import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class Main {
	public static void main(String[] args) {
		HashMap map = new HashMap();
		map.put("김자바", new Integer(100));
		map.put("박자바", new Integer(100));
		map.put("강자바", new Integer(90));
		map.put("안자바", new Integer(80));
		
		Set set = map.entrySet();
		Iterator it = set.iterator();
		
		while(it.hasNext()){
			Map.Entry e = (Map.Entry) it.next();
			System.out.println("name :" + e.getKey() + ", 점수 : " + e.getValue()	);
		}
		
		set = map.keySet();
		System.out.println("Entry list : " + set);
		
		Collection values = map.values();
		it = values.iterator();
		
		int total = 0;
		while(it.hasNext()) {
			Integer i = (Integer) it.next();
			total += i.intValue();
		}
		
		System.out.println("total :" + total);
		System.out.println("ave : " + (float)total/set.size());
		System.out.println("Max score : " + Collections.max(values));
		System.out.println("Min score : " + Collections.min(values));
	}
}
