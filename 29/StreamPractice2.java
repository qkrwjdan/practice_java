import java.util.List;
import java.util.ArrayList;

class StreamPractice2{
    public static void main(String[] args) {
        List<ToyPriceInfo> ls = new ArrayList<>();
        ls.add(new ToyPriceInfo("LAZER_GUN_LR_45",200));
        ls.add(new ToyPriceInfo("Teddy_Bears_014",350));
        ls.add(new ToyPriceInfo("Car_45",550));

        ls.stream().filter(p -> p.getModel().length() > 10).map(t -> t.getModel()).forEach(s->System.out.println(s));
    }
}

class ToyPriceInfo{
    private String model;
    private int price;

    public ToyPriceInfo(String s,int n){
        model = s;
        price = n;
    }
    public int getPrice(){
        return price;
    }
    public String getModel(){
        return model;
    }
}