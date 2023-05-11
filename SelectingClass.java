package AttendanceTracker;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.Map;

public class SelectingClass {
    String selectingClass(Map<String, List<String>> Map) {
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


           
        }while(!check);
            boolean inMap = false;
            for (Map.Entry<String, List<String>> entry : Map.entrySet()){
                List<String> value = new ArrayList<>();
                value = entry.getValue();
                for (String element : value){
                    if (element.equals(course)){
                        inMap = true;                            
                    }
                }
            }

            while(inMap == false){
                System.out.println("\nInvalid course, please enter a course, section, and CRN listed above: ");
                course = scanner.nextLine();
                for (Map.Entry<String, List<String>> entryTwo : Map.entrySet()){
                    List<String> value = new ArrayList<>();
                    value = entryTwo.getValue();
                    for (String element : value){
                        if (element.equals(course)){
                            inMap = true;                            
                        }
                    }
                }
            }
           
           
            scanner.close();
        return course;
    }  
}
