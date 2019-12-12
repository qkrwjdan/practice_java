class SwitchBasic{
    public static void main(String[] args)
    {
        int n = 8;
        switch(n){
        case 1:
            System.out.println("1");
            break;
        case 2:
            System.out.println("2");
            break;
        case 3:
            System.out.println("3");
            break;
        case 4: case 5: case 6: case 7: case 8:
            System.out.println("4");
            break;
        default :
            System.out.println("default");
        }

    }
}