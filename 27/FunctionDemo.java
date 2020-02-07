import java.util.function.Function;

class FunctionDemo{
    public static void main(String[] args) {
        Function<String,Integer> f = s -> s.length();
        System.out.println(f.apply("im fly"));
        System.out.println(f.apply("i believe i can fly"));

        Function<Double,Double> fdouble1 = d -> d*0.393701;
        Function<Double,Double> fdouble2 = d -> d*0.254;

        System.out.println(fdouble1.apply(1.0));
        System.out.println(fdouble2.apply(1.0));


    }
}