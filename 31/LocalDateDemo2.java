import java.time.LocalDate;
import java.time.Period;

class LocalDateDemo2{
    public static void main(String[] args) {
        LocalDate today = LocalDate.now();
        System.out.println("Today : " + today);

        LocalDate xmas = LocalDate.of(today.getYear(),12,25);
        System.out.println("Xmas : " + xmas);

        Period bet = Period.between(today, xmas);
        System.out.println(bet);

    }
}