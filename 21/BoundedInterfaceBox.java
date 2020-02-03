// class BoundedInterfaceBox{
//     public static void main(String[] args) {
//         Box2<Apple> b1 = new Box2<>();
//         b1.set(new Apple());

//         Apple ap = b1.get();
//         System.out.println(ap);
        
//     }
// }

// interface Eatable{
//     public String eat();
// }

// class Apple implements Eatable{
//     public String toString(){
//         return "I am an Apple";
//     }

//     @Override
//     public String eat(){
//         return "It tastes so good!";
//     }
// }

// class Box2<T extends Eatable>{
//     T ob;

//     public void set(T o){
//         ob = o;
//     }

//     public T get(){
//         System.out.println(ob.eat());
//         return ob;
//     }
// }

