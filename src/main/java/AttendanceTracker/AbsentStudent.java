package AttendanceTracker;

import java.io.File;
import java.util.*;

import static AttendanceTracker.FormatEmail.idToStudentMap;


public class AbsentStudent {

    static Scanner scan = new Scanner(System.in);
    static ArrayList<String>rosterList = readCSVFileIntoList("C:\\Users\\tiabi\\IdeaProjects\\Attendance\\src\\main\\java\\AttendanceTracker\\roster.txt");

    public static void main(String[] args) {
        markAllStudents(idToStudentMap);
        selectStudent(idToStudentMap);

    }

    // allows user to choose to select all students or those marked absent incorrectly
    static public HashMap userChooseStudentSelection() {
        System.out.print("Do you want to (S) select all students or (A) mark present students incorrectly marked absent?: ");
        String letterChoice = scan.nextLine();
        if (letterChoice.equals("S")) {
            return markAllStudents(idToStudentMap);
        }
        if (letterChoice.equals("A")) {
            return selectStudent(idToStudentMap);
        }else{
            System.out.println("That input is invalid.");
            return userChooseStudentSelection();
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


    static HashMap<String,String> markAllStudents(Map<String,String> map) {
        HashMap<String,String> sMap = new HashMap<>();
        ArrayList<String> list = rosterList;
        for(String id: map.keySet()){
            String student = map.get(id);
            String mark = id + "\n";
            sMap.put(id,student);
        }
        System.out.println("These students have all been marked as PRESENT: "+ sMap.values());
        return sMap;
    }

    static HashMap<String,String> selectStudent(Map<String,String> map) {
        ArrayList<String> studentList = rosterList;
        ArrayList<String> markedList = new ArrayList<>();
        HashMap<String,String> sMap = new HashMap<>();
        String student;
        String id = "";
        String name = "";
        do {
            System.out.print("Who was incorrectly marked absent? If you have finished entering students, enter (Q): ");
            student = scan.nextLine();
            if(!student.equals("Q")) {
                boolean studentFound = false;
                for (String idKey : map.keySet()) {
                    if (map.get(idKey).equals(student)) {
                        id = idKey;
                        name = map.get(id);
                        sMap.put(id, name);
                        markedList.add(student);
                        studentFound = true;
                        break;
                    }
                }
                if (!studentFound) {
                    System.out.println("That name is not recognized. Please enter a student on roster.");
                }
            }
        }while (!student.equals("Q"));
        System.out.println("These students have now been marked as PRESENT " + markedList);
        return sMap;
    }
    static HashMap<String,String> selectAbsentStudents(Map<String,String> map){
        HashMap<String,String>absentMap = new HashMap<>();
        String student;
        do{
            //TODO create function for just absent students
            System.out.print("Which students were absent? If you have finished entering students, enter (Q): ");
            student = scan.nextLine();
            if(!student.equals("Q")){
                for (String id: map.keySet()) {
                    if(map.containsValue(student)){
                        String present = map.get(id);
                        absentMap.put(id,present);
                    }
                    else if (!map.containsValue(student)) {
                        System.out.println("That name is not recognized. Please enter a student on roster.");
                    }
                }
            }
        }while (!student.equals("Q"));
        System.out.println("These students have now been marked as ABSENT " + absentMap.values());
        return absentMap;
    }


}