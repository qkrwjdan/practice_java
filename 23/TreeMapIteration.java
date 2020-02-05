import java.util.Comparator;
import java.util.TreeMap;
import java.util.Iterator;
import java.util.Set;

class TreeMapIteration{
    public static void main(String[] args) {
        TreeMap<Integer,String> tree = new TreeMap<>(new AgeComparator());
        tree.put(45,"Brown");
        tree.put(37,"James");
        tree.put(23,"Martin");

        Set<Integer> ks = tree.keySet();

        for(Integer n : ks)
            System.out.println(n);
        System.out.println();

        for(Integer n : ks)
            System.out.println(tree.get(n));
        System.out.println();
    }
}

class AgeComparator implements Comparator<Integer>{
    public int compare(Integer i1, Integer i2){
        return i2 - i1;
    }
}