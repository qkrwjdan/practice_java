class StringEquality{
    public static void main(String[] args) {
        String str1 = new String("so simple");
        String str2 = new String("so simple");

        if(str1 == str2)
            System.out.println("str1 == str2");
        else
            System.out.println("str1 != str2");
        
        if(str1.equals(str2))
            System.out.println("str1.equals(str2) is true");
        else
            System.out.println("str1.equals(str2) is false");
    }
}