import java.util.Arrays;
import java.util.stream.IntStream;

class CreateIntStream{
    public static void main(String[] args) {
        IntStream is3 = IntStream.of(7,3,5);
        showIntStream(is3);

        IntStream is4 = IntStream.range(5,8);
        showIntStream(is4);

        IntStream is5 = IntStream.rangeClosed(5, 8);
        showIntStream(is5);   
    }

    public static void showIntStream(IntStream is){
        is.forEach(n -> System.out.print(n + "\t"));
        System.out.println();
    }
}