import java.util.List;
import java.util.Arrays;
import java.util.ArrayList;
import java.util.stream.Stream;

class CollectStringStream{
    public static void main(String[] args) {
        String [] words = {"Hello World","Box","Rabbit","Toy"};
        Stream<String> ss = Arrays.stream(words);

        List<String> ls = ss.parallel().filter(s -> s.length() > 5).collect(() -> new ArrayList<>(),(c,s) -> c.add(s),(list1,list2) -> list1.addAll(list2));
        ls.forEach(s->System.out.print(s + "\t"));

        System.out.println();
    }

}