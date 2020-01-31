import java.util.Arrays;

class ArrayObjSearch{
    public static void main(String[] args) {
        Person[] ar = new Person[3];
        ar[0] = new Person(204,"jmadfs");
        ar[1] = new Person(21,"jmgdsfdfsgd");
        ar[2] = new Person(22,"hsasdfgsdfsdf");
        Arrays.sort(ar);

        int idx = Arrays.binarySearch(ar,new Person(204,"jmadfs"));
        System.out.println(ar[idx]);

    }
}

class Person implements Comparable{
     private int age;
     private String name;

     public Person(int age,String name){
         this.age = age;
         this.name = name;
     }

     @Override
     public int compareTo(Object o){
         Person per = (Person)o;

         return this.name.compareTo(per.name);
     }

     public String toString(){
         return this.name + " : " + this.age;
     }
}


