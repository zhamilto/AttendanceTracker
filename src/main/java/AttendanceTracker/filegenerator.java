<<<<<<< HEAD
package AttendanceTracker;

import java.io.File;  // Import the File class
import java.io.IOException;  // Import the IOException class to handle errors
import java.io.FileWriter;
import java.io.FileReader;
import java.util.Random;
import java.util.Arrays;
import java.util.ArrayList;
import java.text.SimpleDateFormat;
import java.util.Date;


public class filegenerator {

    private final static java.text.SimpleDateFormat DATE_FORMAT = new java.text.SimpleDateFormat("MM-dd-yyyy");

    public static String generateRandomDate() {
        Random r = new Random();
        java.util.Calendar c = java.util.Calendar.getInstance();
        c.set(java.util.Calendar.MONTH, Math.abs(r.nextInt()) % 12);
        c.set(java.util.Calendar.DAY_OF_MONTH, Math.abs(r.nextInt()) % 30);
        c.setLenient(true);
        return DATE_FORMAT.format(c.getTime());
    }

    public static String GenerateFile(String FileName){
       try {
  
            // Get the file
            File f = new File(FileName);

            // Create new file
            // if it does not exist
            if (f.createNewFile())
                System.out.println("File created");
            else
                System.out.println("File already exists");
        }
        catch (Exception e) {
            System.err.println(e);
        }

        return FileName;
    }
    

    public static void GenerateRosterData(String FileName) throws IOException {

        String[] FirstNames = {
            "Ghefua","Macie","Antony","Darryl","Kaleb",
            "Elana","Terrance","Darren","Ashleigh","Mulundano",
            "Anas","Chioma","Zari","Joshua","Shelby",
            "Modesola","Jalen","Ahmed","Robert","Carrington",
            "Tia","Dominick","Evan","Gabriel"
        };

        String[] LastNames = {
            "Yembu","Washington","Vu","Terrell","Riley",
            "Perriott","Myles","Metoyer","McKinney","Machiya",
            "Jebreel","Ifezie","Hamilton","Green","Goff",
            "Giwa","Evans Moore","El-Desoky","Daniels","Body",
            "Bishop","Bioc","Bell","Allen",
        };
        ArrayList<String> F_names = new ArrayList<String>(Arrays.asList(FirstNames));
        ArrayList<String> L_names = new ArrayList<String>(Arrays.asList(LastNames));
        Random rand = new Random();
        int max= FirstNames.length - 1;
        int min=0;
        FileWriter fw = new FileWriter(FileName, true);
        for(int i = 0; i < FirstNames.length + 1; i++){
            if(i < FirstNames.length){
   
                int rand_1 = rand.nextInt(max - min + 1) + min;
                int rand_2 = rand.nextInt(max - min + 1) + min;
                fw.write(F_names.get(rand_1) + " " + L_names.get(rand_2) + "\n");
                F_names.remove(rand_1);
                L_names.remove(rand_2);
                max -= 1;


            }else if(i == FirstNames.length){
           
                fw.write(FileName.substring(0,FileName.length() - 4));
            }

        }
        fw.close();



    }

  public static void main(String[] args) throws IOException {

        String FileName = GenerateFile(generateRandomDate() + ".txt");
        GenerateRosterData(FileName);
        
    }
}
=======
package AttendanceTracker;

import java.io.File;  // Import the File class
import java.io.IOException;  // Import the IOException class to handle errors
import java.io.FileWriter;
import java.io.FileReader;
import java.io.PrintWriter;
import java.io.BufferedWriter;

public class filegenerator {
    public static String GenerateFile(String FileName){
       try {
  
            // Get the file
            File f = new File(FileName);

            // Create new file
            // if it does not exist
            if (f.createNewFile())
                System.out.println("File created");
            else
                System.out.println("File already exists");
        }
        catch (Exception e) {
            System.err.println(e);
        }

        return FileName;
    }

    public static void GenerateRosterData(String FileName) {

        String[] FirstNames = {
            "Ghefua","Macie","Antony","Darryl","Kaleb",
            "Elana","Terrance","Darren","Ashleigh","Mulundano",
            "Anas","Chioma","Zari","Joshua","Shelby",
            "Modesola","Jalen","Ahmed","Robert","Carrington",
            "Tia","Dominick","Evan","Gabriel"
        };

        String[] LastNames = {
            "Yembu","Washington","Vu","Terrell","Riley",
            "Perriott","Myles","Metoyer","McKinney","Machiya",
            "Jebreel","Ifezie","Hamilton","Green","Goff",
            "Giwa","Evans Moore","El-Desoky","Daniels","Body",
            "Bishop","Bioc","Bell","Allen",
        };

        FileWriter fw = new FileWriter(FileName, true);
        BufferedWriter bw = new BufferedWriter(fw);
        PrintWriter out = new PrintWriter(bw, true);
        for(int i = 0; i < FirstNames.length; i++){
            System.out.println(FirstNames[i] + " " + LastNames[i] + "\n");
        }
        fw.close();



    }

  public static void main(String[] args) {
        String FileName = GenerateFile("File.txt");
        //GenerateRosterData(FileName);
        
    }
}
>>>>>>> d8e8d1d77631c2e3275085fb87f46f92e3d28d44
