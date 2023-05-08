package AttendanceTracker;

import java.util.*;

public class SemesterOptions { 
    static HashMap<Integer, String> semesters = new HashMap<Integer, String>(){{
        put(1, "Spring");
        put(2, "Fall");
    }};
    /*
     * Displays semesters from HashMap in format from 1-n semesters with most recent semester displayed last.
     */
    public static void displaySemestersFromMap(HashMap<Integer, String> semesters) { 
        System.out.println("Semesters available:");
        for(int i = 1; i <= semesters.size(); i++) { 
            System.out.println(i +".) "+ semesters.get(i) );
        }
    }

    /*
     * Prompts user using while loop until they provide a semester option available in the HashMap's keys.
     */
    public static int promptUserforSemester(HashMap<Integer, String> semesters) {       
        Scanner input = new Scanner(System.in);

        System.out.println("Please select one of the previous semesters by typing the corresponding number. Or enter zero as a deafult.");
        int choice;
        while (true) {
            if (input.hasNextInt()) {
                choice = input.nextInt();
                if (choice >= 0 && choice <= semesters.size()) { 
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

    /*
     * Returns semester from semester HashMap using choice as key.
     */
    public static String selectSemester (HashMap<Integer, String> semesters, Integer choice) {
        return semesters.get(choice);
    }

    /*
     * Returns default semester as last semester in HashMap.
     */
    public static String selectDefaultSemester(HashMap<Integer, String> semesters) {
        String lastsemester = semesters.get(semesters.size());
        return lastsemester;
    }   
}
