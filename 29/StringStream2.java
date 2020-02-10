import java.util.Arrays;

class StringStream2{
    public static void main(String[] args) {
        String[] names = {"Yoon","Lee","Park"};
        Arrays.stream(names).forEach(s -> System.out.println(s));
    }
}