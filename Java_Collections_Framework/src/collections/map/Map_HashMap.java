package collections.map;

import java.util.HashMap;

public class Map_HashMap {
    public static void main(String[] args) {

        HashMap<Integer,String> map = new HashMap<>();    // default capacity is 16

        map.put(1, "Mango");
        map.put(2, "Orange");
        map.put(3, "Apple");
        map.put(4, "Banana");
        map.put(5, "Pineapple");
        map.putIfAbsent(88, "Apple");

        System.out.println(map);

        System.out.println(map.get(1));

        System.out.println(map.getOrDefault(8, "Fruit"));

        System.out.println(map.containsKey(4));

        System.out.println(map.isEmpty());

        System.out.println(map.size());

        System.out.println(map.keySet());

        System.out.println(map.values());

        System.out.println(map.entrySet());

        System.out.println("Print Map: ");

        for(int i : map.keySet()){
            System.out.println(i + " : " + map.get(i));
        }
    }
}