class Practice5_3{
    public static void main(String[] args)
    {
        int n = 3;
        
        switch(n){
        case 1: case 2: case 3: case 4:
            System.out.println("1이상 5미만의 수");
            break;
        case 5: case 6: case 7: case 8:
            System.out.println("5이상 9미만의 수");
            break;
        case 9: case 10: case 11: case 12:
            System.out.println("9이상 13미만의 수");
            break;
        }
    }
}