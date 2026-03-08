package collections.set;

import java.util.Iterator;
import java.util.TreeSet;

public class Set_TreeSet {
    public static void main(String[] args) {

        TreeSet<Integer> ts = new TreeSet<>();

        ts.add(1);
        ts.add(2);
        ts.add(3);
        ts.add(4);
        ts.add(5);

        // 1. Print using normal
        System.out.println(ts);


        // 2. Print using forEach
        ts.forEach(System.out::print);
        System.out.println();


        // 3. Print using Iterator
        Iterator<Integer> it = ts.iterator();
        while(it.hasNext()){
            System.out.print(it.next() + " ");
        }
        System.out.println();


        // 4. Print using Enhanced
        for(Integer i : ts){
            System.out.print(i + " ");
        }
        System.out.println();


        // Some Other Methods:
        System.out.println(ts.first());
        System.out.println(ts.last());
        System.out.println(ts.higher(3));
        System.out.println(ts.lower(3));
        System.out.println(ts.ceiling(2));
        System.out.println(ts.ceiling(-1));
        System.out.println(ts.ceiling(8));
        System.out.println(ts.floor(3));

        System.out.println(ts.descendingSet());
    }
}