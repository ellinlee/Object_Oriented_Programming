package LAB6;

public abstract class Patient {
    public double expense;
    public double drugPrice;
    public static int number=10;
    public int PatientNumber;

    public Patient(double drugPrice){
        this.drugPrice=drugPrice;
        this.PatientNumber = number++;
    }

    public abstract double computeExpenses();
}
