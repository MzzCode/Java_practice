package learnCollection2025.map;

import java.util.Map;
import java.util.TreeMap;

public class TreeMapMethodsExample {

	public static void main(String[] args) {
        TreeMap<Integer, String> map = new TreeMap<>();

        // 1. put(K key, V value)
        map.put(101, "Alice");
        map.put(103, "Charlie");
        map.put(102, "Bob");
        map.put(105, "Eve");
        map.put(104, "David");

        System.out.println("TreeMap (Sorted by key):");
        System.out.println(map); // Sorted by keys

        // 2. get(Object key)
        System.out.println("Get 102: " + map.get(102));  // Bob

        // 3. remove(Object key)
        map.remove(105);
        System.out.println("After remove(105): " + map);

        // 4. containsKey(Object key)
        System.out.println("Contains key 104: " + map.containsKey(104));

        // 5. containsValue(Object value)
        System.out.println("Contains value 'David': " + map.containsValue("David"));

        // 6. keySet()
        System.out.println("Key Set: " + map.keySet());

        // 7. values()
        System.out.println("Values: " + map.values());

        // 8. entrySet()
        for (Map.Entry<Integer, String> entry : map.entrySet()) {
            System.out.println("Key = " + entry.getKey() + ", Value = " + entry.getValue());
        }

        // 9. putIfAbsent(K key, V value)
        map.putIfAbsent(104, "Daniel"); // will not overwrite
        map.putIfAbsent(106, "Frank"); // will insert
        System.out.println("After putIfAbsent: " + map);

        // 10. replace(K key, V value)
        map.replace(103, "Carlos");
        System.out.println("After replace: " + map);

        // 11. size()
        System.out.println("Size: " + map.size());

        // 12. isEmpty()
        System.out.println("Is Empty? " + map.isEmpty());

        // 13. clear()
        map.clear();
        System.out.println("After clear: " + map);
    }
}
