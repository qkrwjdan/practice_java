class InstanceCloning{
    public static void main(String[] args) {
        Point org = new Point(3,5);
        Point cpy;

        try{
            cpy = (Point)org.clone();
            org.showPosition();
            cpy.showPosition();
        }
        catch(CloneNotSupportedException e){
            e.printStackTrace();
        }

    }
}

class Point implements Cloneable{
    private int xPos;
    private int yPos;

    public Point(int x, int y){
        xPos = x;
        yPos = y;
    }

    public void showPosition(){
        System.out.printf("[ %d, %d ]",xPos,yPos);
        System.out.println();
    }

    public void changePos(int x,int y){
        xPos = x;
        yPos = y;
    }

    @Override
    public Object clone() throws CloneNotSupportedException{
        return super.clone();
    }

}

class Rectangle implements Cloneable{
    private Point upperLeft;
    private Point lowerRight;

    public Rectangle(int x, int y, int x2, int y2){
        upperLeft = new Point(x,y);
        lowerRight = new Point(x2,y2);
    }

    public void changePos(int x1, int y1, int x2, int y2){
        upperLeft. changePos(x1, y1);
        lowerRight.changePos(x2,y2);
    }

    @Override
    public Object clone() throws CloneNotSupportedException{
        return super.clone();
    }

    public void showPosition(){
        System.out.println("좌측 상단 : ");
        upperLeft.showPosition();

        System.out.println("우측 하단 : ");
        lowerRight.showPosition();
        System.out.println();

    }
}

