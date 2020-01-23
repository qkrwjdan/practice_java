class CompString{
    public static void main(String[] args) {
        String st1 = "Lexicographically";
        String st2 = "lexicographically";
        int cmp;

        if(st1.equals(st2))
            System.out.println("same");
        else
            System.out.println("diff");

        cmp = st1.compareTo(st2);
        if(cmp == 0)
            System.out.println("same");
        else if(cmp < 0)
            System.out.println("st1 win!");
        else
            System.out.println("st2 win!");

        if(st1.compareToIgnoreCase(st2) == 0)
            System.out.println("same");
        else
            System.out.println("diff");
    }
}