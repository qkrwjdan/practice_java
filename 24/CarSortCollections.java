import java.util.List;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Collections;

class CarSortCollections{
    public static void main(String[] args) {
        List<Car> list = new ArrayList<>();
        list.add(new Car(1000));
        list.add(new Car(2000));
        list.add(new Car(3000));
        list.add(new Car(1200));
        list.add(new Car(2300));

        Collections.sort(list);

        for(Iterator<Car> itr = list.iterator();itr.hasNext();)
            System.out.print(itr.next() + "\t");

        System.out.println();

        List<ECar> eList = new ArrayList<>();
        eList.add(new ECar(1000));
        eList.add(new ECar(2000));
        eList.add(new ECar(3000));
        eList.add(new ECar(1200));
        eList.add(new ECar(2300));
        for(Car c : eList){
            System.out.print(c + "\t");
        }
        System.out.println();

        Collections.sort(eList);

        for(Car c : eList){
            System.out.print(c + "\t");
        }
        System.out.println();
        

    }
}

class Car implements Comparable<Car>{
    private int disp;

    public Car(int p){disp = p;}

    @Override
    public String toString(){
        return "cc : " + disp;
    }

    @Override
    public int compareTo(Car o){
        return disp - o.disp;
    }
}

class ECar extends Car{
    public ECar(int n){
        super(n);
    }
}

