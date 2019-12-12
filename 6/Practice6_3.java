class Practice6_3{
    public static void main(String[] args){
        int num = 10;
        int result = 0;
        result = two_sqaure(num);
        System.out.println(result);

    }

    public static int two_sqaure(int num){
        int result = 1;
        if (num == 1){
            return 2;
        }
        result = 2*two_sqaure(--num);
        return result;

    }
}