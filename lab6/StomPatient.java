package LAB6;

import java.util.SimpleTimeZone;

public class StomPatient extends Patient{
    final int INITIALPS=15;
    double labPrice;

    public StomPatient(double drugprice, double labPrice){
       super(drugprice);
       this.labPrice=labPrice;
    }

    public double computeExpenses(){
        expense=drugPrice+labPrice+INITIALPS;
        return expense;
    }
}
