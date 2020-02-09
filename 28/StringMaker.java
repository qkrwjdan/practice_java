import java.util.function.Function;

class StringMaker{
    public static void main(String[] args) {
        Function<char[],String> f = String::new;

        char[] src = {'R','o','b','o','t'};
        String str = f.apply(src);
        System.out.println(str);

        Function<Integer,Double> itdf = Double::new;

        Double d = new Double(2);
        Integer in = new Integer(3);
        d = itdf.apply(in);
        System.out.println(d);
    }
}

// Function(T,R) R apply(T t);