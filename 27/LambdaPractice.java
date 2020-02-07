// class LambdaPractice{
//     public static void main(String[] args) {
//         Cal<Integer> c = (a,b) -> a+b;
//         calAndShow(c,3,4);

//         calAndShow((a,b) -> a+b,2.5,7.1);
//         calAndShow((a,b) -> a-b,4,2);
//         calAndShow((a,b) -> a-b,4.9,3.2);

//     }

//     public static <T> void calAndShow(Cal<T> op, T n1, T n2){
//         T r = op.cal(n1,n2);
//         System.out.println(r);
//     }
// }

// interface Cal<T>{
//     T cal(T a, T b);
// }