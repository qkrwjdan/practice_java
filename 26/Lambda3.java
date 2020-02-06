class Lambda3{
    public static void main(String[] args) {
        Printable prn = (s) -> {System.out.println(s);};
        Printable prn2 = (String s) -> {System.out.println(s);};
        Printable prn3 = (l) -> {System.out.println(l);};
        prn.print("what is Lambda?");
        prn2.print("what is Lambda?");
        prn3.print("what is Lambda?");
        
    }
}

interface Printable{
    void print(String s);
}