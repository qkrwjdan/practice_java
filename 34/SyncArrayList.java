import java.util.List;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.concurrent.Executors;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.TimeUnit;

class SyncArrayList{
    public static List<Integer> lst = Collections.synchronizedList(new ArrayList<>());
    public static void main(String[] args) throws InterruptedException{
        for(int i =0;i<16;i++)
            lst.add(i);
        System.out.println(lst);

        Runnable task1 = () -> {
            synchronized(lst){
                ListIterator<Integer> itr = lst.listIterator();
                while(itr.hasNext())
                    itr.set(itr.next() + 1);
            }
        };

        ExecutorService exr = Executors.newFixedThreadPool(3);
        exr.submit(task1);
        exr.submit(task1);
        exr.submit(task1);

        exr.shutdown();
        exr.awaitTermination(10, TimeUnit.SECONDS);
        System.out.println(lst);
    }


}