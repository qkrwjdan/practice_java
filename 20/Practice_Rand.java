import java.util.Random;
import java.util.Scanner;

class Practice_Rand{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();

        System.out.println("first num : ");
        int num1 = sc.nextInt();
        System.out.println("second num : ");
        int num2 = sc.nextInt();

        int bound;
        if(num1 > num2){
            bound = num1-num2+1;
            for(int i=0;i<10;i++){
                System.out.println(num2 + rand.nextInt(bound));
            }
        }
        else{
            bound = num2 - num1+1;
            for(int i=0;i<10;i++){
                System.out.println(num1 + rand.nextInt(bound));
            }
        }
    }
}