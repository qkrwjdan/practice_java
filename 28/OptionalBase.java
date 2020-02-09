import java.util.OptionalInt;
import java.util.Optional;

class OptionalBase{
    
    public static void main(String[] args) {
    
    Optional<Integer> oi1 = Optional.of(3);
    Optional<Integer> oi2 = Optional.empty();

    System.out.println("step1");
    oi1.ifPresent(i->System.out.print(i + "\t"));
    oi2.ifPresent(i->System.out.print(i));
    System.out.println();

    System.out.println("step2");
    System.out.print(oi1.orElse(100) + "\t");
    System.out.print(oi2.orElse(100) + "\t");
    System.out.println();

    OptionalInt oii1 = OptionalInt.of(3);
    OptionalInt oii2 = OptionalInt.empty();

    System.out.println("step1");
    oii1.ifPresent(i->System.out.print(i + "\t"));
    oii2.ifPresent(i->System.out.print(i));
    System.out.println();

    System.out.println("step2");
    System.out.print(oii1.orElse(100) + "\t");
    System.out.print(oii2.orElse(100) + "\t");
    System.out.println();
    }
    
}