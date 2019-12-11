class Practice4_2{
    public static void main(String[] args)
    {
        int n1 = 7;
        int n2 = ~n1;
        int n3 = n2 + 1;
        
        System.out.println(n3);

        int num1 = 15678;

        int moveRight3 = num1 >> 2;
        int zeroOrOne = moveRight3 % 2;
        System.out.println(zeroOrOne);
        int moveRight5 = num1 >> 4;
        zeroOrOne = moveRight5 % 2;
        System.out.println(zeroOrOne);

        


    }
}