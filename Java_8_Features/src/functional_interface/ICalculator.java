package functional_interface;

@FunctionalInterface
public interface ICalculator {
    public int calculate(int a, int b);

    public default void display(){
        System.out.println("Default method");
    }

    public static void m1(){
        System.out.println("Static method");
    }

    private void m3(){
        System.out.println("Private method");
    }

    public default void m2(){
        m3();
    }
}


// NOTE: Interface naming -> Adjective

// 1. here default method is used to give choice either override this method or not

// 2. Static method can not be overridden

// 3. abstract method can not be "private", but only static can be private