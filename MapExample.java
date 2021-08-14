

import java.util.*;
public class MapExample {
	public static void main(String args[]) {
		Map map = new HashMap();
		map.put("one", "uno");
		map.put("two", "dos");
		map.put("three","tres");

		System.out.println("Original Map Values: ");
		System.out.println(map);

		// Overwrites the previous assignment
		map.put("three","teen");

		System.out.println("Updated Map Values: ");
		System.out.println(map);


		// Returns set view of keys
		Set set1 = map.keySet();
		System.out.println(set1);

		// Returns Collection view of values
		Collection collection = map.values();
		System.out.println(collection);

		// Returns set view of key value mappings
		Set set2 = map.entrySet();
		System.out.println(set2);

		System.out.println(set1 + "\n" + collection + "\n" + set2);
		
	}
}
