package collections.list;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

public class List_LinkedList {
    public static void main(String[] args) {

        LinkedList<Integer> ll = new LinkedList<>();

        ll.add(10);
        ll.add(20);
        ll.add(30);
        ll.add(40);
        ll.addFirst(50);
        ll.addFirst(60);
        ll.addLast(70);


        // 1. Direct Print
        System.out.print(ll);
        System.out.println();


        // 2. Using normal loop
        for (Integer integer : ll) {
            System.out.print(integer + " ");
        }


        // 3. Using forEach loop
        ll.forEach((a) -> System.out.print(a + " "));
        System.out.println();


        // 4. Using Iterator
        Iterator<Integer> cursor = ll.iterator();
        while (cursor.hasNext()) {
            System.out.print(cursor.next() + " ");
        }


        // 5. Using Iterator in reverse
        ListIterator<Integer> i = ll.listIterator(ll.size());
        while(i.hasPrevious()){
            System.out.print(i.previous() + " ");
        }
    }
}