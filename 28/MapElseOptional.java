import java.util.Optional;

class MapElseOptional{
    public static void main(String[] args) {
        Optional<ContInfo> ci = Optional.of(new ContInfo(null, "Republic of Korea"));

        String phone = ci.map(c->c.getPhone()).orElse("There is no phone number");
        String adrs = ci.map(c ->c.getAdrs()).orElse("There is no Adrs");

        System.out.println(phone);
        System.out.println(adrs);
    }

}

class ContInfo{
    String phone;
    String adrs;

    public ContInfo(String ph,String ad){
        phone = ph;
        adrs = ad;
    }

    public String getPhone(){return phone;}
    public String getAdrs(){return adrs;}

}
