class Circle{
    private double rad = 0;
    final double PI = 3.14;

    public Circle(double r){
        setRad(r);
    }
    //setter : 인스턴스 변수의 값을 설정하는 용도로 정의된 메소드
    public void setRad(double r){
        if(r<0){
            rad = 0;
            return;
        }
        rad = r;
    }
    //getter : 인스턴스 변수의 값을 참조하는 용도로 정의된 메소드
    public double getRad(){
        return r;
    }

    public double getArea(){
        return (rad * rad) * PI;
    }

}

class UnsafeCircle{
    public static void main(String[] args) {
        Circle c = new Circle(1.5);
        System.out.println(c.getArea());

        c.setRad(14);
        System.out.println(c.getArea());
        //잘못된 접근법
        //c.rad = -4.5
        System.out.println(c.getArea());
    }
}