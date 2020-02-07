import java.util.List;
import java.util.Arrays;
import java.util.function.IntPredicate;

class IntPredicateDemo{
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1,5,7,9,11,12);
        int s;
        s = sum(n-> n%2 ==0,list);
        System.out.println("짝수합 : " + s);
        s = sum(n-> n%2 != 0,list);
        System.out.println("홀수합 : " + s);


    }
    public static int sum(IntPredicate ip, List<Integer> lst){
        int s = 0;
        for(int n: lst){
            if(ip.test(n))
                s += n;
        }
        return s;
    }
}
