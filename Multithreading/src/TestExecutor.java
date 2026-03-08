
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class TestExecutor {

    public static void main(String[] args) {

        Runnable r = () -> System.out.println(Thread.currentThread().getName());

        // ExecutorService ex = Executors.newFixedThreadPool(2);
        ExecutorService ex = Executors.newCachedThreadPool();

        for (int i = 0; i < 10; i++) {
            // 1. without executor it created 10 thread
            // Thread t = new Thread(r);
            // t.start();

            // 2. use executor for pool of 2 and all work is done by this 2.
            ex.execute(r);
        }

        ex.close();
    }
}
