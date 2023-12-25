package com.map.programs;

import java.util.Collection;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

public class TreemapExample {

	    public static void main(String[] args) {
	        // Create a TreeMap
	        TreeMap<Integer, String> treeMap = new TreeMap<>();

	        // 1. put(K key, V value): Adds key-value pairs to the TreeMap
	        treeMap.put(101, "Poorvik");
	        treeMap.put(102, "Amit");
	        treeMap.put(103, "Rahul");
	        treeMap.put(104, "Kamal");

	        // 2. get(Object key): Retrieves the value associated with the specified key
	        String poorvik = treeMap.get(101);
	        System.out.println("Value associated with key 101: " + poorvik);

	        // 3. remove(Object key): Removes the mapping for the specified key
	        treeMap.remove(103);
	        System.out.println("TreeMap after removing key 103: " + treeMap);

	        // 4. containsKey(Object key): Checks if the TreeMap contains a key
	        boolean containsKey = treeMap.containsKey(102);
	        System.out.println("TreeMap contains key 102: " + containsKey);

	        // 5. containsValue(Object value): Checks if the TreeMap contains a value
	        boolean containsValue = treeMap.containsValue("Kamal");
	        System.out.println("TreeMap contains value 'Kamal': " + containsValue);

	        // 6. keySet(): Returns a Set view of the keys
	        Set<Integer> keySet = treeMap.keySet();
	        System.out.println("Key Set: " + keySet);

	        // 7. values(): Returns a Collection view of the values
	        Collection<String> values = treeMap.values();
	        System.out.println("Values: " + values);

	        // 8. entrySet(): Returns a Set view of the mappings
	        Set<Map.Entry<Integer, String>> entrySet = treeMap.entrySet();
	        System.out.println("Entry Set: " + entrySet);

	        // 9. firstKey(): Returns the first (lowest) key
	        int firstKey = treeMap.firstKey();
	        System.out.println("First Key: " + firstKey);

	        // 10. lastKey(): Returns the last (highest) key
	        int lastKey = treeMap.lastKey();
	        System.out.println("Last Key: " + lastKey);

	        // 11. higherKey(K key): Returns the least key strictly greater than the given key
	        int higherKey = treeMap.higherKey(102);
	        System.out.println("Key higher than 102: " + higherKey);

	        // 12. lowerKey(K key): Returns the greatest key strictly less than the given key
	        int lowerKey = treeMap.lowerKey(104);
	        System.out.println("Key lower than 104: " + lowerKey);

	        // 13. floorKey(K key): Returns the greatest key less than or equal to the given key
	        int floorKey = treeMap.floorKey(103);
	        System.out.println("Key floor to 103: " + floorKey);

	        // 14. ceilingKey(K key): Returns the least key greater than or equal to the given key
	        int ceilingKey = treeMap.ceilingKey(102);
	        System.out.println("Key ceiling to 102: " + ceilingKey);

	        
	        // 15. ceilingEntry(K key , V value): Returns the least key greater than or equal to the given key and is value
	        Entry<Integer, String> ceilingentry = treeMap.ceilingEntry(102);
	        System.out.println("Entry ceiling to 102: " + ceilingentry);

	        // 16. pollFirstEntry(): Removes and returns the first entry (lowest key) or null if the map is empty
	        Map.Entry<Integer, String> firstEntry = treeMap.pollFirstEntry();
	        System.out.println("First Entry (lowest key) removed: " + firstEntry);

	        // 17. pollLastEntry(): Removes and returns the last entry (highest key) or null if the map is empty
	        Map.Entry<Integer, String> lastEntry = treeMap.pollLastEntry();
	        System.out.println("Last Entry (highest key) removed: " + lastEntry);
	   
	    
	    }
}
