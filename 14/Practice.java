class Practice{
    public static void main(String[] args) {
        HybridWaterCar sonata = new HybridWaterCar(10,100,1000);
        sonata.showCurrentGauge();
    }
    
}
class Car{
    int gasoline;
    Car(int gas){
        this.gasoline = gas;
    }
}

class HybridCar extends Car{
    int electric;
    HybridCar(int gas,int elec){
        super(gas);
        this.electric = elec;
    }
}

class HybridWaterCar extends HybridCar{
    int water;
    HybridWaterCar(int gas,int elec, int water){
        super(gas,elec);
        this.water = water;
    }
    
    public void showCurrentGauge(){
        System.out.println("gas : " + gasoline);
        System.out.println("elec : " + electric);
        System.out.println("water : " + water );
    }

}