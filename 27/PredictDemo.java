import java.util.List;
import java.util.Arrays;
import java.util.function.Predicate;

class PredictDemo{
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1,2,3,4,5,6,7,8,9);
        int s;
        s = sum((n) -> n%2 == 0,list);
        System.out.println("짝수합 : " + s);
        s = sum((n) -> n%2 != 0,list);
        System.out.println("홀수합 : " + s);
    }

    public static int sum(Predicate<Integer> p,List<Integer> list){
        int s = 0;
        for(int n: list){
            if(p.test(n))
                s += n;
        }
        return s;
    }
}

