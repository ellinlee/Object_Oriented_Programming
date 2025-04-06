package LAB6;

public abstract class Account {
    public String Id;
    public String name;
    public String Address;
    public double balance;

    public Account(String Id, String name, String Address, double balance){
        this.Id=Id;
        this.name=name;
        this.Address=Address;
        this.balance=balance;
    }

    public abstract double calculateInterest(int year);
}
