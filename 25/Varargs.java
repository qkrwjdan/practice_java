class Varargs{
    public static void main(String[] args) {
        showAll("BOX");
        showAll("BOX","Toy");
        showAll("BOX","Toy","Apple","Micro");
        
    }
    public static void showAll(String...vargs){
        System.out.println("LEN : " + vargs.length);
        for(String s : vargs){
            System.out.print(s + "\t");
        }
        System.out.println();
    }
}