import java.util.List;
import java.util.ArrayList;
import java.util.function.BiConsumer;

class LambdaPractice{
    public static void main(String[] args) {
        BiConsumer<Box1,Integer> bcs1 = (box,in) -> {
            box.set(in);
        };
        Box1<Integer> bs = new Box1<>();
        bcs1.accept(bs,10);
        System.out.println(bs.get());

        BiConsumer<Box1,Double> bcs2 = (box,dou) -> {
            box.set(dou);
        };
        bcs2.accept(bs,10.1623);
        System.out.println(bs.get());
    }
}

class Box1<T> {
    private T ob;
    public void set(T o) {ob = o;}
    public T get(){return ob;}
}