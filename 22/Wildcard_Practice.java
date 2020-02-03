// class Wildcard_Practice{
//     public static void main(String[] args) {
//         Bx<Integer> box1 = new Bx<>();
//         box1.set(24);
//         Bx<Integer> box2 = new Bx<>();
//         box2.set(37);
//         Bx<Integer> result = new Bx<>();
//         result.set(0);
//         addBox(box1, box2, result);
//         System.out.println(result.get());
        
//     }
//     public static void addBox(Bx<? extends Integer> b1, Bx<? extends Integer> b2, Bx<? super Integer> b3){
//         b3.set(b1.get() + b2.get()); // 프로그래머의 실수가 있는 부분
//     }
// }

// class Bx<T>{
//     private T ob;
//     public void set(T o){ob = o;}
//     public T get() {return ob;}
// }

