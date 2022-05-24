package day10.mdqexer3;

public class Test {
    public static void main(String[] args) {
        Customer customer = new Customer("Jane","Smith");
        Account account = new Account(1000,2000,0.0123);
        customer.setAccount(account);//把account的地址赋给customer.account
        customer.getAccount().deposit(100);
        customer.getAccount().withdraw(960);
        customer.getAccount().withdraw(2000);
        System.out.println("Customer" + customer.getFirstName() + customer.getLastName() + "有一个id为" + customer.getAccount().getId() + "的账户，" +
                "余额为：" + customer.getAccount().getBalance() + ",年利率为：" + customer.getAccount().getAnnualInterestRate() + "。");
    }


}
