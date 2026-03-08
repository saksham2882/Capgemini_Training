package stream_api;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;

public class StreamDemo {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(45);
        list.add(3);
        list.add(4);
        list.add(5);

        Predicate<Integer> p =  (o) ->  o < 4;

        Function<Integer , Integer> f = (o) -> o*o;

        Comparator<Integer> c= Integer::compareTo;


        List<Integer> ans = list.stream()
                .filter(p)
                .map(f)
                .sorted(c)
                .toList();

        System.out.println(ans);
    }
}