import java.util.List;
import java.util.ArrayList;
import java.util.LinkedList;

class ListCollections{
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();

        list.add("2Toy1");
        list.add("2Toy2");
        list.add("2Toy3");

        for(int i =0;i<list.size();i++){
            System.out.print(list.get(i) + "\t");
        }
        System.out.println();

        list.remove(0);

        for(int i =0;i<list.size();i++){
            System.out.print(list.get(i) + "\t");
        }
        System.out.println();

        List<String> list2 = new LinkedList<>();
        list2.add("1Toy1");
        list2.add("1Toy2");
        list2.add("1Toy3");

        for(int i =0;i<list2.size();i++){
            System.out.print(list2.get(i) + "\t");
        }
        System.out.println();

        list2.remove(0);

        for(int i =0;i<list2.size();i++){
            System.out.print(list2.get(i) + "\t");
        }
        System.out.println();

        System.out.println("for-each문을 이용한 list 출력");
        for(String s : list2){
            System.out.println(s);
        }

        

    }
}