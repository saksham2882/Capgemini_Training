package lambda_expression;

import functional_interface.ICalculator;

public class LambdaExample {
    public static void main(String[] args) {

        // Example 1:
        ICalculator cal = (a, b) -> a + b;
        System.out.println(cal.calculate(10, 20));


        // Example 2:
        ICalculator cal2 = (a, b) -> {
            System.out.println("Adding Two Numbers: ");
            return a + b;
        };
        System.out.println(cal2.calculate(10, 2));


        // Example 3:
        ICalculator cal3 = (a, b) -> {
            System.out.println("Subtract Two Numbers: ");
            return a - b;
        };
        System.out.println(cal2.calculate(10, 2));
    }
}


// NOTE: Lambda Expression is only used with functional Interface