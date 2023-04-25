package AttendanceTracker;

import java.util.*;

public class SemesterOptions {
    
    public void displaySemestersFromMap(HashMap<Integer, String> semesters) { 
        System.out.println("Semesters available:");
        for(int i = 1; i <= semesters.size(); i++) { 
            System.out.print(i +".) "+ semesters.get(i) );
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
