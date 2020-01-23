public class OneClassEncapsulation{
    public static void main(String[] args) {
        ColdPatient patient = new ColdPatient();
        SinusCap sinus = new SinusCap();

        patient.takeSinus(sinus);
    }
}

class SinusCap{
    void sniTake(){
        System.out.println("hi!");

    }

    void sneTake(){
        System.out.println("afs");
    }

    void snuTake(){
        System.out.println("skfdk");
    }

    void take(){
        sniTake();
        sneTake();
        snuTake();
    }
}

class ColdPatient{
    void takeSinus(SinusCap cap){
        cap.take();
    }
}
