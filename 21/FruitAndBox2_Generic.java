// class FruitAndBox2_Generic{
//     public static void main(String[] args) {
//         Box2<Apple> aBox = new Box2<Apple>();
//         Box2<Orange> oBox = new Box2<Orange>();

//         aBox.setOb(new Apple());
//         oBox.setOb(new Orange());

//         Apple ap = (Apple)aBox.getOb();
//         Orange or = (Orange)oBox.getOb();

//         System.out.println(ap);
//         System.out.println(or);
        

//     }
// }

// class Apple{
//     public String toString(){
//         return "I am Apple";
//     }
// }

// class Orange{
//     public String toString(){
//         return "I am Orange";
//     }
// }

// class Box2<T>{
//     private T ob;

//     public void setOb(T ob){
//         this.ob = ob;
//     }

//     public T getOb(){
//         return ob;
//     }

// }