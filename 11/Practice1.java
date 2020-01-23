class Practice1{
    public static void main(String[] args) {
        String str1 = "990211-1132433";

        String str2 = str1.substring(0,6);
        String str3 = str1.substring(7,14);
        System.out.println(str2);
        System.out.println(str3);

        System.out.println(str2 + " " + str3);
    }
}