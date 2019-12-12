class BankAccountConstructor{
    public static void main(String[] args)
    {
        BankAccount ref = new BankAccount("11-22-33", "991123-1002435", 10000);
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
    String accNumber;
    String ssNumber;

    public BankAccount(String acc , String ss, int bal){
        accNumber = acc;
        ssNumber = ss;
        balance = bal;
    }

    public int deposit(int amount){
        balance = balance + amount;
        return balance;
    }

    public int withdraw(int amount){
        balance = balance - amount;
        return balance;
    }

    public int checkMyBalance(){
        System.out.println("계좌번호 : " + accNumber);
        System.out.println("주민번호 : " + ssNumber);
        System.out.println("남은 잔액 : " + balance);
        return balance;
    }
}