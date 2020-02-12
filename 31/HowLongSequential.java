import java.util.List;
import java.util.Arrays;
import java.time.Instant;
import java.time.Duration;

class HowLongSequential{
    public static void main(String[] args) {
        List<Integer> nums = Arrays.asList(5,6,7,8,9);
        Instant start = Instant.now();
        nums.stream().map(n -> fibonacci(n)).forEach(l -> System.out.print(l + "\t"));

        Instant end = Instant.now();
        System.out.println("Sequential Processing : " + Duration.between(start,end).toMillis());

    }
    public static int fibonacci(int n){
        if(n==1 || n == 2)
            return 1;
        return fibonacci(n-1) + fibonacci(n - 2);
    }
}