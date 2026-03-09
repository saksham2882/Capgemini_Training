package exercises.exercise_05;

public class Exercise_05 {
    public static void main(String[] args) {

        IFactorial f = (n) -> {

            int fact = 1;
            for (int i = 1; i <= n; i++) {
                fact *= i;
            }

            return fact;
        };

        System.out.println(f.factorial(5));
    }
}
