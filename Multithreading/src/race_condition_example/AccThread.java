package race_condition_example;

public class AccThread {
    public static void main(String[] args) {

        Account account = new Account();

        // Race Condition happened without locking (synchronized)

        Thread t1 = new Thread(account, "Fred");
        Thread t2 = new Thread(account, "Barn");
        Thread t3 = new Thread(account, "Karim");

        t1.start();
        t2.start();
        t3.start();
    }
}