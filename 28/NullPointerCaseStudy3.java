import java.util.Optional;

class NullPointerCaseStudy3{
    public static void main(String[] args) {
        Optional<Cip> ci = Optional.ofNullable(
           new Cip(Optional.ofNullable(null),Optional.ofNullable("Republic of Korea"))
        );

        Optional<Cmp> cp = Optional.of(new Cmp("toy",ci));
        Optional<Fr> fr = Optional.of(new Fr("toy2",cp));
        showAddr(fr);
    }

    public static void showAddr(Optional<Fr> f){
        String addr = f.flatMap(Fr::getCmp).flatMap(Cmp::getCip).flatMap(Cip::getAdrs).orElse("there is no addr");

        System.out.println(addr);
    }
}

class Fr{
    String name;
    Optional<Cmp> company;

    public Fr(String n,Optional<Cmp> com){
        name = n;company = com;
    }

    public String getName(){return name;}
    public Optional<Cmp> getCmp(){return company;}
}

class Cmp{
    String cname;
    Optional<Cip> cInfo;
    
    public Cmp(String n,Optional<Cip> cip){
        cname = n;cInfo = cip;
    }
    public String getCname(){return cname;}
    public Optional<Cip> getCip(){return cInfo;}
}

class Cip{
    Optional<String> phone;
    Optional<String> adrs;
    
    public Cip(Optional<String> ph,Optional<String> ad){
        phone = ph;adrs = ad;
    }
    public Optional<String> getPhone(){return phone;}
    public Optional<String> getAdrs(){return adrs;}
}
