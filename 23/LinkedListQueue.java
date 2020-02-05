import java.util.Queue;
import java.util.LinkedList;

class LinkedListQueue{
    public static void main(String[] args) {
        Queue<String> que = new LinkedList<>();
        que.offer("Box1");
        que.offer("Box2");
        que.offer("Box3");
        que.offer("Box4");

        System.out.println("next : " + que.peek());
        System.out.println(que.poll());
        System.out.println(que.poll());

        System.out.println("next : " + que.peek());
        System.out.println(que.poll());

    }
}