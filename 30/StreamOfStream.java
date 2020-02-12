import java.util.List;
import java.util.Arrays;
import java.util.stream.Stream;

class StreamOfStream{
    public static void main(String[] args) {
        Stream.of(11,22,33,44).forEach(n->System.out.print(n + "\t"));
        System.out.println();

        Stream.of("So simple").forEach(s -> System.out.print(s + "\t"));
        System.out.println();

        List<String> s1 = Arrays.asList("Box","Robot","Toy");
        Stream.of(s1).forEach(w -> System.out.print(w + "\t"));
        System.out.println();
    }
}