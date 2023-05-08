package  AttendanceTracker;

import java.util.Calendar;
import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.*;



public class YearOptions {
    static Scanner scan = new Scanner(System.in);
    static void userChooseYearStyle(){
        System.out.print("Do you want to (E) enter a year or (C) use the current year as the default?: ");
        String letterChoice = scan.nextLine();
        if (letterChoice.toLowerCase().equals("e")) {
            enteredYear();
        }
        if (letterChoice.toLowerCase().equals("c")) {
            defaultYear();
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

