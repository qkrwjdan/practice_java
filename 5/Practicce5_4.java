class Practice5_4{
    public static void main(String[] args)
    {
        int n = 0;
        int sum = 0;
        while(n < 100){
            sum += n;
            n++;
        }
        System.out.println(sum);

        n = 0;
        while(n < 100){
            n++;
            System.out.println(n);
        }
        do{
            System.out.println(n);
            n--;
        }while(n > 0);
    }
}