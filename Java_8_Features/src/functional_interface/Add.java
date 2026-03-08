package functional_interface;

public class Add implements ICalculator {

    @Override
    public int calculate(int a, int b) {
        return a + b;
    }

    // Optional:
    @Override
    public void display() {
        System.out.println("Default method Override");
    }

    public void m1(){
        System.out.println("Static method");
    }

    // Optional:
    @Override
    public void m2() {
        System.out.println("Private-Public-Default Overridden method");
    }
}


class Main {
    public  static void main(String[] args) {
        Add add = new Add();

        System.out.println(add.calculate(10, 20));

        add.display();

        add.m1();

        add.m2();
    }
}
