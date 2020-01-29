// class PrintDriver2{
//     public static void main(String[] args) {
//         String myDoc = "This is a report about.....";  

//         Printable prn = new Prn731Drv();
//         prn.print(myDoc);

//         System.out.println();

//         prn = new Prn204Drv();
//         prn.print(myDoc);

//         ColorPrintable cprn = new Prn909Drv();
//         cprn.print(myDoc);
//         cprn.colorPrint(myDoc);
//     }
// }

// interface Printable{
//     void print(String doc);
// }

// interface ColorPrintable extends Printable{
//     void colorPrint(String doc);
// }

// class Prn909Drv implements ColorPrintable{
    
//     @Override
//     public void print(String doc){
//         System.out.println("From MD-909 printer");
//         System.out.println(doc);
//     }
    
//     @Override
//     public void colorPrint(String doc){
//         System.out.println("From MD-909 printer");
//         System.out.println("This is Color print");
//         System.out.println(doc);
//     }
// }

// class Prn204Drv implements Printable{
//     @Override
//     public void print(String doc){
//         System.out.println("From MD-204 printer");
//         System.out.println(doc);
//     }
// }

// class Prn731Drv implements Printable{
//     @Override
//     public void print(String doc){
//         System.out.println("From MD-731 printer");
//         System.out.println(doc);
//     }

// }
