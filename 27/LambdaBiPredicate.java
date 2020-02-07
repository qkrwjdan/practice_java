import java.util.function.BiPredicate;

class LambdaBiPredicate{
    public static void main(String[] args) {
        BiPredicate<String,Integer> conv = (str,in) -> str.length() > in;

        if(conv.test("Robot",3))
            System.out.println("문자열길이 3 초과");
        else
            System.out.println("3이하");
        
        if(conv.test("Robot",5))
            System.out.println("문자열길이 5 초과");
        else
            System.out.println("5이하");
        
    }
}