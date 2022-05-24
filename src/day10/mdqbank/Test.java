package day10.mdqbank;

public class Test {
    public static void main(String[] args) {
        Bank bank = new Bank();
        bank.addCustomer("Jane","Smith");
        int index = bank.getNumberOfCustomer()-1;
        bank.getCustomers(index).setAccount(new Account(2000));
        bank.getCustomers(index).getAccount().withdraw(500);
        double balance = bank.getCustomers(index).getAccount().getBalance();
        System.out.println("索引为" + index +"的客户的账户余额为：" + balance);

    }
}
