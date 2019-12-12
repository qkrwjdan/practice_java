class BankAccountOO{
    public static void main(String[] args)
    {
        BankAccount mybank1 = new BankAccount();
        BankAccount mybank2 = new BankAccount();

        mybank1.deposit(3000);
        mybank2.deposit(5000);

        mybank1.withdraw(1000);
        mybank2.withdraw(2000);

        mybank1.checkMyBalance();
        mybank2.checkMyBalance();

        BankAccount mybank3 = mybank1;
        mybank3.checkMyBalance();
        mybank3.deposit(300000);
        mybank1.checkMyBalance();
    }
}
class BankAccount{
    int balance = 0;

    public int deposit(int amount){
        balance = balance + amount;
        return balance;
    }

    public int withdraw(int amount){
        balance = balance - amount;
        return balance;
    }
    public int checkMyBalance(){
        System.out.println("남은 잔액 : " + balance);
        return balance;
    }
}