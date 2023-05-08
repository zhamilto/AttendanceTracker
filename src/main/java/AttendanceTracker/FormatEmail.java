package AttendanceTracker;

import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;

import static AttendanceTracker.AbsentStudent.markAllStudents;
import static AttendanceTracker.AbsentStudent.selectStudent;

public class FormatEmail {
    public static void main(String[] args) {
        //mistakenlyMarkedAbsentFormat();
        cardSwipeCodeNotEntered();
    }
    static Scanner scan = new Scanner(System.in);
    //On the roster view, after selecting students incorrectly marked absent, the user can click the preview email button.

    static ArrayList<Student>rosterList = readCSVFileIntoList("C:\\Users\\tiabi\\IdeaProjects\\Attendance\\src\\main\\java\\AttendanceTracker\\roster.txt");

    static ArrayList<Student> readCSVFileIntoList(String filename) {
        ArrayList<Student> studentRosterList = new ArrayList<>();
        try {
            Scanner startScan = new Scanner(new File(filename));
            String headers = startScan.nextLine();
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

    public static void chooseEmailFormatTemplate(){
        System.out.println("Which email format would you like to use?: ");
        String choice = scan.nextLine();

    }
    /*
    If you are reporting for a single student:
    Term:  Examples... Spring 2023 (202301)
    CRN Number : Example... 13285, 16734, ......
    Student ID: 900xxxxxx
    Dates: Example... 1/23, 1/25, 1/27, etc..
     */
    public static String mistakenlyMarkedAbsentFormat(){
        String term = "";
        String CRN = "";
        String idNum = "";
        String date = "";
        String completeFormat = "";
        for (Student student : rosterList) {
            idNum = student.getIdNum();
        }

        return "";
    }

    /*
    Term:  Examples... Spring 2023 (202301)
    CRN Number : Example... 13285, 16734, ......
    Student ID: ALL STUDENTS PRESENT
    Dates: Example... 1/23, 1/25, 1/27, etc..
    Absent Students ID Number: Examples...900XXXXXX
     */
    public static ArrayList cardSwipeCodeNotEntered(){
        ArrayList<String> noSwipeList = markAllStudents();
        return noSwipeList;
    }
}
