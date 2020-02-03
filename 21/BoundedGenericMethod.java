// class BoundedGenericMethod{
//     public static void main(String[] args) {
//         Box2<Integer> sBox = BoxFactory.makeBox(new Integer(5959));
//         int n = Unboxer.openBox(sBox);
//         System.out.println("returned data : " + n);
        
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

// class BoxFactory{
//     public static <T extends Number> Box2<T> makeBox(T ob){
//         Box2<T> b1 = new Box2<>();
//         b1.set(ob);
//         System.out.println("Boxed data : " + ob.intValue());
//         return b1;
//     }
// }

// class Unboxer{
//     public static <T extends Number> T openBox(Box2<T> ob){
//         System.out.println("Unboxed data : " + ob.get().intValue());
//         return ob.get();
//     }
// }