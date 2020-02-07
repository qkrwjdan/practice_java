// import java.util.List;
// import java.util.Arrays;
// import java.util.function.Predicate;

// class LambdaPractice2{
//     public static void main(String[] args) {
//         List<Integer> list1 = Arrays.asList(1,2,3,4,5,6,7,8,9,10);
//         show(n-> n % 2 != 0,list1);

//         List<Double> list2 = Arrays.asList(-1.2,3.5,-2.4,9.5,4.0);
//         show(n -> n > 0.0,list2);
//     }

//     public static <T> void show(Predicate<T> p,List<T> lst){
//         for(T par : lst){
//             if(p.test(par))
//                 System.out.print(par + "\t");
//         }
//         System.out.println();
//     }
// }