class SimpleMathUse{
    public static void main(String[] args) {
        System.out.println("PI : " + Math.PI);
        System.out.println("sqrt(2) : " + Math.sqrt(2));
        System.out.println();

        System.out.println("toDegrees(Math.PI) : " + Math.toDegrees(Math.PI));
        System.out.println("toDegrees(2 * Math.PI) : " + Math.toDegrees(2.0 * Math.PI));
        System.out.println();

        double radian45 = Math.toRadians(45);
        System.out.println("radian : " + radian45);
        System.out.println("sin 45 : " + Math.sin(radian45));
        System.out.println("cos 45 : " + Math.cos(radian45));
        System.out.println("tan 45 : " + Math.tan(radian45));

        System.out.println();

        System.out.println("log(23) : " + Math.log(23));
        System.out.println("pow(2,16) : " + Math.pow(2,16));



    }
}