package Lab6;

public class ContBancar {
    double balance;
    public ContBancar(){
        this.balance=1000;
    }
    public void deposit(double amount)
    {
        balance +=amount;
        System.out.println("depunere efectuata:" +amount);
    }
    public void withdrawal(double amount){
        balance -=amount;
        System.out.println("retragere efectuata" +amount);
    }
    public double getBalance() {
        return balance;
    }
}
