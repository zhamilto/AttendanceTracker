package AttendanceTracker;
import java.util.List;
import java.util.Scanner;

public class SelectingClass {

    static String selectingClass(List classes) {
        boolean check = false;
        Scanner scanner = new Scanner(System.in);
        String course;

        System.out.println("\nPlease enter a course, section, and CRN listed above: ");
        course = scanner.nextLine();
        do{
            check = course instanceof String;
            if (!check){
                System.out.println("Error");
            }

        } while(!check);
            while(classes.contains(course) == false){
                System.out.println("\nInvalid course, please enter a course, section, and CRN listed above: ");
                course = scanner.nextLine();
                
            }
            scanner.close();
        return course;
    }    
}



