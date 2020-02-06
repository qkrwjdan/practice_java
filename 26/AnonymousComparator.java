import java.util.ArrayList;
import java.util.List;
import java.util.Collections;
import java.util.Comparator;

class AnonymousComparator{
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("BOX");
        list.add("HI IM ");
        list.add("APLLE");
        list.add("ABOC");

        Comparator<String> cmp = new Comparator<String>() {
            @Override
            public int compare(String s1, String s2){
                return s1.length() - s2.length();
            }
        };

        Collections.sort(list,cmp);
        System.out.println(list);
    }

}