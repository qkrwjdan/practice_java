class Lambda1{
    public static void main(String[] args) {
        Printable prn = new Printable(){
            @Override
            public void print(String s){
                System.out.println(s);
            }
        };
        prn.print("What is Lambda?");
    }

}

interface Printable{
    void print(String s);
}

// class Printer implements Printable{
//     public void print(String s){
//         System.out.println(s);
//     }
// }