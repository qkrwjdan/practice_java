import java.util.List;
import java.util.Arrays;
import java.util.ArrayList;
import java.util.Collections;
import java.util.function.Consumer;

class ArrangeList{
    public static void main(String[] args) {
        List<Integer> ls = Arrays.asList(1,3,5,7,9);
        ls = new ArrayList<>(ls);

        //함수형 인터페이스의 정의
        Consumer<List<Integer>> c = Collections::reverse;
        c.accept(ls);
        System.out.println(ls);
    }
}

