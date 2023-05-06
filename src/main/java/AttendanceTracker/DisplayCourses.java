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


        // STEPS 
        // call yearOption class to get the year 
        // call SemesterOptoion class to get the semester 
        // combine the two to get a string of the word 
        // return that new word string 

        public static String buildSemesterYear() {
            // worked
            // YearOptions year = new YearOptions();
            // year = userChooseYearStyle();
            // System.out.println(year.getClass());
            // String yearAsString = Integer.toString(year);
            
            // return yearAsString;
            return null;
        }

        // static Object displayCourseList(String semesterYear){
        //     Object empty = new Object();
        //     List<String> data = readFile("C:\\Users\\elana\\AttendanceTracker\\src\\main\\java\\AttendanceTracker\\Courses.txt");
        //     Map<String, List<String>>courseMap = listIntoMap(data);
        //     for(Map.Entry mp: courseMap.entrySet()){
        //         if (mp.getKey().equals(semesterYear)){
        //         System.out.println(mp.getValue()); 
        //         empty = mp.getValue();
        //         } 
        //     }
        //     System.out.println(empty.getClass());
        //     return empty;        
        // }


        static void printList(List<String> courses){
            for (String elemnt : courses){
                System.out.println(elemnt);
            }
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








        // On the class view, after a "Display List ot Coueses" radio buttion is clicked
        // the user can select one couses 
        // TODO: Display list of couses -> Sect one course:
        // Attach display list of couses function to the selecting class function 

        static SelectingClass displayAndChooseCourse(){
            // call budildSemesterYear to get parameters for displayCourseList
            // String semesterYear = buildSemesterYear();
            // System.out.println(semesterYear);
            
            
            // display the courses
            Object courses = displayCourseList("Spring 2023");
                      

            // List<Object> list = Arrays.asList(courses);



            // call selectingClass 
            // SelectingClass selectingClass = new SelectingClass();
            // selectingClass.selectingClass(list);


            // return selectingClass;
            return null;
        }
    }







