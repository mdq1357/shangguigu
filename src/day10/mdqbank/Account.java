package day10.mdqbank;

public class Account {
    private double balance;
    public Account(double init_banlance){
        this.balance = init_banlance;
    }

    public double getBalance() {
        return balance;
    }
    public void withdraw(double amount){
        if(balance < amount){
            System.out.println("余额不足");
        }else{
            balance -= amount;
            System.out.println("成功取出" + amount);
        }
    }
    public void deposit(double amount){
        if(amount > 0){
            balance += amount;
            System.out.println("成功存入");
        }
    }
}
