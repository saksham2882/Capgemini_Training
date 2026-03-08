package lambda_expression;

import functional_interface.ICalculator;

public class Anonymous_Class {
    public static void main(String[] args) {

        ICalculator cal = new ICalculator() {

            @Override
            public int calculate(int a, int b) {
                return a + b;
            }
        };

        System.out.println(cal.calculate(10, 20));
    }
}
