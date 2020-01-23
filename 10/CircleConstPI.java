class Circle{
    static final double PI = 3.141592;
    private double radius;

    Circle(double rad){
        if(rad < 0)
            radius = 0;
        else
            radius = rad;
    }
    void showPerimeter(){
        double peri = (radius * 2) * PI;
        System.out.println("둘레 : " + peri);
    }

    void showArea(){
        double area = radius * radius * PI;
        System.out.println("면적 : " + area);
    }
}

public class CircleConstPI{
    public static void main(String[] args) {
        Circle c = new Circle(1.2);
        c.showArea();
        c.showPerimeter();
    }

}