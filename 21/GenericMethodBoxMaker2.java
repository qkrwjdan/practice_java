// class GenericMethodBoxMaker2{
//     public static void main(String[] args) {
//         Box2<String> box = new Box2<>();
//         box.set("My Generic Method");

//         String str = Unboxer.openBox(box);
//         System.out.println(str);
//     }
// }

// class Box2<T>{
//     private T ob;

//     public void set(T o){
//         ob = o;
//     }

//     public T get(){
//         return ob;
//     }
// }

// class Unboxer{
//     public static <T> T openBox(Box2<T> ob){
//         return ob.get();
//     }
// }

