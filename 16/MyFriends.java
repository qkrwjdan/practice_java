class MyFriends{
    public static void main(String[] args) {
        Friend[] friendArray = new Friend[3];
        friendArray[0] = new UnivFriend("jm", "010-8230-1768", "ice");
        friendArray[1] = new UnivFriend("jy", "010-4252-1768", "ice");
        friendArray[2] = new CompFriend("js", "010-1233-1768", "idontknow");

        for(Friend i : friendArray)
        {
            i.showInfo();
        }
    
    }

}

class Friend{
    protected String name;
    protected String phone;

    public Friend(String name, String phone){
        this.name = name;
        this.phone = phone;
    }

    public void showInfo(){
        System.out.println("name : " + name + "phone : " + phone);
    }

}

class UnivFriend extends Friend{
    private String major;
    
    public UnivFriend(String name,String phone,String major){
        super(name,phone);
        this.major = major;
    }

    public void showInfo(){
        System.out.println("name : " + name + " phone : " + phone + " major : " + major);
    }
}

class CompFriend extends Friend{
    private String depart;
    
    public CompFriend(String name,String phone,String depart){
        super(name,phone);
        this.depart = depart;
    }

    public void showInfo(){
        System.out.println("name : " + name + " phone : " + phone + " depart : " + depart);
    }
}