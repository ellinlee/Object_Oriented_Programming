package lab7;

import java.util.Calendar;


public class Magazine implements Article{
    int readby;
    String creationDate = "2018-1-1";

    public Magazine(String creationDate, int readby){
        this.creationDate = creationDate;
        this.readby = readby;
    }

    public boolean isOLD() {
        int calDateYears = Calendar.getInstance().get(Calendar.YEAR) - 2018;
        if(calDateYears >= 2)
            return true;
        else
            return false;
    }

    public boolean isPopular() {
        if(readby>=100)
            return true;
        else
            return false;
    }
}
