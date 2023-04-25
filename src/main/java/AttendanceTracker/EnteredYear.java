package AttendanceTracker;

import java.util.Scanner;

public class EnteredYear {
    static int enteredYear(){
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the year: ");
        int userEnteredYear = scan.nextInt();
        while(userEnteredYear < 0 || userEnteredYear < 2010 || userEnteredYear > 2023){
            System.out.println("Please enter a valid year: ");
            userEnteredYear = scan.nextInt();
        }
        System.out.println("The entered year is " + userEnteredYear);
        return userEnteredYear;
    }
}
