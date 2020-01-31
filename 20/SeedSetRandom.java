import java.util.Random;

class SeedSetRandom{
    public static void main(String[] args) {
        Random rand = new Random(System.currentTimeMillis());
        Random rand2 = new Random();
        Random rand3 = new Random();
        for(int i=0;i<7;i++){
            System.out.println("rand2 : " + rand2.nextInt(1000));
            System.out.println("rand1 : " + rand.nextInt(1000));
            System.out.println("rand3 : " + rand3.nextInt(1000));
        }
    }
}