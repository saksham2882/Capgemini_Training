package collections.list;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class List_ArrayList {
    public static void main(String[] args) {

        ArrayList ls = new ArrayList();

        ls.add(10);
        ls.add(20);
        ls.add(30);
        ls.add(40);
        ls.add("ABC");

        // 1. For Each loop print
        ls.forEach((a) -> System.out.print(a + " "));
        System.out.println();


        // 2. Enhanced for loop
        for (Object o : ls) {
            System.out.print(o + " ");
        }


        // 3. Using Iterator
        Iterator cursor = ls.iterator();
        while(cursor.hasNext()){
            System.out.println(cursor.next());
        }


        // From last
        for(int i=ls.size() - 1; i>= 0; i--){
            System.out.println(ls.get(i));
        }

        // 4. From Last - print
        ListIterator cursor1 = ls.listIterator(ls.size());
        while(cursor1.hasPrevious()){
            System.out.println(cursor1.previous());
        }
    }
}
