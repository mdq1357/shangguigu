package day10.mdqbank;

public class Bank {
    private Customer[] customers;
    private int numberOfCustomer;
    public Bank(){
        customers = new Customer[1000];
    }
    public void addCustomer(String f,String l){
        Customer cust = new Customer(f,l);
        customers[numberOfCustomer++] = cust;
    }

    public int getNumberOfCustomer() {
        return numberOfCustomer;
    }

    public Customer getCustomers(int index) {
        if(index >= 0 && index < numberOfCustomer){
            return customers[index];
        }else{
            return null;
        }

    }
}
