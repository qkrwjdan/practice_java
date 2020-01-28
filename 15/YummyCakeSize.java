// class YummyCakeSize{
//     public static void main(String[] args) {
//         CheeseCake ca1 = new CheeseCake(10, 20);
//         Cake ca2 = ca1;

//         System.out.println(ca2.size);
//         System.out.println(ca1.size);

//         ca1.showCakeSize();
//         System.out.println();
//         ca2.showCakeSize();
        
//     }

// }

// class Cake{
//     public int size;

//     public Cake(int size){
//         this.size = size;
//     }

//     public void showCakeSize(){
//         System.out.println("Cake size : " + size);
//     } 
// }

// class CheeseCake extends Cake{
//     public int size;

//     public CheeseCake(int sz1, int sz2){
//         super(sz1);
//         this.size = sz2;
//     }

//     public void showCakeSize(){
//         System.out.println("size : " + super.size);

//         System.out.println("cheese size : " + this.size);
//     }
// }