class Practice7_1{
    public static void main(String[] args)
    {
        Triangle t1 = new Triangle(10,20);
        System.out.println(t1.getArea());
        t1.setHeight(30);
        t1.setWidth(40);
        System.out.println(t1.getArea());
    }
}

class Triangle{
    int width;
    int height;
    
    public Triangle(int width , int height){
        this.width = width;
        this.height = height;
    }

    public int setWidth(int width){
        this.width = width;
        return this.width;
    }
    public int setHeight(int height){
        this.height = height;
        return this.height;
    }

    public double getArea(){
        return (width * height) / 2.0;
    }


}