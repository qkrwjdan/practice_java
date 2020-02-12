import java.time.LocalDate;

class LocalDateDemo{
    public static void main(String[] args) {
        LocalDate today = LocalDate.now();
        System.out.println("today : " + today);

        LocalDate xmas = LocalDate.of(today.getYear(),12,25);
        System.out.println("Xmas : " + xmas);

        LocalDate xmaseve = xmas.minusDays(1);
        System.out.println("Xmas eve : " + xmaseve);
    }
}