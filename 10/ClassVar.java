public class ClassVar{
    public static void main(String[] args) {
        InstCnt i1 = new InstCnt();
        InstCnt i2 = new InstCnt();
        InstCnt i3 = new InstCnt();
        InstCnt i4 = new InstCnt();
        
    }
}

class InstCnt{
    private static int instNum = 0;

    InstCnt(){
        instNum++;
        System.out.println("인스턴스 갯수 : " + instNum);
    }
}