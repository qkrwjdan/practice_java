import java.util.List;
import java.util.LinkedList;
import java.util.Iterator;

class IteratorCollection{
    public static void main(String[] args) {
        
        List<String> list = new LinkedList<>();
        list.add("Toy1");
        list.add("Toy2");
        list.add("box");
        list.add("Toy3");
        list.add("box");
        list.add("Toy4");
        list.add("box");

        Iterator<String> itr = list.iterator();

        while(itr.hasNext()){
            System.out.print(itr.next() + "\t");
        }
        System.out.println();

        itr = list.iterator();

        String str;
        while(itr.hasNext()){
            str = itr.next();
            if(str.equals("box"))
                itr.remove();
        }

        itr = list.iterator();
        while(itr.hasNext()){
            System.out.print(itr.next() + "\t");
        }
        System.out.println();

    }
}