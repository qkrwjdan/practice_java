class practice{
    public static void main(String[] args) {
        Point p1 = new Point(3,5);
        Circle c1 = new Circle(p1,10.25);

        c1.showCircleInfo();
    }
}

class Point{
    int xPos, yPos;
    public Point(int x, int y)
    {
        xPos = x;
        yPos = y;
    }

    public void showPointInfo(){
        System.out.println("[" + xPos + "," + yPos + "]");
    }
}

class Circle{
    Point point;
    double rad;

    public Circle(Point p, double r){
        point = p;
        rad = r;
    }

    void setRad(double r){
        rad = r;
    }

    double getRad(){
        return rad;
    }

    void showCircleInfo(){
        System.out.println(point.xPos + "," + point.yPos);
        System.out.println("반지름 : " + rad);
    }
}
