import java.util.*;
import java.util.Map.Entry;

public class Higest_marks_Map {

	public static void main(String[] args) {
		
		Map<String, Integer> mp = new HashMap<>();
		mp.put("Mahesh", 96);
		mp.put("Dinesh", 90);
		mp.put("Kavya", 89);
		mp.put("Prasad", 85);
		mp.put("Ram", 80);
		
		Collection<Integer> val = mp.values();
		Set<String> key = mp.keySet();
		
		List<Integer> ls = new ArrayList<>();
		for (Integer in : val) {
			ls.add(in);
		}
		
		Collections.sort(ls);
		int size = ls.get(ls.size()-1);
		
		Set<Entry<String, Integer>> entry = mp.entrySet();
		for (Entry<String, Integer> e : entry) {
			if(e.getValue()==size)
				System.out.println(e.getKey()+" "+e.getValue());
		}
	}
}
