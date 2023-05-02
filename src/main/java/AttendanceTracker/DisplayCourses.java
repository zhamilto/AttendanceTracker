package AttendanceTracker;


import java.io.File;
import java.io.*;
import java.util.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Stream;

import com.google.common.collect.MapDifference.ValueDifference;



public class DisplayCourses {
        // // TODO: Create funciton that calls the year and semester function to create word ie (Spring 2023)
        public static String buildSemesterYear() {
            // worked
            YearOptions year = new YearOptions();
            year.userChooseYearStyle();

            // String strYear = String.format("%d", year);


            // HOW DO YOU RUN JOSH'S CODE 
            // SemesterOptions semester = new SemesterOptions();
            // // semester.displaySemestersFromMap(null);
            // SemesterOptions.displaySemestersFromMap(null);
            return null;
        }

        

        // On the class view, the user can click "Display List of Courses" button to see 
        // a list of every class for the given semester and year 


        // TODO: Display list of couses: 
        // Create function that reads in the txt file, call word function, and returns list of courses 

        static void displayCourseList(String semesterYear){
            List<String> data = readFile("C:\\Users\\elana\\AttendanceTracker\\src\\main\\java\\AttendanceTracker\\Courses.txt");
            Map<String, List<String>>courseMap = listIntoMap(data);

            

            for(Map.Entry mp: courseMap.entrySet()){
                if (mp.getKey().equals(semesterYear)){

                    System.out.println(mp.getValue());
                    
                    // for (String element : mp.getValue()){
                    //     System.out.println(element);
                    // }
                 
                } 
            }


            // for(Map.Entry mp: courseMap.entrySet()){
            //     if (mp.getKey().equals(semesterYear)){
            //     System.out.println(mp.getValue()); 
            //     } 
            //     }

            // for (String key: courseMap.keySet()){
            //     // System.out.println("----" + semesterYear);
            //     // System.out.println(key);
                
            //     if (semesterYear != key){
            //         for (List<String> values: courseMap.values()){
            //             System.out.println(values);
            //         }


           


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




    }

