class WhatYourName{
    public static void main(String[] args)
    {
        AAA aaa = new AAA();
        aaa.showName();

        BBB bbb = new BBB();
        bbb.showName();

    }
}

class AAA{
    public void showName()
    {
        System.out.println("My name is AAA");
    }
}

class BBB{
    public void showName()
    {
        System.out.println("My name is BBB");
    }
}