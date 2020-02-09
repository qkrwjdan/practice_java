import java.util.Optional;

class FlatMapElseOptional{
    public static void main(String[] args) {

        Optional<ContInfo> ci = Optional.of(
            new ContInfo(Optional.ofNullable(null),Optional.ofNullable("Republic of Korea"))
        );
        
        String phone = ci.flatMap(ContInfo::getPhone).orElse("There is no phone number");
        String adrs = ci.flatMap(ContInfo::getAdrs).orElse("there is no adrs");

        System.out.println(phone);
        System.out.println(adrs);
        
    }
}

class ContInfo{
    Optional<String> phone;
    Optional<String> adrs;

    public ContInfo(Optional<String> ph, Optional<String> ad){
        phone = ph; adrs = ad;
    }

    public Optional<String> getPhone() {return phone;}
    public Optional<String> getAdrs(){return adrs;}
}

