import java.util.Scanner;

class ReadString{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("문자열 입력 : ");
        String str1 = sc.nextLine();
        System.out.println("문자열 입력 : ");
        String str2 = sc.nextLine();

        System.out.println("입력된 문자열 : " + str1);
        System.out.println("입력된 문자열 : " + str2);


        
    }
}