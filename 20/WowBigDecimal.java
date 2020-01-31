import java.math.BigDecimal;

class WowBigDecimal{
    public static void main(String[] args) {
        BigDecimal d1 = new BigDecimal("1.6");
        BigDecimal d2 = new BigDecimal("0.1");

        System.out.println("result : " + d1.add(d2));
        System.out.println("result : " + d1.multiply(d2));

        BigDecimal d3 = new BigDecimal(1.6);
        System.out.println(d3);

    }
}