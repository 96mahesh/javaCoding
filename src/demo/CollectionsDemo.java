package demo;

import java.util.*;
import java.util.Map.Entry;
public class CollectionsDemo {

	public static void main(String[] args) {
		
		Map<String, Integer> mp = new HashMap<>();
		mp.put("Mahesh", 95);
		mp.put("Dinesh", 90);
		mp.put("Kavya", 89);
		mp.put("Prasad", 85);
		mp.put("Ram", 80);
		
		Collection<Integer> val = mp.values();
		System.out.println(val);
		Set<String> key = mp.keySet();
		System.out.println(key);
		
		List<Integer> al = new ArrayList<>();
		for (Integer in : val) {
			al.add(in);
		}
		System.out.println(al);
		
		Collections.sort(al);
		int size = al.get(al.size()-1);
		System.out.println(size);
		
		Set<Entry<String, Integer>> ent = mp.entrySet();
		for (Entry<String, Integer> e : ent) {
			if(e.getValue()==size)
			System.out.println(e.getKey()+" "+e.getValue());
		}
				
		
	}
}
