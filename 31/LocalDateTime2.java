import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Duration;
import java.time.Period;

class LocalDateTime2{
    public static void main(String[] args) {
        LocalDateTime today = LocalDateTime.now();

        LocalDateTime flight1 = LocalDateTime.of(2020,3,14,11,20);
        LocalDateTime flight2 = LocalDateTime.of(2020,3,10,14,23);

        LocalDateTime myflight;
        LocalTime st = startTest();
        if(flight1.isBefore(flight2))
            myflight = flight1;
        else
            myflight = flight2;
        
        Duration dt = endTest(st);
        
        Period day = Period.between(today.toLocalDate(),myflight.toLocalDate());
        Duration time = Duration.between(today.toLocalTime(),myflight.toLocalTime());
        System.out.println(day);
        System.out.println(time);
    }

    public static LocalTime startTest(){
        LocalTime start = LocalTime.now();
        return start;
    }

    public static Duration endTest(LocalTime startedLocalTime){
        LocalTime now = LocalTime.now();
        Duration dt = Duration.between(startedLocalTime,now);
        System.out.println("걸린 시간 : " + dt);
        return dt;
    }
}

// public static LocalTime startTest(){
//     LocalTime start = LocalTime.now();
//     return start;
// }

// public static Duration endTest(LocalTime startedLocalTime){
//     LocalTime now = LocalTime.now();
//     Duration dt = Duration.between(startedLocalTime,now);
//     System.out.println("걸린 시간 : " + dt);
//     return dt;
// }