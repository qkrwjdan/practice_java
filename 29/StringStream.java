import java.util.Arrays;
import java.util.stream.Stream;

class StringStream{
    public static void main(String[] args) {
        String[] names = {"Yoon","Lee","Park"};
        Stream<String> stm = Arrays.stream(names);
        stm.forEach(s->System.out.println(s));
    }
}