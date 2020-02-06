// class UseLocalIner{
//     public static void main(String[] args){
//         Papers p = new Papers("서류내용 : 행복합니다");
//         Printable prn = p.getPrinter();

//         prn.print();
//     }

// }

// interface Printable{
//     void print();
// }

// class Papers{
//     private String con;
//     public Paper(String s) { con = s;}
    
//     public Printble getPrinter(){
        
//         class Printer implements Printable{
//             public void print(){
//                 System.out.println(con);
//             }
//         }

//         return new Printer();

//     }
// }