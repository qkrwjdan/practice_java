import java.util.Random;
import java.util.List;
import java.util.ArrayList;
import java.util.function.IntSupplier;

class IntSupplierDemo{
    public static void main(String[] args) {
        IntSupplier isp = () -> {
            Random rd = new Random();
            return rd.nextInt(100);
        };

        List<Integer> list = makeIntList(isp,10);
        System.out.println(list);
        
    }

    public static List<Integer> makeIntList(IntSupplier is, int n){
        List<Integer> list = new ArrayList<>();

        for(int i =0;i < n; i++)
            list.add(is.getAsInt());
        return list;
    }

}