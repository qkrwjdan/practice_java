class Practice6_2{
    public static void main(String[] args){
        int n = 17;
        System.out.println(primeNumber(n));
        for(int i=0;i<100;i++){
            if (primeNumber(i)){
                System.out.println(i);
            }
        }
    }

    public static boolean primeNumber(int num){
        for(int i=2;i<num;i++){
            if (num % i == 0)
                return false;
        }   
        return true;

    }
}