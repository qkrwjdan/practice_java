public class EnhancedFor{
    public static void main(String[] args) {
        Person[] ar = {new Person("jiyoung",23),new Person("jungmoo",23)};
        // Person[] ar = new Person[2];
        // ar[0] = new Person("jy",23);
        // ar[1] = new Person("jm",23);
        for(Person p : ar)
        {
            System.out.println(p);
        }
    }

}

class Person{
    String name;
    int age;
    
    Person(String name,int age){
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return this.name;
    }
}