// class GetableGenericInterface2{
//     public static void main(String[] args) {
//         Bx<Toy> box = new Bx<>();
//         box.set(new Toy());

//         Getable<String> gt = box;
//         System.out.println(gt.get());
        
//     }

// }

// interface Getable<T>{
//     public T get();
// }

// class Bx<T> implements Getable<String>{
//     private T ob;
//     public void set(T o){ob = o;}

//     @Override
//     public String get(){return ob.toString();}
//     //public T get(){return ob;} -> 안됨;;
// }

// class Toy{
//     @Override
//     public String toString(){
//         return "I am a Toy";
//     }
// }