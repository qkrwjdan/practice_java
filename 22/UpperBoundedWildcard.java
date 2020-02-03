// class UpperBoundedWildcard{
//     public static void main(String[] args) {
//         Bx<Integer> iBox = new Bx<>();
//         iBox.set(1234);
//         Unboxer.peekBox(iBox);

//         Bx<Double> dBox = new Bx<>();
//         dBox.set(10.2312);
//         Unboxer.peekBox(dBox);
        
//     }
// }

// class Bx<T> {
//     private T ob;
//     public void set(T o){ob = o;}
//     public T get(){return ob;}

//     @Override
//     public String toString(){
//         return ob.toString();
//     }

// }

// class Unboxer{
//     public static void peekBox(Bx<? extends Number> box){
//         System.out.println(box);
//     }
// }