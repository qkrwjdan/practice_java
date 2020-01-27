class Man2{
    String name;

    Man2(String name){
        this.name = name;
    }
    public void tellYourName(){
        System.out.println(name);
    }

}

class BusinessMan2 extends Man2{
    String company;
    String position;

    public BusinessMan2(String company,String position, String name)
    {
        super(name);
        this.company = company;
        this.position = position;
    }

    public void tellYourInfo(){
        System.out.println(company);
        System.out.println(position);
        tellYourName();
    }
}

class MyBusinessMan2{
    public static void main(String[] args) {
        BusinessMan2 man = new BusinessMan2("big good company", "good", "jm");
        man.tellYourInfo();
    }
}
