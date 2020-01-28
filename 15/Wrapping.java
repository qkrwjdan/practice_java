class Wrapping{
    public static void main(String[] args) {
        Box b1 = new GoldPaperBox();
        Box b2 = new PaperBox();
        Box b3 = new Box();

        wrapBox(b1);
        wrapBox(b2);
        wrapBox(b3);
        
    }

    public static void wrapBox(Box box){
        box.Wrap();
    }
}

class Box{
    public void Wrap(){
        System.out.println("simple Wrap");
    }
}

class PaperBox extends Box{
    public void Wrap(){
        System.out.println("paper Wrap");
    }
}

class GoldPaperBox extends PaperBox{
    public void Wrap(){
        System.out.println("golden Wrap");
    }
}