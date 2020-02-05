import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

class HashMapIteration{
    public static void main(String[] args) {
        HashMap<Integer,String> map = new HashMap<>();
        map.put(45,"Brown");
        map.put(37,"James");
        map.put(23,"Martin");

        Set<Integer> ks = map.keySet();
        for(Integer n : ks)
            System.out.println(n);
        System.out.println();

        for(Integer n : ks)
            System.out.println(map.get(n));
        System.out.println();

        for(Iterator itr = ks.iterator();itr.hasNext();)
            System.out.println(map.get(itr.next()));
        System.out.println();
   }
}