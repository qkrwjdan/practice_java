import java.util.TreeSet;
import java.util.Iterator;

class ComparablePerson{
    public static void main(String[] args) {
        TreeSet<Person> tree = new TreeSet<>();
        tree.add(new Person("jm",22));
        tree.add(new Person("jy",23));
        tree.add(new Person("js",24));
        tree.add(new Person("jb",25));

        for(Person p : tree){
            System.out.println(p);
        }
        
    }
}

class Person implements Comparable<Person>{
    private String name;
    private int age;

    public Person(String name,int age){
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString(){return name + " : " + age;}

    @Override
    public int compareTo(Person p){
        return this.age - p.age;
    }

}