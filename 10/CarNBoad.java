class Car {
    void myCar(){
        System.out.println("This is my car");
    }

}

class Boad{
    void myBoad(){
        System.out.println("This is my Boad!!!!");
    }
    public static void main(String[] args) {
        Boad newboad = new Boad();
        Car newCar = new Car();
        newboad.myBoad();
        newCar.myCar();
    }
}