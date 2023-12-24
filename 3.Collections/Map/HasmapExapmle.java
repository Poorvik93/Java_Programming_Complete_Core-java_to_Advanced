package com.map.programs;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.Collection;

public class HasmapExapmle {
    public static void main(String[] args) {
        // Create a HashMap
        Map hm = new HashMap();

        // Add key-value pairs
        hm.put(101, "Poorvik");
        hm.put(102, "Amit");
        hm.put(103, "Rahul");
        hm.put(104, "Kamal");

        // Display the initial HashMap
        System.out.println("Initial HashMap: " + hm);

        // 1. get(Object key)
        String poorvik = (String) hm.get(101);
        System.out.println("Value associated with key 101: " + poorvik);

        // 2. put(K key, V value)
        hm.put(105, "Sara");
        System.out.println("HashMap after adding a new key-value pair: " + hm);

        // 3. remove(Object key)
        hm.remove(103);
        System.out.println("HashMap after removing key 103: " + hm);

        // 4. containsKey(Object key)
        boolean containsKey = hm.containsKey(102);
        System.out.println("HashMap contains key 102: " + containsKey);

        // 5. containsValue(Object value)
        boolean containsValue = hm.containsValue("Kamal");
        System.out.println("HashMap contains value 'Kamal': " + containsValue);

        // 6. keySet()
        Set<Integer> keySet = hm.keySet();
        System.out.println("Key Set: " + keySet);

        // 7. values()
        Collection<String> values = hm.values();
        System.out.println("Values: " + values);

        // 8. entrySet()
        Set<Map.Entry<Integer, String>> entrySet = hm.entrySet();
        System.out.println("Entry Set: " + entrySet);
        
        // or
        Set<Map.Entry<Integer, String>> entset=hm.entrySet();
        for(Map.Entry<Integer,String> entr:entset) {
        	System.out.println(entr.getKey()+" : "+entr.getValue());
        }
    }
}
