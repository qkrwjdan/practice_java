// class MoveBoxContents{
//     public static void main(String[] args) {
//         Bx<Toy> box1 = new Bx<>();
//         box1.set(new Toy());
//         Bx<Toy> box2 = new Bx<>();

//         BoxContentsMover.moveBox(box2,box1);
//         System.out.println(box2.get());
        
//     }
// }

// class Bx<T>{
//     private T ob;
//     public void set(T o){ob = o;}
//     public T get(){return ob;}
// }

// class Toy{
//     @Override
//     public String toString(){
//         return "I am a Toy";
//     }
// }

// class BoxContentsMover{
//     public static void moveBox(Bx<? super Toy> to, Bx<? extends Toy> from){
//         to.set(from.get());
//     }
// }