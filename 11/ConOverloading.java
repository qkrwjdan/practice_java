public class ConOverloading{
    public static void main(String[] args) {
        Person jungmoo = new Person(3333,7777);
        Person jiyoung = new Person(1111);

        jungmoo.showInfo();
        jiyoung.showInfo();
        
    }
}

class Person{
    private int regiNum;
    private int passNum;

    Person(int rnum, int pnum){
        regiNum = rnum;
        passNum = pnum;
    }

    Person(int rnum){
        regiNum = rnum;
    }

    void showInfo(){
        System.out.println("주민등록번호 : " + regiNum);

        if(passNum != 0){
            System.out.println("여권번호 : " + passNum);
        }
        else
            System.out.println("여권이 없습니다.");
    }
}

