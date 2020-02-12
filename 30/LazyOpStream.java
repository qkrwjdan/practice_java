import java.util.stream.IntStream;

class LazyOpStream{
    public static void main(String[] args) {
        IntStream.of(1,3,6).peek(d->System.out.print(d + "\t"));
        System.out.println();

        IntStream.of(5,3,1).peek(d -> addOneAndPrint(d)).sum();
        System.out.println();
    }
    public static void addOneAndPrint(int d){
        d += 1;
        System.out.println(d);
    }

}