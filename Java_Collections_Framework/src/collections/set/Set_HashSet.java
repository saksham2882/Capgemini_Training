package collections.set;

import java.util.HashSet;
import java.util.Iterator;

public class Set_HashSet {
    public static void main(String[] args) {

        HashSet<Integer> hs = new HashSet<>();

        hs.add(1);
        hs.add(2);
        hs.add(3);
        hs.add(4);
        hs.add(5);

        // 1. Print using normal
        System.out.println(hs);

        // 2. Print using forEach
        hs.forEach(System.out::println);

        // 3. Print using Iterator
        Iterator<Integer> it = hs.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }

        // 4. Print using Enhanced
        for(Integer i : hs){
            System.out.println(i);
        }
    }
}