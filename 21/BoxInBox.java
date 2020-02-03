// class BoxInBox{
//     public static void main(String[] args) {
//         Box2<String> sBox = new Box2<>();
//         sBox.set("im g");
//         Box2<Box2<String>> wBox = new Box2<>();
//         wBox.set(sBox);
//         Box2<Box2<Box2<String>>> zBox = new Box2<>();
//         zBox.set(wBox);

//         System.out.println(zBox.get().get().get());
        

//     }
// }

// class Box2<T>{
//     private T name;

//     public void set(T o){
//         name = o;
//     }

//     public T get(){
//         return name;
//     }

// }