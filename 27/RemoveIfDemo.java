import java.util.List;
import java.util.Arrays;
import java.util.ArrayList;
import java.util.function.Predicate;

class RemoveIfDemo{    
    public static void main(String[] args) {
        List<Integer> list1 = Arrays.asList(1,-2,3,-4,5);
        list1 = new ArrayList<>(list1);
        List<Double> list2 = Arrays.asList(1.1,-2.2,3.3,-4.4,5.5);
        list2 = new ArrayList<>(list2);

        Predicate<Number> p = n ->n.doubleValue() < 0.0;
        list1.removeIf(p);
        list2.removeIf(p);
        System.out.println(list1);
        System.out.println(list2);
    }
}