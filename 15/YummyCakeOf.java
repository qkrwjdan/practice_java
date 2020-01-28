class YummyCakeOf{
    public static void main(String[] args) {
        Cake cake = new StrawberryCheeseCake();

        if(cake instanceof Cake){
            System.out.println("cake instance Ok");
            System.out.println("cake 을 상속하는 인스턴스!");
        }
        if(cake instanceof CheeseCake){
            System.out.println("cheese cake instance 거나 cheesecake을 상속하는 instance");
        }
        if(cake instanceof StrawberryCheeseCake){
            System.out.println("strawberry cheese cake instance");

        }
    }
}

class Cake{

}

class CheeseCake extends Cake{

}

class StrawberryCheeseCake extends CheeseCake{

}