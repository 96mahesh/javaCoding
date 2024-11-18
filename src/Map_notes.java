import java.security.DomainCombiner;
import java.util.HashMap;
import java.util.Map;

public class Map_notes {

	public static void decmental(Map<String, Integer> map, String key, int dec) {
	if(map.containsKey(key)) {
		
		int current_val = map.get(key);
		int new_val = current_val-dec;
		map.put(key, new_val);
		
		System.out.println(key+" "+dec+" "+new_val);
		
	}
	else {
		System.out.println(key+"key is not found ");
		
	}
	}
	public static void main(String[] args) {
		
		Map<String, Integer> map = new HashMap<>();
		map.put("apple", 50);
		map.put("banana", 30);
		map.put("orange", 20);
		String key = "apple";
		int dec = 5;
		
		decmental(map, key, dec);
		System.out.println(map);
	}
}
