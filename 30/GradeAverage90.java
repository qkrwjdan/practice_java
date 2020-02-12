import java.util.stream.Stream;

class GradeAverage90{
    public static void main(String[] args) {
        ReportCard [] rpc = {new ReportCard(100,90,90),new ReportCard(80,100,100),new ReportCard(100,100,90)};    
        boolean b1 = Stream.of(rpc).mapToDouble(n -> (n.getKor() + n.getEng() + n.getMath())/3).allMatch(avg -> avg > 90);
        System.out.println("avg > 90 : " + b1);

        boolean b2 = Stream.of(rpc).mapToDouble(n -> (n.getKor() + n.getEng() + n.getMath())/3).anyMatch(avg -> avg > 90);
        System.out.println("any avg > 90 : " + b2);


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