package AttendanceTracker;

import java.util.*;

public class SemesterOptions {
    
    public static void displaySemestersFromMap(HashMap<Integer, String> semesters) { 
        System.out.println("Semesters available:");
        for(int i = 1; i <= semesters.size(); i++) { 
            System.out.print(i +".) "+ semesters.get(i) );
        }
    }

    public static int promptUserforSemester(HashMap<Integer, String> semesters) {       
        Scanner input = new Scanner(System.in);

        System.out.println("Please select one of the previous semesters by typing the corresponding number.");
        int choice = 0;
        try {
            while (true) {
                if (input.hasNextInt()) {
                    choice = input.nextInt();
                    if (choice >= 1 && choice <= semesters.size()) { 
                        return choice; 
                    } else {
                        System.out.println("Invalid input. ");
                        displaySemestersFromMap(semesters);
                    }
                } else {
                    System.out.println("Invalid input. Please enter an integer");
                    displaySemestersFromMap(semesters);
                    input.next();
                }
            }   
         }
        finally {
            input.close(); 
        }
    }

    public static String selectSemester (HashMap<Integer, String> semesters, Integer choice) {
        return semesters.get(choice);
    }

    public static String selectDefaultSemester(HashMap<Integer, String> semesters) {
        String lastsemester = semesters.get(semesters.size());
        return lastsemester;
    }
    
}
