class ReturnStringBuilder{
    public static void main(String[] args) {
        StringBuilder stb1 = new StringBuilder("1234");
        
        stb1.append("5678");
        System.out.println(stb1);

        StringBuilder stb2 = new StringBuilder(320);
        stb2 = stb1.delete(0,5);
        System.out.println(stb1);
        System.out.println(stb2);

        if (stb1 == stb2 )
            System.out.println("same");
        else
            System.out.println("diff");



    }   
        

}