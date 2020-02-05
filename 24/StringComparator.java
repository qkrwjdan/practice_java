import java.util.List;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Collections;

class StringComparator{
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("RoBot");
        list.add("APPLE");
        list.add("Box");
        list.add("ARoBot");
        
        StrComp cmp = new StrComp();
        Collections.sort(list,cmp);
        int idx = Collections.binarySearch(list, "Box", cmp);
        System.out.println(list.get(idx));
        for(String s : list)
            System.out.print(s + "\t");
        System.out.println();
    }
}

class StrComp implements Comparator<String>{
    @Override
    public int compare(String str1, String str2){
        return str1.compareToIgnoreCase(str2);
    }
}