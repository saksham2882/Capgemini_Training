package collections.list;

import java.util.ArrayDeque;
import java.util.Iterator;

public class List_ArrayDeque {
    public static void main(String[] args) {

        ArrayDeque<Integer> q = new ArrayDeque<>();

        q.add(10);
        q.add(20);
        q.addFirst(30);
        q.addLast(40);
        q.addFirst(90);

        // 1. Direct Print
        System.out.print(q);
        System.out.println();


        // 2. Using normal loop
        for(int i=0; i<q.size(); i++){
            System.out.print(q.poll() + " ");
        }


        // 3. Using forEach loop
        System.out.println("For Each Loop: ");
        q.forEach((a) -> System.out.print(a + " "));
        System.out.println();


        // 4. Using Iterator
        Iterator<Integer> cursor = q.iterator();
        while (cursor.hasNext()) {
            System.out.print(cursor.next() + " ");
        }


        // 5. Using Iterator in reverse
        // ListIterator i = q.ListIterator(q.size());
        // while(i.hasPrevious()){
        //     System.out.print(i.previous() + " ");
        // }
    }
}
