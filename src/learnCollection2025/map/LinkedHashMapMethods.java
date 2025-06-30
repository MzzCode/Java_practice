package learnCollection2025.map;
import java.util.LinkedHashMap;
import java.util.Map;

public class LinkedHashMapMethods {
    public static void main(String[] args) {
        LinkedHashMap<String, String> map = new LinkedHashMap<>();

        // 1. put(K key, V value)
        map.put("id", "101");
        map.put("name", "Alice");
        map.put("dept", "IT");
        map.put("city", "Delhi");

        // 2. get(Object key)
        System.out.println("Get name: " + map.get("name")); // Alice

        // 3. containsKey(Object key)
        System.out.println("Contains key 'dept': " + map.containsKey("dept")); // true

        // 4. containsValue(Object value)
        System.out.println("Contains value 'Delhi': " + map.containsValue("Delhi")); // true

        // 5. keySet()
        System.out.println("Keys: " + map.keySet()); // [id, name, dept, city]

        // 6. values()
        System.out.println("Values: " + map.values()); // [101, Alice, IT, Delhi]

        // 7. entrySet()
        System.out.println("Entries:");
        for (Map.Entry<String, String> entry : map.entrySet()) {
            System.out.println(entry.getKey() + " => " + entry.getValue());
        }

        // 8. putIfAbsent(K key, V value)
        map.putIfAbsent("name", "Bob"); // won't change value
        map.putIfAbsent("gender", "Female"); // will be added
        System.out.println("After putIfAbsent: " + map);

        // 9. replace(K key, V newValue)
        map.replace("city", "Mumbai");
        System.out.println("After replace: " + map);

        // 10. remove(Object key)
        map.remove("dept");
        System.out.println("After remove: " + map);

        // 11. size()
        System.out.println("Size: " + map.size());

        // 12. isEmpty()
        System.out.println("Is empty? " + map.isEmpty());

        // 13. clear()
        map.clear();
        System.out.println("After clear: " + map);
    }
}
