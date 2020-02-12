import java.util.Arrays;
import java.util.stream.Stream;

class FlatMapStream{
    public static void main(String[] args) {
        Stream<String> ss1 = Stream.of("My_age","your_life");

        Stream<String> ss2 = ss1.flatMap(s -> Arrays.stream(s.split("_")));
        ss2.forEach(n -> System.out.print(n + "\t"));
        
    }
}