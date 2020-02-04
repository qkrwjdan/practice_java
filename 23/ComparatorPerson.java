import java.util.TreeSet;
import java.util.Iterator;
import java.util.Comparator;

class ComparatorPerson{
    public static void main(String[] args) {
     
        TreeSet<Person> tree = new TreeSet<>(new PersonComparator());
        tree.add(new Person("jasm",22));
        tree.add(new Person("jfsdgy",23));
        tree.add(new Person("jaaaaaas",24));
        tree.add(new Person("jfsdgesdfasb",25));

        for(Person p : tree){
            System.out.println(p);
        }

    }
}

class Person implements Comparable<Person>{
    String name;
    int age;

    public Person(String name, int age){
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

class PersonComparator implements Comparator<Person>{
    public int compare(Person p1, Person p2){
        return p1.name.length() - p2.name.length();
    }
}