class ArrayIsInstance{
    public static void main(String[] args) {
        int[] ar1 = new int[5];
        double [] ar2 = new double[7];

        float[] ar3;
        ar3 = new float[9];

        System.out.println("ar1.length : " + ar1.length);
        System.out.println("ar2.length : " + ar2.length);
        System.out.println("ar3.length : " + ar3.length);

        //인스턴스를 생성하는 것이 아니라 인스턴스를 저장할 수 있는 참조변수만 만드는 것!
        ArrayClassEx[] ar = new ArrayClassEx[10];
        ar[0] = new ArrayClassEx();
        ar[1] = new ArrayClassEx();


    }
}

class ArrayClassEx{
    int[] intArray = new int[10];
    double[] doubleArray = new double[10];
    float[] floatArray = new float[10];
}