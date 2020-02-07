import java.util.List;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Collections;

class SLenComparator{
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("Robot");
        list.add("Lambda");
        list.add("Box");
        // Comp<String> s = (s1,s2)->{ return s1.length() - s2.length(); };
        // Comp<String> s = (s1,s2) -> s1.length()-s2.length();

        Collections.sort(list,(s1,s2) -> s2.length()-s1.length());

        for(String a : list)
            System.out.println(a);
        
    }
}

// class SLenComp implements Comparator<String> {
//     @Override
//     public int compare(String s1, String s2 ){
//         return s1.length() - s2.length();
//     }
// // }

// interface Comp<T> extends Comparator<T>{
//     @Override
//     public int compare(T s1, T s2);
// }

