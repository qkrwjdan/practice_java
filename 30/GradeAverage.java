import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.stream.Stream;
import java.util.stream.IntStream;

class GradeAverage{
    public static void main(String[] args) {
        ReportCard [] rpc = {new ReportCard(70,80,90),new ReportCard(80,60,20),new ReportCard(30,60,90)};
        Arrays.stream(rpc).flatMapToInt(r->IntStream.of(r.getKor(),r.getEng(),r.getMath())).average().ifPresent(avg -> System.out.println("avg : " + avg));

    }
}

class ReportCard{
    private int kor;
    private int eng;
    private int math;

    public ReportCard(int k,int e,int m){
        kor = k;eng = e;math = m;
    }

    public int getKor(){return kor;}
    public int getEng(){return eng;}
    public int getMath(){return math;}

}