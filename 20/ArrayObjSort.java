import java.util.Arrays;
class ArrayObjSort{
    public static void main(String[] args) {
        Person[] ar = new Person[3];
        ar[0] = new Person(204,"jmadfs");
        ar[1] = new Person(21,"jmgdsfdfsgd");
        ar[2] = new Person(22,"hsasdfgsdfsdf");

        Arrays.sort(ar);

        for(Person p : ar){
            System.out.println(p);
        }
    }
}

class Person implements Comparable{
    int age;
    String name;

    public Person(int age,String name){
        this.age = age;
        this.name = name;
    }

    @Override
    public int compareTo(Object o){
        Person per = (Person)o;

        return this.name.length() - per.name.length();
    }

    @Override
    public String toString(){
        return this.age + " " + this.name;
    }
}