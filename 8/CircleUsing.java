import com.wxfx.smart.Circle;

class CircleUsing{
    public static void main(String[] args)
    {
        Circle c1 = new Circle(3.5);
        System.out.println(c1.getArea());

        com.wxfx.simple.Circle c2 = new com.wxfx.simple.Circle(3.5);
        System.out.println(c2.getPerimeter());
    }
}