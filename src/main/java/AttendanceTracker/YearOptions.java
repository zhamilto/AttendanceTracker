package  AttendanceTracker;

import java.util.Calendar;
import java.util.Scanner;


public class YearOptions {
    public static void main(String[] args) {
        userChooseYearStyle();
    }


    static Scanner scan = new Scanner(System.in);
    
    static int userChooseYearStyle() {
        System.out.print("Enter 1 to input a year or press ENTER key to use the current year as the default?: ");
        String enter = scan.nextLine();
        if (enter.isEmpty()) {
            return defaultYear();
        } else {
            try {
                int numChoice = Integer.parseInt(enter);
                if (numChoice == 1) {
                    return enteredYear();
                } else if (numChoice == 2) {
                    return defaultYear();
                } else {
                    System.out.println("Invalid input. Please enter 1 or press enter key.");
                    return userChooseYearStyle();
                }
            } catch (NumberFormatException e) {
                System.out.println("Invalid input. Please enter 1 or press enter key.");
                return userChooseYearStyle();
            }
        }
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

