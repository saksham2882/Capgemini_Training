package method_reference;

public class Sum {

    // Constructor
    public Sum(String str) {
        System.out.println("Name: " + str.toUpperCase());
    }

    // non-static method
    public int add(int a, int b) {
        return a + b;
    }

    // non-static method
    public void display(String str){
        System.out.println(str);
    }

    // static method
    public static int subtract(int a, int b) {
        return a - b;
    }
}
