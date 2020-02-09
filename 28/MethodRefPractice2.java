import java.util.function.BiFunction;

class MethodRefPractice2{
    public static void main(String[] args) {
        
        BiFunction<Integer,String,Bx1> bf = Bx1::new;

        Bx1<Integer,String> b1 = bf.apply(1,"Toy");
        Bx1<Integer,String> b2 = bf.apply(2,"Robot");

        b1.showIt();
        b2.showIt();
        
    }
}

class Bx1<T,U>{
    private T id;
    private U con;
    public Bx1(T i, U c){
        id = i;
        con = c;
    }

    public void showIt(){
        System.out.println("Id : " + id + "Con : " + con);
    }
}
