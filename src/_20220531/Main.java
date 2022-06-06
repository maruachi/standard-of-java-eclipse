package _20220531;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Main {	
	public static void main(String[] args) {
		List<String> strings = new ArrayList<>();
//		Set<String> strings = new TreeSet<>();
		strings.add("dong");
		strings.add("gyu");
		strings.add("last");
		
		Iterator<String> iterator = strings.iterator();
		
		while(iterator.hasNext()) {
			String string = iterator.next();
			iterator.remove();
			System.out.println(strings);
		}
		
//		Map<String, Integer> integers = new HashMap<>();
//		
//		integers.put("key1", 1);
//		integers.put("key2", 2);
//		integers.put("key3", 3);
//		
//		Set<String> keys = integers.keySet();
//		Iterator<String> iterator = keys.iterator();
//		
//		while(iterator.hasNext()) {
//			String key = iterator.next();
//			iterator.remove();
//			System.out.println(integers);
//		}
//		
//		Collection<Integer> c = integers.values();
//		Iterator<Integer> iteratorInteger = c.iterator();
//		
//		while(iteratorInteger.hasNext()) {
//			int value = iteratorInteger.next();
//			System.out.println(value);
//		}
//		
//		Set<Entry<String, Integer>> entries = integers.entrySet();
//		Iterator<Entry<String, Integer>> entryIterator = entries.iterator();
//		
//		while(entryIterator.hasNext()) {
//			Entry<String, Integer> entry = entryIterator.next();
//			System.out.println(entry.getKey() + ", " + entry.getValue());
//		}
//		
//		for(Entry<String, Integer> entry : entries) {
//			
//		}
//		
//		iterator.remove()
	}
}