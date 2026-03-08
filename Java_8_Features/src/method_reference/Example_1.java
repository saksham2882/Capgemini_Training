package method_reference;

import java.util.ArrayList;
import java.util.List;

public class Example_1 {
    public static void main(String[] args) {

        List<String> list = new ArrayList<String>();

        list.add("Apple");
        list.add("Banana");
        list.add("Orange");
        list.add("Watermelon");
        list.add("Pineapple");
        list.add("Strawberry");

        // Way 1:
        // list.forEach(e -> System.out.println(e));

        // Way 2:
        list.forEach(System.out::println);                // method reference

        // Way 3: Custom create - (because of same signature of the method accept)
        // list.forEach(new Sum()::display);              // method reference
    }
}
