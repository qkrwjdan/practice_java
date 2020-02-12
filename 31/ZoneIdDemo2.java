import java.time.ZoneId;

class ZoneIdDemo2{
    public static void main(String[] args) {
        ZoneId.getAvailableZoneIds().stream().sorted().forEach(s->System.out.println(s));
    }
}