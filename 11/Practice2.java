class Practice2{
    public static void main(String[] args) {
        StringBuilder stb1 = new StringBuilder("990106-2132954");
        stb1.delete(6,7);
        stb1.insert(6," ");

        System.out.println(stb1);
    }
}