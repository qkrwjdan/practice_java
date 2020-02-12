import java.time.LocalTime;
import java.time.Duration;

class LocalTimeDate2{
    public static void main(String[] args) {
        LocalTime start = LocalTime.of(14,24,35);
        System.out.println("이용시각 : " + start);

        LocalTime end = LocalTime.of(15,24,35);
        System.out.println("이용한 시간 : " + Duration.between(start,end));
        
    }
}