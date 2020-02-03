// class Generic_Practice2{
//     public static void main(String[] args) {
//         DBox<String,Integer> box1 = new DBox<>();
//         DBox<String,Integer> box2 = new DBox<>();

//         box1.set("Orange",21);
//         box2.set("Apple",22);

//         String str = box1 + " \n" + box2;
//         System.out.println(str);
//     }
// }

// class DBox<L,R>{
//     private L left;
//     private R right;

//     public void set(L l,R r){
//         left = l;
//         right = r;
//     }

//     @Override
//     public String toString(){return left + " & " + right;}
// }