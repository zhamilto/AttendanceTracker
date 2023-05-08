package AttendanceTracker;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;


public class DisplayCourses {
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

        static List<String> displayCourseMap(List<String> fileList){
            Map<String, List<String>> courseMap = listIntoMap(fileList);
            List<String> value = new ArrayList<>();

            System.out.println("Courses: ");            
            for (Map.Entry<String, List<String>> entry : courseMap.entrySet()){
                String key = entry.getKey();
                value = entry.getValue();
                key = entry.getKey();

                System.out.println("Term: " + key);

                for (String course : value){
                    System.out.println(" - " + course);
                }

                System.out.println("\n");
            }
            return value;
        }

        
        static String displayAndChooseCourse(String fileName){
            List<String> data = readFile(fileName);
            Map<String, List<String>> courseMap = listIntoMap(data);    
            displayCourseMap(data);
            SelectingClass selectingClass = new SelectingClass();
            String selectedCourse = selectingClass.selectingClass(courseMap);
            return selectedCourse;
        }
    }







