// class WildcardUnboxer{
//     public static void main(String[] args) {
        
//         Bx<String> box = new Bx<>();
//         box.set("so Simple Thing");
//         Unboxer.peekBox(box);
//     }
// }

// class Bx<T>{
//     T ob;
//     public void set(T o){ob = o;};
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

//     public static <T> void peekBox(Bx<T> box){
//         System.out.println(box);
//     }
// }
