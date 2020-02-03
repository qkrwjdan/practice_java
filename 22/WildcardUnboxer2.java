// class WildcardUnboxer2{
//     public static void main(String[] args) {
//         Bx<String> box = new Box<>();
//         box.set("So Simple Thing");
//         Unboxer.peekBox(box);
        
//     }
// }

// class Bx<T> {
//     private T ob;
//     public void set(T o) {ob = o;}
//     public T get(){return ob;}

//     @Override
//     public String toString(){
//         return ob.toString();
//     }
// }

// class Unboxer{
//     public static <T> T openBox(Bx<T> box){
//         return box.get();
//     }

//     public static void peekBox(BX<?> box){
//         System.out.println(box);
//     }
// }


