
public class DemonThread implements Runnable {

    public void run() {
        while (true) {
            System.out.println(Thread.currentThread().getName() + " is running");
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public static void main(String[] args) throws InterruptedException {

        DemonThread obj = new DemonThread();
        Thread t1 = new Thread(obj);

        t1.setDaemon(true);
        t1.start();
        String str = "HELLO";

        for (int i = 0; i < str.length(); i++) {
            System.out.println(str.charAt(i));
            Thread.sleep(2000);
        }


        // System.out.println(Thread.currentThread().getName() + " is Alive " + Thread.currentThread().isAlive());
        // System.out.println(t1 + " is Alive " + t1.isAlive());
    }
}
