class Accumulator{
    static int result = 0;

    static void add(int num){
        result = result + num;
    }

    static void showResult(){
        System.out.println(result);
    }

    public static void main(String[] args) {
        for(int i =0; i<10;i++)
        {
            Accumulator.add(i);
        }
        Accumulator.showResult();
    }
}