package AttendanceTracker;

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
    public static ArrayList mistakenlyMarkedAbsentFormat(){
        ArrayList<String> mistakeList = selectStudent();
        return mistakeList;
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
