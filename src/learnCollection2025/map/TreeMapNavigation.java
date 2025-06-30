package learnCollection2025.map;

import java.util.TreeMap;

public class TreeMapNavigation {
	public static void main(String[] args) {
        TreeMap<Integer, String> map = new TreeMap<>();
        map.put(10, "Ten");
        map.put(20, "Twenty");
        map.put(30, "Thirty");
        map.put(40, "Forty");

        // firstKey(), lastKey()
        System.out.println("First Key: " + map.firstKey()); // 10
        System.out.println("Last Key: " + map.lastKey());   // 40

        // headMap(K toKey)
        System.out.println("Head Map (<30): " + map.headMap(30)); // {10=Ten, 20=Twenty}

        // tailMap(K fromKey)
        System.out.println("Tail Map (>=30): " + map.tailMap(30)); // {30=Thirty, 40=Forty}

        // subMap(K fromKey, K toKey)
        System.out.println("Sub Map (10 to 30): " + map.subMap(10, 30)); // {10=Ten, 20=Twenty}

        // higherKey(K key)
        System.out.println("Higher key than 20: " + map.higherKey(20)); // 30

        // lowerKey(K key)
        System.out.println("Lower key than 30: " + map.lowerKey(30)); // 20

        // ceilingKey(K key)
        System.out.println("Ceiling key for 25: " + map.ceilingKey(25)); // 30

        // floorKey(K key)
        System.out.println("Floor key for 25: " + map.floorKey(25)); // 20
    }

}
