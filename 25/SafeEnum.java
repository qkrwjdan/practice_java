class SafeEnum{
    public static void main(String[] args) {
        who(Person.MAN);
        // who(Animal.DOG);

    }
    public static void who(Person man){
        switch(man){
            case MAN:
                System.out.println("남성");
                break;
            case WOMAN:
                System.out.println("여성");
                break;
        }
    }
}

enum Animal{
    DOG,CAT
}

enum Person{
    MAN,WOMAN
}