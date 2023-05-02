package AttendanceTracker;

import java.util.ArrayList;
import java.util.Scanner;


//On the roster view, the user can select every student that was incorrectly marked absent or they can click the select all button.
// break this into 2 cases
// 1. marked incorrectly
// 2. select all students
// 2. go through list and print present next to each name, return list of all marked students
// 1. user input for name of student
public class AbsentStudent {
    static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
        userChooseStudentSelection();
    }


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
        ArrayList<String> list = createList();
        for (String student : list) {
            String mark = student + " PRESENT";
            System.out.println(mark);
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



//        do {
//            System.out.print("Who was incorrectly marked absent: ");
//            System.out.print("If you are finished marking students enter (Q)");
//                for(String studentInClass: studentList){
//                    while(!scan.hasNextLine()){
//                        while (!studentList.contains(studentInClass)){
//                            String incorrect = scan.next();
//                            System.out.printf("\"%s\" is not a student in this class.\n", incorrect);
//                            System.out.print("Enter the student: ");
//                        }
//                    }
//                    }
//
//            student = scan.nextLine();
//            if (studentList.contains(student)) {
//                markedList.add(student);
//                System.out.println(student + " PRESENT");
//            } else {
//                markedList.add(student + " ABSENT");
//            }
//        }while (studentList.contains(student)) ;
        return markedList;
    }
}
