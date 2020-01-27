class SuperCLS{
    public SuperCLS(){
        System.out.println("im super");
    }
}

class SubCLS extends SuperCLS{
    public SubCLS(){
        System.out.println("im sub");
    }
}

class SuperSubCon{
    public static void main(String[] args) {
        new SubCLS();
    }
}