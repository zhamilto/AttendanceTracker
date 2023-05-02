package AttendanceTracker;


import java.io.File;
import java.io.*;
import java.util.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;



public class DisplayCourses {
        // // TODO: Create funciton that calls the year and semester function to create word ie (Spring 2023)
        // public static String buildSemesterYear() {
        //     // worked
        //     YearOptions year = new YearOptions();
        //     year.userChooseYearStyle();


        //     // HOW DO YOU RUN JOSH'S CODE 
        //     // SemesterOptions semester = new SemesterOptions();
        //     // semester.displaySemestersFromMap(null);
        //     SemesterOptions.displaySemestersFromMap(null);
        //     return null;
        // }

        

        // TODO: Display list of couses: 
        // Create function that reads in the txt file, call word function, and returns list of courses 
        // public static String readFile(String string) throws Exception{
        //     File file = new File("C:\\Users\\elana\\AttendanceTracker\\src\\main\\java\\AttendanceTracker\\Course.txt");
        //     Scanner sc = new Scanner(file);

        //     while (sc.hasNextLine())
        //         System.out.println(sc.nextLine());
        //     return null;
        // }

        // public static Map<String, List<String>> fileIntoMap(String filePath){
        //     Map<String, Integer> mapFileContents = new HashMap<String, Integer>();
        //     BufferedReader br = null;

        //     try{
        //         File file = new File(filePath);

        //         br = new BufferedReader(new FileReader(file));
        //         String line = null;

        //         while ((line = br.readLine()) != null){
        //             String[] part = line.split(","); 

        //             String key = part[0].trim();
        //             String value = String.parsestring(key[1].trim());

        //             if (!key.equals("") && !value.equals(""))
        //             mapFileContents.put(key, value);
        //         }
        //     }
        // }
        
        

        // static List<String>readFile(String filename){
        //     ArrayList<String>trend_list=new ArrayList<>();
        //     try{
        //         Scanner fileScan=new Scanner(new File(filename));
        //         while(fileScan.hasNext()){
        //             String line=fileScan.nextLine();
        //             trend_list.add(line);
        //             }  
        //         }catch(FileNotFoundException e){
        //             System.out.println("Could not find '"+ filename +"' ");  
        //         }
        //     return trend_list;
        // }

        // static List<String> readFile(String filename){
        //     List<String> classList = new ArrayList<>();
        //     try{
        //         Scanner startScan = new Scanner(new File(filename));
        //         String headers = startScan.nextLine();
        //         while (startScan.hasNext()){
        //             String lineOfData = startScan.nextLine();
        //             String [] parts = lineOfData.split(",");
        //             String semesterYear = parts[1];
        //             String courses = parts[2];
        //             }
        //     startScan.close();
        //     } catch (Exception e){
        //     System.err.println("An Error has occured");
        //     System.exit(0);
        //     }
            
        //     return classList;            
        // }
            
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



      




        // TODO: Display list of couses -> Sect one course:
        // Attach display list of couses function to the selecting class function 




    }

