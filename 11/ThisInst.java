class SimpleBox{
    private int data;

    SimpleBox(int data){
        this.data = data;
    }
    // 안되는데...?
    // simpleBox(int data){
    //     this(data,0);
    // }
    void setData(int data){
        this.data = data;
    }
    int getData(){
        return this.data;
    }
}

class ThisInst{
    public static void main(String[] args) {
        SimpleBox box = new SimpleBox(99);
        System.out.println(box.getData());
        box.setData(77);
        System.out.println(box.getData());
    }
}