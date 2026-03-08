package race_condition_example;

public class Account implements Runnable {

//    private double accountBalance = 20000;


    // 1. Synchronized the whole method
//    public synchronized void withdraw(String name, double amount) {
//        if (amount < accountBalance) {
//            System.out.println(name + " is going to withdraw");
//            accountBalance -= amount;
//            System.out.println(name + " has available balance: " + accountBalance);
//        } else {
//            System.out.println(name + " has not enough balance");
//        }
//    }


    // 2. Synchronized in the block
//    public void withdraw(String name, double amount) {
//        synchronized (this) {
//            if (amount < accountBalance) {
//                System.out.println(name + " is going to withdraw");
//                accountBalance -= amount;
//                System.out.println(name + " has available balance: " + accountBalance);
//            } else {
//                System.out.println(name + " has not enough balance");
//            }
//        }
//        System.out.println(name + " has available balance: " + accountBalance);
//    }



    private static double accountBalance = 20000;

    // 2. Synchronized in the block (using static)
    public static void withdraw(String name, double amount) {
        synchronized (Account.class) {
            if (amount < accountBalance) {
                System.out.println(name + " is going to withdraw");
                accountBalance -= amount;
                System.out.println(name + " has available balance: " + accountBalance);
            } else {
                System.out.println(name + " has not enough balance");
            }
        }
        System.out.println(name + " has available balance: " + accountBalance);
    }

    @Override
    public void run() {
        withdraw(Thread.currentThread().getName(), 10000);
    }
}


// NOTE: "this" is non-static, so use access from the class