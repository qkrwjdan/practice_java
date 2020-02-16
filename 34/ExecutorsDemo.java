import java.util.concurrent.Executors;
import java.util.concurrent.ExecutorService;

class ExecutorsDemo{
    public static void main(String[] args) {
        Runnable task1 = ()->{
            int n1 = 10;
            int n2 = 20;
            String name = Thread.currentThread().getName();
            System.out.println(name + ": " + (n1 + n2));

        };

        ExecutorService exr = Executors.newSingleThreadExecutor();
        exr.submit(task1);

        System.out.println("End" + Thread.currentThread().getName());
        exr.shutdown();
    }
}