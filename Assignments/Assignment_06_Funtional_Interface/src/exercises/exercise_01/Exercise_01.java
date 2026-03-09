package exercises.exercise_01;

public class Exercise_01 {

    public static void main(String[] args) {

        IPower p = (x, y) -> (int) Math.pow(x, y);

        System.out.println(p.power(10, 2));
    }
}
