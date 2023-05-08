
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

            FileWriter fw = new FileWriter(FileName, true);
            BufferedWriter bw = new BufferedWriter(fw);
            PrintWriter out = new PrintWriter(bw, true);
            for(int i = 0; i < FirstNames.length; i++){
                System.out.println(FirstNames[i] + " " + LastNames[i] + "\n");
            }
            fw.close();



        }

        public static void main(String[] args) throws IOException {
            String rosterList = GenerateFile("File.txt");
            //System.out.println(rosterList);
            //String roster = GenerateRosterData(FileName);

        }
    }

