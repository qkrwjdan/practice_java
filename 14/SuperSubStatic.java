class SuperClass{
    // private static int count = 0; -> 오류
    protected static int count = 0;
    public SuperClass(){
        count++;
    }

}

class SubClass extends SuperClass{

    SubClass(){
        super();
    }

    public void showCount(){
        System.out.println(count);
    }
}

class SuperCubStatic{
    public static void main(String[] args) {
        SuperClass obj1 = new SuperClass();
        SubClass obj2 = new SubClass();

        obj2.showCount();
    }
}