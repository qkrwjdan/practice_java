import java.util.Random;
import java.util.List;
import java.util.ArrayList;
import java.util.function.Supplier;

class SupplierDemo{
    public static void main(String[] args) {
        Supplier<Integer> sp = () -> {
            Random rd = new Random();
            return rd.nextInt(50);
        };

        List<Integer> list = makeIntList(sp, 10);
        System.out.println(list);
        
    }
    public static List<Integer> makeIntList(Supplier<Integer> s,int n){
        List <Integer> list = new ArrayList<>();
        for(int i = 0;i<n;i++){
            list.add(s.get());
        }
        return list;
    }
}

