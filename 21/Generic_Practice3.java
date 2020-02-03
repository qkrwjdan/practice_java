class Generic_Practice3{
    public static void main(String[] args) {
        Box2<Integer> box1 = new Box2<>();
        box1.set(99);
        Box2<Integer> box2 = new Box2<>();
        box2.set(55);
        System.out.println(box1.get() + " & " + box2.get()); 
        swapBox(box1,box2);
        System.out.println(box1.get() + " & " + box2.get());
        
    }

    public static <T> void swapBox(Box2<T> b1, Box2<T> b2){
        // Box2<T> tmp = b2;
        Box2<T> tmp = new Box2<T>();
        tmp.set(b2.get());

        b2.set(b1.get());
        b1.set(tmp.get());
        // b2 = b1;
        // b1 = tmp;
        
    }
}

class Box2<T>{
    private T ob;
    public void set(T o){ob = o;}
    public T get(){return ob;}
}

