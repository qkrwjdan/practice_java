import java.time.ZonedDateTime;
import java.time.ZoneId;
import java.time.Duration;
import java.time.LocalDateTime;

class ZoneDateTimeDemo{
    public static void main(String[] args) {
        ZonedDateTime hereNow = ZonedDateTime.of(LocalDateTime.of(2020, 02, 12, 10, 30, 24),ZoneId.of("Asia/Seoul"));
        System.out.println("Departure : " + hereNow );


        ZonedDateTime arrival = ZonedDateTime.of(LocalDateTime.of(2020,02,12,13,35,24),ZoneId.of("Europe/Paris"));
        System.out.println("arrival : " + arrival);

        Duration flightTime = Duration.between(hereNow, arrival);
        System.out.println(flightTime);
        
    }
}