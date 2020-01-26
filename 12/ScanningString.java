import java.util.Scanner;

class ScannerString{
    public static void main(String[] args) {
        String source = "13 5 1020";
        Scanner sc = new Scanner(source);
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        int num3 = sc.nextInt();
        int sum = num1 + num2 + num3;

        System.out.println(num1 + " + " + num2 + " + " + num3 + " = " + sum);
    }
}