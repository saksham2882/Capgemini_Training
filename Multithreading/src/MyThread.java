
public class MyThread implements Runnable {

    @Override
    public void run() {
        for(int i=0; i<5; i++){
            System.out.println(Thread.currentThread().getName() + " is running");
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                System.out.println("Thread interrupted");
            }
        }
    }

    public static void main(String[] args) throws InterruptedException {

        MyThread obj = new MyThread();
        // Thread t1 = new Thread(obj);
        Thread t1 = new Thread(obj, "X");
        Thread t2 = new Thread(obj, "Y");
        Thread t3 = new Thread(obj, "Z");

        System.out.println("T1 -> " + t1.getPriority());
        System.out.println("T2 -> " + t2.getPriority());
        System.out.println("T3 -> " + t3.getPriority());

        t1.start();
        t2.start();
        t1.join();
        t3.start();
    }
}
