package method_reference;

public class Main {
    public static void main(String[] args) {

        // 1. Non-static method
        // ICalculator cal = new Sum()::add;
        // System.out.println(cal.calculate(10, 20));

        // 2. static method
        // using the static method, so no need for the object creation
        // ICalculator cal2 = Sum::subtract;
        // System.out.println(cal2.calculate(10, 20));


        // 3. Constructor
        IPrintable p = Sum::new;
        p.print("Mohit");
    }
}

// NOTE: Method Reference is only used with Functional Interface.
// 1. method reference is only work when the method signature is same, otherwise it not work.