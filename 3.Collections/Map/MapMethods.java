package com.map.programs;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapMethods {

	public static void main(String[] args) {
		// MAP STORE KEY VALUES PAIRS
		// DONOT pRINT THE DUPLICATE VALUES
		// NOT FOLLOW INSERTION ORDER
		// NOT MANITAION SORTING ORDER.

		// Create a HashMap named 'map'
		Map<Integer, String> map = new HashMap<>();

		// 1. put(K key, V value): Associates the specified value with the specified key in the map.
		map.put(100, "Poorvik");
		map.put(103, "Raju");
		map.put(101, "Amith");
		map.put(104, "Ravi");
		map.put(100, "Deep");

		// 2. get(Object key): Returns the value to which the specified key is mapped.
		System.out.println("Value for key 100: " + map.get(100));

		// 3. containsKey(Object key): Returns true if the map contains the specified key.
		System.out.println("Contains key 101? " + map.containsKey(101));

		// 4. containsValue(Object value): Returns true if the map contains the specified value.
		System.out.println("Contains value 'Raju'? " + map.containsValue("Raju"));

		// 5. remove(Object key): Removes the mapping for the specified key from the map.
		map.remove(103);
		System.out.println("Map after removing key 103: " + map);

		// 6. size(): Returns the number of key-value mappings in the map.
		System.out.println("Size of the map: " + map.size());

		// 7. keySet(): Returns a Set view of the keys contained in the map.
		Set<Integer> keySet = map.keySet();
		System.out.println("Key set: " + keySet);

		// 8. values(): Returns a Collection view of the values contained in the map.
		System.out.println("Values in the map: " + map.values());

		// 9. entrySet(): Returns a Set view of the key-value mappings contained in the map.
		Set<Map.Entry<Integer, String>> entrySet = map.entrySet();
		System.out.println("Entry set: " + entrySet);


		// 10.Add more key-value pairs to the map
		map.put(104, "Sara");
		map.put(105, "John");

		// Print the map after adding new entries
		System.out.println("Map after adding more entries: " + map);

		// 11. replace(K key, V newValue): Replaces the value for the specified key with the specified value.
		map.replace(105, "Johnny");
		System.out.println("Map after replacing value for key 105: " + map);

		// 12. putAll(Map<? extends K, ? extends V> m): Copies all of the mappings from the specified map to this map.
		Map<Integer, String> anotherMap = new HashMap<>();
		anotherMap.put(106, "Alice");
		anotherMap.put(107, "Bob");
		map.putAll(anotherMap);
		System.out.println("Map after putting all entries from anotherMap: " + map);

		// 13. getOrDefault(Object key, V defaultValue): Returns the value to which the specified key is mapped,
		// or defaultValue if this map contains no mapping for the key.
		String valueOrDefault = map.getOrDefault(108, "DefaultName");
		System.out.println("Value for key 108 (with default): " + valueOrDefault);

		// 14. forEach(BiConsumer<? super K, ? super V> action): Performs the given action for each entry in the map.
		map.forEach((key, value) -> System.out.println("Key: " + key + ", Value: " + value));

		// 15. replaceAll(BiFunction<? super K, ? super V, ? extends V> function):
		// Replaces each entry's value with the result of invoking the given function.
		map.replaceAll((key, value) -> value.toUpperCase());
		System.out.println("Map after replacing all values with uppercase: " + map);

		// 16. clear(): Removes all of the mappings from the map.
		// map.clear();
		// System.out.println("Map after clear: " + map);

	}
}
