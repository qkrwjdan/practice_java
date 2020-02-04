import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

class HashCode_Practice{
    public static void main(String[] args) {
        HashSet<Person> set = new HashSet<>();
        set.add(new Person("jm",22));
        set.add(new Person("jm",23));
        set.add(new Person("jm",24));
        set.add(new Person("jy",22));
        set.add(new Person("jy",22));
        set.add(new Person("jm",22));
        set.add(new Person("jy",24));

        System.out.println(set.size());
        for(Person p : set)
            System.out.println(p);
    }
}

class Person{
    private String name;
    private int age;

    public Person(String name,int age){
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString(){
        return name + "(" + age + "세)";
    }

    @Override
    public boolean equals(Object ob){
        String obName = ((Person)ob).name;
        int obAge = ((Person)ob).age;

        if(this.name.equals(obName) && (this.age == obAge))
            return true;
        else
            return false;
    }

    @Override
    public int hashCode(){
        return Objects.hash(name,age);       
    }
}