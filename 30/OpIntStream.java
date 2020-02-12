import java.util.stream.IntStream;

class OpIntStream{
    public static void main(String[] args) {
        int sum = IntStream.of(1,3,5,7,9).sum();
        System.out.println("sum : " + sum);

        long cnt = IntStream.of(1,3,5,7,9).count();
        System.out.println("count : " + cnt);

        IntStream.of(1,3,5,7,9).average().ifPresent(s -> System.out.println("avg : " + s));
        IntStream.of(1,3,5,7,9).min().ifPresent(s -> System.out.println("min : " + s));
        IntStream.of(1,3,5,7,9).max().ifPresent(s -> System.out.println("max : " + s));



    }

}