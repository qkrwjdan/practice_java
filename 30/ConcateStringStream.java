import java.util.Arrays;
import java.util.stream.Stream;

class ConcateStringStream{
    public static void main(String[] args) {
        Stream<String> ss1 = Stream.of("Cake","Milk");
        Stream<String> ss2 = Stream.of("Cake2","Milk2");

        Stream.concat(ss1,ss2).forEach(s -> System.out.print(s + "\t"));
        System.out.println();
    }
}