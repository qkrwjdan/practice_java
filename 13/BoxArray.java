class Box{
    private String conts;

    Box(String cont){
        this.conts = cont;
    }
    public String toString(){
        return conts;
    }
}

class BoxArray{
    public static void main(String[] args) {
        
        Box[] ar = new Box[3];

        ar[0] = new Box("First");
        ar[1] = new Box("Second");
        ar[2] = new Box("Third");

        for(int i =0;i<3;i++){
            System.out.println(ar[i]);
        }
    }
}