// import java.util.List;
// import java.util.ArrayList;

// class ToyStream{

//     public static void main(String[] args) {
//         List<ToyPriceInfo> ls = new ArrayList<>();
//         ls.add(new ToyPriceInfo("GUN_LR_45",200));
//         ls.add(new ToyPriceInfo("Teddy_Bears_014",350));
//         ls.add(new ToyPriceInfo("Car_45",550));

//         int sum = ls.stream().filter(p -> p.getPrice() < 500).mapToInt(t -> t.getPrice()).sum();
//         System.out.println(sum);

//     }
// }

// class ToyPriceInfo{
//     private String model;
//     private int price;

//     public ToyPriceInfo(String s,int n){
//         model = s;
//         price = n;
//     }
//     public int getPrice(){
//         return price;
//     }
// }
