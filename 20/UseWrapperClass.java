class UseWrapperClass{
    public static void main(String[] args) {
        Integer iInst = new Integer(3);
        showData(iInst);
        showData(new Double(8.124));
    }

    public static void showData(Object obj){
        System.out.println(obj);
    }
}