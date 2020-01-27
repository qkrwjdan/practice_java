class Man{
    String name;

    public void tellYourName(){
        System.out.println(name);
    }
}

class BusinessMan extends Man{
    String company;
    String position;

    public BusinessMan(String company,String position, String name)
    {
        this.company = company;
        this.position = position;
        this.name = name;
    }

    public void tellYourInfo(){
        System.out.println(company);
        System.out.println(position);
        tellYourName();
    }
}

class MyBusinessMan{
    public static void main(String[] args) {
        BusinessMan man = new BusinessMan("big good company", "good", "jm");
        man.tellYourInfo();
        man.tellYourName();
    }
}
