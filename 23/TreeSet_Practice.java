import java.util.TreeSet;
import java.util.Iterator;
import java.util.Comparator;

class TreeSet_Practice{
    public static void main(String[] args) {
        TreeSet<Integer> tr = new TreeSet<>(new IntegerComparator());
        tr.add(30);
        tr.add(20);
        tr.add(10);
        System.out.println(tr);
    }
}

class IntegerComparator implements Comparator<Integer>{
    public int compare(Integer num1, Integer num2){
        return num2 - num1;
    }
}