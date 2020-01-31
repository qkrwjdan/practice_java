class WrapperClassMethod{
    public static void main(String[] args) {
        Integer n1 = Integer.valueOf(10);
        Integer n2 = Integer.valueOf("1024");

        System.out.println("big num : " + Integer.max(n1,n2));
        System.out.println("small num : " + Integer.min(n1,n2));
        System.out.println("sum : " + Integer.sum(n1, n2));
        System.out.println();

        System.out.println("binary : " + Integer.toBinaryString(12));
        System.out.println("octal : " + Integer.toOctalString(12));
        System.out.println("Hex : " + Integer.toHexString(12));
    }
}