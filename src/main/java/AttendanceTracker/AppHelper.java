package AttendanceTracker;
import java.util.*;

public class AppHelper {
   
    public static int yearOption() {       
        Scanner input = new Scanner(System.in);
        
        System.out.println("Please select from the following by typing the corresponding number.");
        System.out.println("-----------------------------\n");
        System.out.println("1.) - Input a year");
        System.out.println("2.) - Use current year");

        int choice = 0;
        while (true) {
            if (input.hasNextInt()) {
                choice = input.nextInt();
                if (choice == 1 || choice == 2) { 
                    return choice; 
                } else {
                    System.out.println("Invalid input. Please select:\n1.) - Input a year\n2.) - 3 Use current year");
                }
            } else {
                System.out.println("Invalid input. Please enter an integer");
                input.next();
            }
        }   
    }

    public static int promptForYear() {
        Scanner input = new Scanner(System.in);
        int currentyear = Calendar.getInstance().get(Calendar.YEAR);
        int year = 0;

        System.out.println("Please input a year Format: (YYYY):");
       
        while (true) {
            if (input.hasNextInt()) {
                year = input.nextInt();
                //Lower bound is arbitrary 
                if (year >= 2000 && year <= currentyear) {
                    input.close();
                    return year;
                } else {
                    System.out.println("Invalid year given\nPlease input another year:");
                }
            }else{
                System.out.println("Invalid input. Please enter a year as a number.");
                input.next();
            }
        }
    }

    public static int yearFromChoice(int choice) {
        if(choice == 1){
            return promptForYear();
        }
        if(choice ==2){
            return Calendar.getInstance().get(Calendar.YEAR);
        }
        else
        { return 0;}
    }
}
