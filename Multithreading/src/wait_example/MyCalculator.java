package wait_example;

class Calculator extends Thread{
    int total;

    public void run(){
        synchronized (this){                        // used because notify work on the locked system.
            for (int i = 1; i <= 100; i++){
                total += i;
            }
            notify();
            // notifyAll();                        // for multiple thread
        }
    }
}


public class MyCalculator {
    public static void main(String[] args) {

        Calculator c = new Calculator();
        c.start();

        synchronized (c){
            try {
                System.out.println("Waiting for Calculation...");
                c.wait();
                System.out.println("Total: " + c.total);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
