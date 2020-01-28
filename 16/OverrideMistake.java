class OverrideMistake{
    public static void main(final String[] args) {
        final ParentAdder adder = new ChildAdder();
        System.out.println(adder.add(3, 4));
    }

}

class ParentAdder {
    public int add(int a,int b) {
        return a + b;
    }

}

class ChildAdder extends ParentAdder {


    @Override
    // public double add(double a, double b){
    public int add(int a,int b) {
        System.out.println("덧셈을 진행합니다.");
        return a + b;
    }
}