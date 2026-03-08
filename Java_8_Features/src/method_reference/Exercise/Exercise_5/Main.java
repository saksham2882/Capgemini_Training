package method_reference.Exercise.Exercise_5;

public class Main {
    public static void main(String[] args) {

        IFactorial f = Fact::factorial;

        System.out.println("Factorial of 5: " + f.factorial(5));
    }
}
