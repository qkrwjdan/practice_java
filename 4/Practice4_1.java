class Practice4_1{
    public static void main(String[] args)
    {
        int num1 = 10;
        int num2 = 20;
        int num3 = 30;
        num1 = num2 = num3;
        System.out.println(num1);
        System.out.println(num2);
        System.out.println(num3);

        double result = ((25 * 5) + (36 - 4) - 72) / 5.0;
        System.out.println(result);

        double n1 = ((25 + 5) + (36 / 4) - 72) * 5.0;
        double n2 = ((25 * 5) + (36 - 4) + 71) / 4.0;
        double n3 = (128 / 4) * 2;
        boolean res;
        res = (n1 > n2) && (n2 > n3);
        System.out.println(n1);
        System.out.println(n2);
        System.out.println(n3);
        System.out.println(res);
    }
}