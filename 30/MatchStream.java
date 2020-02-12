import java.util.stream.IntStream;

class MatchStream{
    public static void main(String[] args) {
        boolean b = IntStream.of(1,2,3,4,5).allMatch(n -> n%2==0);
        System.out.println("all even : " + b);

        b = IntStream.of(1,2,3,4,5).anyMatch(n-> n%2==0);
        System.out.println("any even : " + b);
        
        b = IntStream.of(1,2,3,4,5).noneMatch(n-> n%2==0);
        System.out.println("none even : " + b);
        
    }
}