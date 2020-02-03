// class LowerBoundedWildcard{
//     public static void main(String[] args) {     
//         Bx<Integer> iBox = new Bx<Integer>();
//         iBox.set(5577);

//         Bx<Number> nBox = new Bx<>();
//         nBox.set(new Integer(9955));

//         Bx<Object> oBox = new Bx<>();
//         oBox.set("My simple instance");
//         Unboxer.peekBox(iBox);
//         Unboxer.peekBox(nBox);
//         Unboxer.peekBox(oBox);


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
//     public static void peekBox(Bx<? super Integer> box){
//         System.out.println(box);
//     }
// }

