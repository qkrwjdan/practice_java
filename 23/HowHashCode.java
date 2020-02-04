import java.util.HashSet;
import java.util.Set;
import java.util.Objects;

class HowHashCode{
    public static void main(String[] args) {
        HashSet<Car> set = new HashSet<>();
        set.add(new Car("model1","RED"));
        set.add(new Car("model2","RED"));
        set.add(new Car("model1","BLACK"));
        set.add(new Car("model2","BLACK"));
        set.add(new Car("model1","RED"));

        System.out.println("instance number: " + set.size());
        for(Car c : set)
            System.out.println(c.toString());    

    }
}

class Car{
    private String model;
    private String color;

    public Car(String md,String cl){
        this.model = md;
        this.color = cl;
    }

    @Override
    public String toString(){
        return model + " : " + color;
    }

    @Override
    public boolean equals(Object ob){
        Car obj = (Car)ob;
        if(this.model.equals(obj.model) && this.color.equals(obj.color))
            return true;
        else
            return false;
    }

    @Override
    public int hashCode(){
        return Objects.hash(model,color);
    }
}