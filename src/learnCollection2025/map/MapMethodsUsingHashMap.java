package learnCollection2025.map;

import java.util.HashMap;
import java.util.Map;

public class MapMethodsUsingHashMap {

	public static void main(String args[]) {
		
		Map<String, String> map = new HashMap<>();
		
		map.put("name", "Alice");
        map.put("city", "Delhi");
        map.put("language", "Java");
        System.out.println("After put(): " + map);

        System.out.println("Get 'city': " + map.get("city"));

        map.remove("language");
        System.out.println("After remove(): " + map);

        System.out.println("Contains key 'name': " + map.containsKey("name"));
        System.out.println("Contains value 'Delhi': " + map.containsValue("Delhi"));

        System.out.println("Keys: " + map.keySet());
        System.out.println("Values: " + map.values());

        for (Map.Entry<String, String> entry : map.entrySet()) {
            System.out.println("Key = " + entry.getKey() + ", Value = " + entry.getValue());
        }

        System.out.println("Size of map: " + map.size());
        System.out.println("Is map empty? " + map.isEmpty());

        map.clear();
        System.out.println("After clear(): " + map);

        map.put("country", "India");
        map.putIfAbsent("country", "USA");
        System.out.println("After putIfAbsent(): " + map);

        map.replace("country", "Bharat");
        System.out.println("After replace(): " + map);
	}
}
