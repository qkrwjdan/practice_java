// class GetableGenericInterface{
//     public static void main(String[] args) {
//         Bx<Toy> box = new Bx<>();
//         box.set(new Toy());

//         Getable<Toy> gt = box;
//         Getable<Toy> gt2 = new Bx<>();
//         // gt2.set(new Toy());
//         System.out.println("gt2 : " + gt2.get());
//         System.out.println(gt.get());
        
//     }
// }

// interface Getable<T>{
//     public T get();
// }

// class Bx<T> implements Getable<T>{
//     private T ob;
//     public void set(T o) {ob = o;}

//     @Override
//     public T get(){
//         return ob;
//     }
// }

// class Toy{
//     @Override
//     public String toString(){
//         return "I am a Toy";
//     }
// }