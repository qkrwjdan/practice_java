import java.util.TreeSet;
import java.util.Iterator;

class SortedTreeSet{
    public static void main(String[] args) {
        TreeSet<Integer> tree = new TreeSet<Integer>();
        tree.add(3); tree.add(1);
        tree.add(2); tree.add(4);

        System.out.println("Instance number : " + tree.size());

        for(Integer n : tree){
            System.out.print(n.toString() + " ");
        }

        for(Iterator<Integer> itr = tree.iterator();itr.hasNext();)
        {
            System.out.print(itr.next().toString() + " ");
        }
        System.out.println();

        }
}