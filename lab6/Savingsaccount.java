package LAB6;

public class Savingsaccount extends Account {
    int year;
    public Savingsaccount(String Id, String name, String Address, double balance) {
        super(Id, name, Address, balance);

    }

    public double calculateInterest(int year) {
        double interest = (year/12) * balance;
        balance = balance + interest;
        System.out.println(balance);
        return balance;
    }
}


