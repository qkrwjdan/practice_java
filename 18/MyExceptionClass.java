// import java.util.Scanner;

// class MyExceptionClass{
//     public static void main(String[] args) {
//         System.out.print("나이 입력  : ");

//         try{
//             int age = readAge();
//             System.out.println("입력된 나이 : " + age);
//         }
//         catch(ReadAgeException e){
//             System.out.println(e.getMessage());
//         }
//     }

//     public static int readAge() throws ReadAgeException{
//         Scanner kb = new Scanner(System.in);
//         int age = kb.nextInt();

//         if(age < 0)
//             throw new ReadAgeException();

//         return age;
//     }

// }

// class ReadAgeException extends Exception{
//     public ReadAgeException(){
//         super("유효하지 않은 나이입니다.");
//     }
// }

