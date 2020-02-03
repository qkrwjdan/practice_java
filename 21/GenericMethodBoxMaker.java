// class GenericMethodBoxMaker{
//     public static void main(String[] args) {
//         Box2<String> sBox = BoxFactory.makeBox("sweet");
//         System.out.println(sBox.get());

//         Box2<Double> dBox = BoxFactory.makeBox(7.59);
//         System.out.println(dBox.get());
//     }
// }

// class Box2<T>{
//     T ob;

//     public void set(T o){
//         ob = o;
//     }

//     public T get(){
//         return ob;
//     }
// }

// class BoxFactory{
//     public static <T> Box2<T> makeBox(T ob){
//         Box2<T> b1 = new Box2<>();
//         b1.set(ob);

//         return b1;
//     }
// }