// class BoundedWildcardGenericMethod{
//     public static void main(String[] args) {
//         Bx<Toy> tBox = new Bx<>();        
//         BoxHandler.inBox(tBox,new Toy());
//         BoxHandler.outBox(tBox);
//         Bx<Robot> rBox = new Bx<>();
//         BoxHandler.inBox(rBox,new Robot());
//         BoxHandler.outBox(rBox);
        
//     }
// }

// class Bx<T> {
//     private T ob;
//     public void set(T o){ob = o;}
//     public T get() {return ob;}
// }

// class Toy{
//     @Override
//     public String toString(){return "I am a Toy";}
// }

// class Robot{
//     @Override
//     public String toString(){return "I am a Robot";}
// }

// class BoxHandler{
//     public static <T> void outBox(Bx<? extends T> box){
//         T t = box.get();
//         System.out.println(t);
//     }

//     public static <T> void inBox(Bx<? super T> box, T n){
//         box.set(n);
//     }
// }