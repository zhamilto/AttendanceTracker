package  AttendanceTracker;

import java.util.Calendar;
import java.util.Scanner;


public class YearOptions {
    public static void main(String[] args) {
        userChooseYearStyle();
    }


    static Scanner scan = new Scanner(System.in);
    
    static int userChooseYearStyle() {
        System.out.print("Do you want to (1.) enter a year or (2.) use the current year as the default?: ");
        int numChoice = scan.nextInt();
        if (numChoice == 1) {
            return enteredYear();
        }
        if (numChoice == 2) {
            return defaultYear();
        }
        if(numChoice != 1 || numChoice != 2){
            System.out.println("Invalid input. Please enter a year as a number.");
            numChoice = Integer.parseInt(scan.next());
        }
        return 0;
    }
    
    static int defaultYear(){
        int currentYear = Calendar.getInstance().get(Calendar.YEAR);
        System.out.println("The current year is "+ currentYear);
        return currentYear;
    }

    static int enteredYear() {
        Scanner scanner = new Scanner(System.in);
        int userEnteredYear;
        do {
            System.out.print("Enter the year: ");
            while (!scanner.hasNextInt()) {
                String input = scanner.next();
                System.out.printf("\"%s\" is not a valid year.\n", input);
                System.out.print("Enter the year: ");
            }
            userEnteredYear = scanner.nextInt();
        } while (userEnteredYear  < 2010 || userEnteredYear > 2023);
        System.out.println("The entered year is " + userEnteredYear);
        return userEnteredYear;
    }
}

