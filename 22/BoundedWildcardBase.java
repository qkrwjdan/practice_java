// class BoundedWildcardBase{
//     public static void main(String[] args) {
//         Bx<Toy> box = new Bx<Toy>();
//         BoxHandler.inBox(box, new Toy());
//         BoxHandler.outBox(box);

//     }
// }

// class Bx<T>{
//     T ob;
//     public void set(T o){ob = o;}
//     public T get(){return ob;}

//     @Override
//     public String toString(){
//         return ob.toString();
//     }
// }

// class Toy{
//     @Override
//     public String toString(){
//         return "i am a toy";
//     }
// }

// class BoxHandler{
//     // public static void outBox(Bx<Toy> box){
//     // 이때는 Bx<Toy>만 들어올 수 있찌만
//     public static void outBox(Bx<? extends Toy> box){
//         // 이때는 toy하위의 클래스들이 전부 들어올 수 있어 
//         // box.set(new Toy());
//         // 이 코드의 안정성을 보장할 수 없다.
//         Toy t = box.get();
//         System.out.println(t);
//     }
//     // public static void inBox<Bx<Toy> box,Toyn){
//     // 이때는 Bx<Toy>만 들어올 수 있지만
//     public static void inBox(Bx<? super Toy> box, Toy n){
//         // 이때는 Toy상위의 모든 매개변수형이 들어울 수 있어
//         //Toy myToy = box.get();
//         //이 코드의 안정성을 보장할 수 없다.
//         box.set(n);
//     }
// }