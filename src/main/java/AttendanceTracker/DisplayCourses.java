package AttendanceTracker;
import java.io.File;
import java.io.FileNotFoundException;
import java.sql.Array;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;


public class DisplayCourses {

        // TODO: Create funciton that calls the year and semester function to create word ie (Spring 2023)
        public static String buildSemesterYear(Map<String, List<String>> Map) {
            System.out.println("\nTerms options: ");
            for (Map.Entry<String, List<String>> entry : Map.entrySet()){
                String key = entry.getKey();
                System.out.println(key);
            }
            System.out.println("");
            YearOptions userChooseYearStyle = new YearOptions();
            int year = userChooseYearStyle.userChooseYearStyle();
            while(!Map.containsKey(year)){
                year = userChooseYearStyle.userChooseYearStyle();
            }
            String yearString = String.valueOf(year);

            // // FIGURE OUT HOW TO CALL JOSH'S FUNCTION 
            // SemesterOptions promptUserforSemester = new SemesterOptions();
            // int semester = promptUserforSemester.promptUserforSemester();
            // String semesterString = String.valueOf(semester);
            
           
            // return yearString + semesterString;
            return yearString;
        }


        static List<String>readFile(String filename){
            ArrayList<String>trend_list=new ArrayList<>();
            try{
                Scanner fileScan=new Scanner(new File(filename));
                while(fileScan.hasNext()){
                    String line=fileScan.nextLine();
                    trend_list.add(line);
                    }  
                }catch(FileNotFoundException e){
                    System.out.println("Could not find '"+ filename +"' ");  
                }
            return trend_list;
        }


        static Map<String, List<String>> listIntoMap(List <String> inputList){
            Map<String, List<String>> map = new HashMap<>();  
            for (String word: inputList){
                String[] wordSplit = word.split(":");
                String semesterYear = wordSplit[0];
                
                List<String> classes = new ArrayList<>();
                String[] test = wordSplit[1].split(",");
                for (String section : test){
                    classes.add(section);
                    
                }               
                map.put(semesterYear, classes);
            }
            return map;
        }

        static List<String> displayCourseList(String semesterYear){
            List<String> data = readFile("C:\\Users\\elana\\AttendanceTracker\\src\\main\\java\\AttendanceTracker\\Courses.txt");
            Map<String, List<String>> courseMap = listIntoMap(data);
            List<String> value = new ArrayList<>();

            System.out.println("Courses offered in " + semesterYear);            
            for (Map.Entry<String, List<String>> entry : courseMap.entrySet()){
                String key = entry.getKey();
                value = entry.getValue();
                if (key.equals(semesterYear)){
                        for (String element : value){
                        System.out.println(" - " + element);
                    }
                    return value;       
                } else{
                    value = Collections.<String> emptyList();
                }      
            }
            return value;
        }


        // TODO: Make buildSemesterYear function work 
        static String displayAndChooseCourse(){
            /// TODO: Call budildSemesterYear to get parameters for displayCourseList
            List<String> data = readFile("C:\\Users\\elana\\AttendanceTracker\\src\\main\\java\\AttendanceTracker\\Courses.txt");
            Map<String, List<String>> courseMap = listIntoMap(data);
            String semesterYear = buildSemesterYear(courseMap);
                        
            System.out.println("\n");
            List<String> courses = displayCourseList(semesterYear);
            // List<String> courses = displayCourseList("Spring 2023");

            SelectingClass selectingClass = new SelectingClass();
            String selectedCourse = selectingClass.selectingClass(courses);


            return selectedCourse;
            
        }
    }







