import java.util.Optional;

class NullPointerCaseStudy{
    public static void main(String[] args) {
        Cip ci = new Cip("312--4234-3124","Republic of Korea");
        Cmp cp = new Cmp("YaHo co.",ci);
        Fr frn = new Fr("Lee SU",cp);

        showCompAddr(Optional.of(frn));
    }

    public static void showCompAddr(Optional<Fr> f){
        String adrs = f.map(Fr::getCmp).map(Cmp::getCip).map(Cip::getAdrs).orElse("there is no adrs");

        System.out.println(adrs);
    }
}

class Fr{
    String name;
    Cmp company;

    public Fr(String n,Cmp com){
        name = n;company = com;
    }

    public String getName(){return name;}
    public Cmp getCmp(){return company;}
}

class Cmp{
    String cname;
    Cip cInfo;
    
    public Cmp(String n,Cip cip){
        cname = n;cInfo = cip;
    }
    public String getCname(){return cname;}
    public Cip getCip(){return cInfo;}
}

class Cip{
    String phone;
    String adrs;
    
    public Cip(String ph,String ad){
        phone = ph;adrs = ad;
    }
    public String getPhone(){return phone;}
    public String getAdrs(){return adrs;}
}
