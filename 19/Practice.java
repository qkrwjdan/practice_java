class Practice{
    public static void main(String[] args) {
        Point p1 = new Point(3,4);
        Point p2 = new Point(3,4);
        Point p3 = new Point(4,5);
        Point p4 = new Point(5,6);

        System.out.println("p1 vs p2 : " + p1.equals(p2));
        System.out.println("p1 vs p3 : " + p1.equals(p3));

        Rectangle r1 = new Rectangle(1,2,3,4);
        Rectangle r2 = new Rectangle(1,2,3,4);
        Rectangle r3 = new Rectangle(1,3,2,4);

        System.out.println("r1 vs r2 : " + r1.equals(r2));
        System.out.println("r1 vs r3 : " + r1.equals(r3));

    }
}

class Point{
    private int xPos;
    private int yPos;

    public Point(int x, int y){
        this.xPos = x;
        this.yPos = y;
    }

    public int getXPos(){
        return this.xPos;
    }

    public int getYPos(){
        return this.yPos;
    }
    
    @Override
    public boolean equals(Object obj){
        Point tempPoint;
        if (obj instanceof Point)
            tempPoint = (Point)obj;
        else{
            System.out.println("Point 객체를 입력하셔야 됩니다");
            return false;
        }

        if((this.xPos == tempPoint.getXPos()) && (this.yPos == tempPoint.getYPos()))
            return true;
        else
            return false;
    }
}

class Rectangle{
    private Point upLeft;
    private Point lowRight;

    public Rectangle(int x, int y, int x2, int y2){
        upLeft = new Point(x,y);
        lowRight = new Point(x2,y2);
    }

    public Point getUpLeft(){
        return this.upLeft;
    }
    public Point getLowRight(){
        return this.lowRight;
    }

    @Override
    public boolean equals(Object obj){
        Rectangle tempRec;
        if(obj instanceof Rectangle)
            tempRec = (Rectangle)obj;
        else{
            System.out.println("Rectangle객체를 입력하셔야 됩니다");
            return false;
        }

        if((this.upLeft.equals(tempRec.getUpLeft())) && (this.lowRight.equals(tempRec.getLowRight())))
            return true;
        else
            return false;
    }
}