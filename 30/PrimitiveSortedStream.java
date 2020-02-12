import java.util.stream.IntStream;
import java.util.stream.DoubleStream;

class PrimitiveSortedStream{
    public static void main(String[] args) {
        IntStream.of(11,22,33,66,44,55).sorted().forEach(s -> System.out.println(s));
        System.out.println();

        DoubleStream.of(1.1,2.2,6.6,4.4,3.3).sorted().forEach(s -> System.out.println(s));
        System.out.println();
    }
}