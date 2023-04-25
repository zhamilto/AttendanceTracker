package AttendanceTracker;

import java.time.Year;

public class DefaultYear {



    static int defaultYear(){
        Year tempYear = Year.now();
        int currentYear = Integer.parseInt(String.valueOf(tempYear));
        System.out.println("The current year is "+ currentYear);
        return currentYear;
    }
}
