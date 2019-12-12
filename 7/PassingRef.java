class PassingRef{
    public static void main(String[] args)
    {
        BankAccount ref = new BankAccount();
        ref.deposit(3000);
        ref.withdraw(300);
        check(ref);
    }
    public static void check(BankAccount acc){
        acc.checkMyBalance();
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