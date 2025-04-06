package LAB6;

public class Eyepatient extends Patient{
    public final int INITIALPE=10;
    public double surgPrice;
    public Eyepatient(double drugPrice, double surgPrice){
        super(drugPrice);
        this.surgPrice = surgPrice;
    }
    public double computeExpenses(){
        expense= surgPrice + INITIALPE + drugPrice;
        return expense;
    }
}
