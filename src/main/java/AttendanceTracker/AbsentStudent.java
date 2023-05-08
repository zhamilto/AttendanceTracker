package AttendanceTracker;

import java.io.File;
import java.util.ArrayList;
import java.util.Map;
import java.util.Scanner;
import static AttendanceTracker.FormatEmail.idToStudentMap;


public class AbsentStudent {

    static Scanner scan = new Scanner(System.in);
    static ArrayList<String>rosterList = readCSVFileIntoList("C:\\Users\\tiabi\\IdeaProjects\\Attendance\\src\\main\\java\\AttendanceTracker\\roster.txt");


    static public void userChooseStudentSelection() {
        System.out.print("Do you want to (S) select all students or (A) mark present students incorrectly marked absent?: ");
        String letterChoice = scan.nextLine();
        if (letterChoice.equals("S")) {
            markAllStudents(idToStudentMap);
        }
        if (letterChoice.equals("A")) {
            selectStudent(idToStudentMap);
        }else{
            System.out.println("That input is invalid.");
            userChooseStudentSelection();
        }
    }

    static ArrayList<String> readCSVFileIntoList(String filename) {
        ArrayList<String> studentRosterList = new ArrayList<>();
        try {
            Scanner startScan = new Scanner(new File(filename));
            while (startScan.hasNext()) {
                String lineOfData = startScan.nextLine();
                String[] parts = lineOfData.split(",");
                String firstName = parts[0];
                String lastName = parts[1];
                String idNum = parts[2];

                String st = firstName + " "+ lastName;
                studentRosterList.add(st);
            }
            startScan.close();
        } catch (Exception e) {
            System.err.println("Couldn't read file. Starting with empty list");

        }
        return studentRosterList;
    }


    static ArrayList<String> markAllStudents(Map<String,String> map) {
        ArrayList<String> marklist = new ArrayList<>();
        ArrayList<String> list = rosterList;
        for(String id: map.keySet()){
            //System.out.println(id);
            String student = map.get(id);
            String mark = id + " PRESENT" + "\n";
            marklist.add(mark);
        }
        System.out.println(marklist);
        return marklist;
    }

    static ArrayList<String> selectStudent(Map<String,String> map) {
        ArrayList<String> studentList = rosterList;
        ArrayList<String> markedList = new ArrayList<>();
        String student;
        do{
            System.out.print("Who was incorrectly marked absent? If you have finished entering students, enter (Q): ");
            student = scan.nextLine();
            if(!student.equals("Q")){
                for (String id: map.keySet()) {
                    if(map.containsValue(student)){
                        String present = map.get(id) + " PRESENT";
                        markedList.add(present);

                    } else if (!map.containsValue(student)) {
                        System.out.println("That name is not recognized. Please enter a student on roster.");
                    } else{
                        String absent = id + " ABSENT";
                        markedList.add(absent);
                    }

                }
                }
        }while (!student.equals("Q"));
        System.out.println("These students have now been marked as PRESENT " + markedList);
        return markedList;
    }
}