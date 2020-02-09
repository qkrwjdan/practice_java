import java.util.List;
import java.util.Arrays;
import java.util.ArrayList;
import java.util.Collections;
import java.util.function.Consumer;

class ForEachDemo{
    public static void main(String[] args) {
        List<String> ls = Arrays.asList("Box","Robot");
        ls.forEach(s -> System.out.println(s));
        ls.forEach(System.out::println);        
    }
}

