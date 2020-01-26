class AutoCallToString{

    public static void main(String[] args) {
        StringBuilder stb1 = new StringBuilder("12");
        System.out.println(stb1.toString());

        Box box1 = new Box("string");
        System.out.println(box1);
    }

}

class Box {
    private String cons;

    Box(String str){
        cons = str;
    }

    public String toString(){
        return cons;
    }

}