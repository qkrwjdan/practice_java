import java.util.List;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Comparator;
import java.util.Collections;

class CarComparator{
    public static void main(String[] args) {
        List<Car> clist = new ArrayList<>();
        clist.add(new Car(1000));        
        clist.add(new Car(1200));        
        clist.add(new Car(1500));        
        clist.add(new Car(1400));        
        clist.add(new Car(1100));        

        List<ECar> elist = new ArrayList<>();
        elist.add(new ECar(1000,57));        
        elist.add(new ECar(1200,80));        
        elist.add(new ECar(1500,24));        
        elist.add(new ECar(1400,70));        
        elist.add(new ECar(1100,60));        

        CarComp comp = new CarComp();

        Collections.sort(clist,comp);
        Collections.sort(elist,comp);

        for(Iterator<Car> itr = clist.iterator();itr.hasNext();)
            System.out.print(itr.next() + "\t");
        System.out.println();
        for(Iterator<ECar> itr = elist.iterator();itr.hasNext();)
            System.out.print(itr.next() + "\t");
        System.out.println();
        
    }
}

class Car{
    protected int disp;
    public Car(int p){disp = p;}

    @Override
    public String toString(){return disp + " cc";}

}

class CarComp implements Comparator<Car>{
    public int compare(Car o1,Car o2){
        return o1.disp - o2.disp;
    }
}

class ECar extends Car{
    private int battery;

    public ECar(int d,int b){
        super(d);
        battery = b;
    }

    @Override
    public String toString(){return disp + " cc " + " battery : " + battery;}
}

