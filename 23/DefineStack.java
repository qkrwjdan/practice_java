import java.util.Deque;
import java.util.ArrayDeque;

class DefineStack{
    public static void main(String[] args) {
        DIStack<String> stk = new DCStack(new ArrayDeque<>());

        stk.push("1.Box");
        stk.push("2.Box");
        stk.push("3.Box");
        stk.push("4.Box");

        System.out.println(stk.pop());
        System.out.println(stk.pop());
        System.out.println(stk.pop());
        System.out.println(stk.pop());
        System.out.println(stk.pop());
        
    }
}

interface DIStack<E>{
    public boolean push(E item);
    public E pop();
}

class DCStack<E> implements DIStack<E>{
    private Deque<E> deq;

    public DCStack(Deque<E> d){
        deq = d;
    }

    public boolean push(E item){
        return deq.offerFirst(item);
    }

    public E pop(){
        return deq.pollFirst();
    }

}