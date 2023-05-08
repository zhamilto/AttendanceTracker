package AttendanceTracker;

import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

import static AttendanceTracker.AbsentStudent.markAllStudents;
//import static AttendanceTracker.DisplayCourses.buildSemesterYear;

import static AttendanceTracker.AbsentStudent.selectStudent;

public class FormatEmail {
    static ArrayList<String> idNums = getIDFromList("C:\\Users\\tiabi\\IdeaProjects\\Attendance\\src\\main\\java\\AttendanceTracker\\roster.txt");
    static ArrayList<Student>rosterList = readCSVFileIntoList("C:\\Users\\tiabi\\IdeaProjects\\Attendance\\src\\main\\java\\AttendanceTracker\\roster.txt");
    public static void main(String[] args) {
       cardSwipeCodeNotEntered();
        //mistakenlyMarkedAbsentFormat();
    }
    static Scanner scan = new Scanner(System.in);
    //On the roster view, after selecting students incorrectly marked absent, the user can click the preview email button.



    static ArrayList<Student> readCSVFileIntoList(String filename) {
        ArrayList<Student> studentRosterList = new ArrayList<>();
                try {
            Scanner startScan = new Scanner(new File(filename));
            while (startScan.hasNext()) {
                String lineOfData = startScan.nextLine();
                String[] parts = lineOfData.split(",");
                String firstName = parts[0];
                String lastName = parts[1];
                String idNum = parts[2];

                Student st = new Student(firstName, lastName, idNum);
                studentRosterList.add(st);
            }
            startScan.close();
        } catch (Exception e) {
            System.err.println("Couldn't read file. Starting with empty list");

        }
        return studentRosterList;
    }

    static ArrayList<String> getIDFromList(String filename) {
        ArrayList<String> studentRosterList = new ArrayList<>();
        String line = "";
        String splitBy = ",";
        String id = "";
        try {
            BufferedReader br = new BufferedReader(new FileReader("C:\\Users\\tiabi\\IdeaProjects\\Attendance\\src\\main\\java\\AttendanceTracker\\roster.txt"));
            while ((line = br.readLine()) != null)   
            {
                String[] student = line.split(splitBy);    
                id = student[2];
                studentRosterList.add(id);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return studentRosterList;
    }


    public static String chooseEmailFormatTemplate(){
        System.out.println("Which email format would you like to use?: ");
        String choice = scan.nextLine();
        return "";

    }
    /*
    If you are reporting for a single student:
    Term:  Examples... Spring 2023 (202301)
    CRN Number : Example... 13285, 16734, ......
    Student ID: 900xxxxxx
    Dates: Example... 1/23, 1/25, 1/27, etc..
     */
    public static String mistakenlyMarkedAbsentFormat(){
        String term = "Spring 2023";
        String CRN = "12345";
        String idNum = idNums.toString();;
        String date = "5/7";
        String completeFormat = "Term: "+ term +"\n" + "CRN Number: " + CRN + "\n" + "Student ID: "+ idNum  + "\n" + "Dates: "+ date + "\n";
        System.out.println(completeFormat);
        return completeFormat;
    }

    /*
    Term:  Examples... Spring 2023 (202301)
    CRN Number : Example... 13285, 16734, ......
    Student ID: ALL STUDENTS PRESENT
    Dates: Example... 1/23, 1/25, 1/27, etc..
    Absent Students ID Number: Examples...900XXXXXX
     */
    public static String cardSwipeCodeNotEntered(){
        String term = "Spring 2023";
        String CRN = "12345";
        String idNumPresent = idNums.toString();;
        String date = "5/7";
        String idNumAbsent = "";
        String completeFormat = "Term: "+ term +"\n" + "CRN Number: " + CRN + "\n" + "Student ID: "+ idNumPresent  + "\n" + "Dates: "+ date + "\n" +"Absent Student ID: " + "\n";
        System.out.println(completeFormat);
        return completeFormat;

    }
}
