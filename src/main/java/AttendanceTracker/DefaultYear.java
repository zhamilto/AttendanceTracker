package AttendanceTracker;

import java.util.Calendar;

public class DefaultYear {

    static int defaultYear(){
        Calendar calendar = Calendar.getInstance();
        int currentYear = calendar.get(Calendar.YEAR);
        System.out.println("The current year is "+ currentYear);
        return currentYear;
    }
}
