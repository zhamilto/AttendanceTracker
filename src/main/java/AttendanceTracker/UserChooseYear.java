package AttendanceTracker;

import java.util.Scanner;

import static AttendanceTracker.DefaultYear.defaultYear;
import static AttendanceTracker.EnteredYear.enteredYear;

public class UserChooseYear {

    static Scanner scan = new Scanner(System.in);
    static void userChooseYearStyle(){
        System.out.print("Do you want to (E) enter a year or (C) use the current year as the default?: ");
        String letterChoice = scan.nextLine();
        if (letterChoice.equals("E")) {
            enteredYear();
        }
        if (letterChoice.equals("C")) {
            defaultYear();
        }
    }
}
