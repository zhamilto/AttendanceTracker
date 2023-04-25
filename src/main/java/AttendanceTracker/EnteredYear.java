package AttendanceTracker;

import java.util.InputMismatchException;
import java.util.Scanner;

public class EnteredYear {
    static int enteredYear() {
        Scanner scanner = new Scanner(System.in);
        int userEnteredYear;
        try{
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
        } catch (InputMismatchException e) {
            throw new RuntimeException(e);
        }


    }


    }

