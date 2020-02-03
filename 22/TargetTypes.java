// class TargetTypes{
//     public static void main(String[] args) {
//         Bx<Integer> iBox = EmptyBoxFactory.<Integer>makeBox();
//         iBox.set(24);
//         System.out.println(iBox.get());

//     }
// }

// class Bx<T> {
//     private T ob;
//     public void set (T o){ob = o;}
//     public T get() {return ob;}
// }

// class EmptyBoxFactory{
//     public static <T> Bx<T> makeBox(){
//         Bx<T> box = new Bx<T>();
//         return box;
//     }

// }