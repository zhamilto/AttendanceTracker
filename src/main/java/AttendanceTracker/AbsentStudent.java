package AttendanceTracker;

import java.util.ArrayList;
import java.util.Scanner;



public class AbsentStudent {
    static Scanner scan = new Scanner(System.in);




    static public void userChooseStudentSelection() {
        System.out.print("Do you want to (S) select all students or (A) mark present students incorrectly marked absent?: ");
        String letterChoice = scan.nextLine();
        if (letterChoice.equals("S")) {
            markAllStudents();
        }
        if (letterChoice.equals("A")) {
            selectStudent();
        }
    }
    static ArrayList<String> createList() {
        ArrayList<String> rosterList = new ArrayList<>();
        rosterList.add("Tia Bishop");
        rosterList.add("Zari Hamiltion");
        rosterList.add("Elana Perriott");
        rosterList.add("Josh Green");
        rosterList.add("Terrance Myles");
        return rosterList;
    }

    static ArrayList<String> markAllStudents() {
        ArrayList<String> marklist = new ArrayList<>();
        ArrayList<String> list = createList(); //once text file + function to read roster is created this will be refactored
        for (String student : list) {
            String mark = student + " PRESENT";
            //System.out.println(mark);
            marklist.add(mark);
        }
        return marklist;
    }

    static ArrayList<String> selectStudent() {
        ArrayList<String> studentList = createList(); //once text file + function to read roster is created this will be refactored
        ArrayList<String> markedList = new ArrayList<>();
        String student;
        do{
            System.out.print("Who was incorrectly marked absent? If you have finished entering students, enter (Q): ");
            student = scan.nextLine();
            if(!student.equals("Q")){
                for (String person:studentList) {

                }
                if(studentList.contains(student)){
                    String present = student + " PRESENT";
                    markedList.add(present);

                } else if (!studentList.contains(student)) {
                    System.out.println("That name is not recognized. Please enter a student on roster.");
                } else{
                    String absent = student + " ABSENT";
                    markedList.add(absent);
                }

            }
        }while (!student.equals("Q"));
        System.out.println("These students have been marked as PRESENT " + markedList);
        return markedList;
    }
}
