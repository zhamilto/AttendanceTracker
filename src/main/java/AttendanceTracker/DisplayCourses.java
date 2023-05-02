package AttendanceTracker;
import java.io.File;
import java.io.*;
import java.util.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.Stream;


public class DisplayCourses {
        // TODO: Create funciton that calls the year and semester function to create word ie (Spring 2023)


        // STEPS 
        // call yearOption class to get the year 
        // call SemesterOptoion class to get the semester 
        // combine the two to get a string of the word 
        // return that new word string 



        public static String buildSemesterYear() {
            // worked
            YearOptions year = new YearOptions();
            year.userChooseYearStyle();
            return null;
        }

        
        static Object displayCourseList(String semesterYear){
            Object empty = new Object();

            List<String> data = readFile("C:\\Users\\elana\\AttendanceTracker\\src\\main\\java\\AttendanceTracker\\Courses.txt");
            Map<String, List<String>>courseMap = listIntoMap(data);
            for(Map.Entry mp: courseMap.entrySet()){
                if (mp.getKey().equals(semesterYear)){
                    System.out.println(mp.getValue()); 
                    empty = mp.getValue();
                } 

            }
            return empty;        
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
                ArrayList <String> classes = new ArrayList<>();
                classes.add(wordSplit[1]);
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
            String semesterYear = buildSemesterYear();
            System.out.println("\n");
            
            // displayCourseList(null);
            Object courses = displayCourseList("Spring 2020");

            List<Object> list = Arrays.asList(courses);

            // call selectingClass 
            SelectingClass selectingClass = new SelectingClass();
            selectingClass.selectingClass(list);


            return selectingClass;
        }
    }







