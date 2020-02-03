// class Wildcard_Practice2{
//     public static void main(String[] args) {
//         Bx<Integer> box1 = new Bx<>();
//         box1.set(24);
//         Bx<String> box2 = new Bx<>();
//         box2.set("Poly");

//         if(compBox(box1,25))
//             System.out.println("상자안에 25 저장");
//         if(compBox(box2, "Moly"))
//             System.out.println("상자 안에 moly저장");
        
//         System.out.println(box1.get());
//         System.out.println(box2.get());

        
//     }

//     public static <T> boolean compBox(Bx<? extends T> box, T con){
//         T bc = box.get();
//         // box.set(con); // 프로그래머의 실수로 삽입된 문장
//         return bc.equals(con);
//     }
// }

// class Bx<T> {
//     private T ob;
//     public void set(T ob){this.ob = ob;}
//     public T get(){return ob;}

// }

