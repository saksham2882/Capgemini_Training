package stream_api;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class StreamDemo_1 {
    public static void main(String[] args) {

        // Stream<Integer> stream = Stream.of(1, 2, 3, 4, 5);
        // stream.forEach(System.out::println);

        // Predicate<Integer> p = i -> i < 10;

        //stream.filter(i -> i < 4).map(i -> i * i).forEach(num -> System.out.println(num));


        List<String> names = new ArrayList<>();
        names.add("John");
        names.add("Kim");
        names.add("Jane");
        names.add("Sara");
        names.add("Harry");
        names.add("Peter");
        names.add("Peter");

        List<String> list = names.stream().filter(name -> name.startsWith("J")).map(s -> s.concat(" JJ")).collect(Collectors.toList());
        System.out.println(list);

        Map<String, Long> map = names.stream().collect(Collectors.groupingBy(n -> n, Collectors.counting()));
        System.out.println(map);
    }
}
