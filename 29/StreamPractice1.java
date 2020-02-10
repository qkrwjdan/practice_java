import java.util.List;
import java.util.Arrays;

class StreamPractice1{
    public static void main(String[] args) {
        List<Box3<String>> ls = Arrays.asList(new Box3("Robot"),new Box3("Simple"));

        ls.stream().map(n->n.get()).forEach(s->System.out.println(s));
        ls.stream().map(n->n.get().length()).forEach(s->System.out.println(s));
        
    }
}

class Box3<T>{
    private T ob;
    public Box3(T o) { ob = o;}
    public T get() {return ob;}
}

