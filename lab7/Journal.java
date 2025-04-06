package lab7;
import java.util.Calendar;

public class Journal implements Article{
    int readby;
    String creationDate="2020-12-12";

    public Journal(String creationDate, int readby){
        this.creationDate = creationDate;
        this.readby = readby;
    }

    @Override
    public boolean isOLD() {
        int calDateYears = Calendar.getInstance().get(Calendar.YEAR) - 2020;
        if(calDateYears >= 5)
            return true;
        else
            return false;
    }

    @Override
    public boolean isPopular() {
        if(readby>=100)
            return true;
        else
            return false;
    }
}
