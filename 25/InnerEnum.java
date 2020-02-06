class InnerEnum{
    public static void main(String[] args) {
        Customer c1 = new Customer("jm","man");
        Customer c2 = new Customer("jy","woman");

        System.out.println(c1);
        System.out.println(c2);
        
    }
}

class Customer{
    enum Gender{
        MALE,FEMALE
    }
    private String name;
    private Gender gen;

    Customer(String n,String g){
        name = n;
        if(g.equals("man"))
            gen = Gender.MALE;
        else
            gen = Gender.FEMALE;
    }

    @Override
    public String toString(){
        if(gen == Gender.MALE)
            return "Ty Mr." + name;
        else
            return "Ty Ms." + name;
    }
}