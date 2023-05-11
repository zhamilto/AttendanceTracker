package AttendanceTracker;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CourseOptions {

    static List<String> courses = new ArrayList<String>(){{
//        add("CPSC 1724");
//        add("CPSC 2735");
//        add("CPSC 3055");
//        add("CPSC 3725");
        add("CPSC 2735 01 12345");
        add("CPSC 3113 01 54321");
        add("CPSC 1724 01 56789");
        add("CPSC 4999P 01 98765");
    }};

    public static void displayCourses(List<String> courses) {
        System.out.println("Available courses:");
        for(String course : courses){
            System.out.println("* "+ course);
        }
    } 

    public static String selectCourse(List<String> courses){
        Scanner keyboard = new Scanner(System.in);

        System.out.println("Type the course you wish select:");

        String searchedCourse = keyboard.nextLine();

        while(!courses.contains(searchedCourse)){
            System.out.println("Invalid selection");
            searchedCourse = keyboard.nextLine();
        }
        System.out.println("Selected course is: " + searchedCourse);
        return searchedCourse;
    } 
    
}
