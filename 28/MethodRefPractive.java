import java.util.List;
import java.util.ArrayList;
import java.util.Collections;

class MethodRefPractice{
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("robot");
        list.add("alambda");
        list.add("box");

        Collections.sort(list,String::compareToIgnoreCase);
        System.out.println(list);

    }

}

// Comparator<String> c = (s1,s2) -> s1.compareToIgnoreCase(s2)