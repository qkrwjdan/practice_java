class Practice2{
    public static void main(String[] args) {
        Business b1 = new Business("jm","work");
        PersonalInfo per1 = new PersonalInfo("jm", 23, "jm", "work");
        PersonalInfo per2;

        try{
        per2 = per1.clone();
        per1.showBusinessInfo();
        per2.changeBz(new Business("jy", "1"));
        per2.showBusinessInfo();
        }
        catch(CloneNotSupportedException e){
            e.printStackTrace();
        }
    }

}

class Business implements Cloneable{
    private String company;
    private String work;

    public Business(String company, String work)
    {
        this.company = company;
        this.work = work;
    }

    public void showBusinessInfo(){
        System.out.println("com : " + company);
        System.out.println("work : " + work);
    }

    public void changeBusiness(String com,String work){
        this.company = com;
        this.work = work;
    }

    @Override
    public Business clone() throws CloneNotSupportedException{
        return (Business)super.clone();
    }

}

class PersonalInfo implements Cloneable{
    private String name;
    private int age;
    private Business bz;

    public PersonalInfo(String name, int age, String company, String work)
    {
        this.name = name;
        this.age = age;
        bz = new Business(company, work);
    }
    public void showBusinessInfo(){
        System.out.println("name : " + name);
        System.out.println("work : " + age);
        bz.showBusinessInfo();
    }

    public void changeBz(Business bz){
        this.bz = bz;
    }

    @Override
    public PersonalInfo clone() throws CloneNotSupportedException{
        PersonalInfo po;
        po = (PersonalInfo)super.clone();
        po.bz = bz.clone();

        return po;
    }
}