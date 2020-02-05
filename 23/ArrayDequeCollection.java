import java.util.Deque;
import java.util.ArrayDeque;

class ArrayDequeCollection{
    public static void main(String[] args) {
        Deque<String> deq = new ArrayDeque();

        deq.offerFirst("1.box");
        deq.offerFirst("2.toy");
        deq.offerFirst("3.Robot");

        System.out.println(deq.pollFirst());
        System.out.println(deq.pollFirst());
        System.out.println(deq.pollFirst());
    }
}
