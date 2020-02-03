// class Generic_Practice{
//     public static void main(String[] args) {
//         DBox<String,Integer> box1 = new DBox<>();
//         DBox<String,Integer> box2 = new DBox<>();
//         box1.set("Orange",25);
//         box2.set("Apple",26);
        
//         DDBox<DBox,DBox> Dbox1 = new DDBox<>();
//         Dbox1.set(box1,box2);

//         System.out.println(Dbox1);
//     }

// }

// class DBox<L,R>{
//     private L left;
//     private R right;

//     public void set(L o, R r){
//         left = o;
//         right = r;
//     }

//     @Override
//     public String toString(){ return left + " & " + right;}
// }

// class DDBox<LBox,RBox>{
//     private LBox left;
//     private RBox right;

//     public void set(LBox l,RBox r){
//         left = l;
//         right = r;
//     }

//     public String toString(){return left + " \n" + right;
//     }
// }
