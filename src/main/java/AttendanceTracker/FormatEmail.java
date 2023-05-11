package AttendanceTracker;

import java.io.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

import static AttendanceTracker.AbsentStudent.markAllStudents;
import static AttendanceTracker.AbsentStudent.selectStudent;

public class FormatEmail {

    static ArrayList<Student>rosterList = readCSVFileIntoList("src/main/java/AttendanceTracker/roster.txt");
    static HashMap<String,String> idToStudentMap = rosterToMap(rosterList);
    static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
        chooseTemplate();
    }

    static HashMap<String,String> rosterToMap(ArrayList<Student>rosterList){
        HashMap<String,String>map = new HashMap<>();
        for(Student student: rosterList){
            String fullNameValue = student.getFirstName() + " "+ student.getLastName();
            String idKey = student.getIdNum();
            map.put(idKey,fullNameValue);
        }
        return map;
    }
    //function that allows user to choose which email template

    static public String chooseTemplate() {
        System.out.println("You can now select the template for the email you want to send the Registar.");
        System.out.print("Enter 1 for the case of card swiper not set up or Enter 2 to mark students who forgot their ID?: ");
        String letterChoice = scan.nextLine();
        letterChoice = letterChoice.trim();
        if (letterChoice.equals("1")) {
            return cardSwipeCodeNotEntered();
        }
        if (letterChoice.equals("2")) {
            return mistakenlyMarkedAbsentFormat();
        }else{
            System.out.println("That input is invalid.");
            return chooseTemplate();
        }
    }

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


  // this is for case that student forgets their id and professor has to manually report them
    public static String mistakenlyMarkedAbsentFormat(){
        HashMap<String, String> map = selectStudent(idToStudentMap);
        String t = "";
        String term = "Spring 2023";
        String CRN = "12345";
        String date = "5/7" + ","+ "5/9";
        ArrayList<String> idList = new ArrayList<>();
        for(String id: map.keySet()){
            idList.add(id);
        }
        String text = idList.toString().replace("[", "").replace("]", "");
        String completeFormat = "\n"+ "Term: "+ term +"\n" + "CRN Number: " + CRN + "\n" + "Student ID: "+  text + "\n" + "Dates: "+ date + "\n";
        System.out.println(completeFormat);
        return completeFormat;
    }

    // for the case that professor forgets to put in card swipe
    // will be refactored to include absent students, will demo with case that everyone is present
    public static String cardSwipeCodeNotEntered(){
        HashMap<String,String> map = markAllStudents(idToStudentMap);
        String term = "Spring 2023";
        String CRN = "12345";
        ArrayList<String> idList = new ArrayList<>();
        for(String id: map.keySet()){
            idList.add(id);
        }
        String text = idList.toString().replace("[", "").replace("]", "");
        String date = "5/7" + ","+ "5/9";
        String idNumAbsent = "None";
        String completeFormat = "\n"+ "Term: "+ term +"\n" + "CRN Number: " + CRN + "\n" + "Student ID: "+ text  + "\n" + "Dates: "+ date + "\n" +"Absent Student ID: " + idNumAbsent + "\n";
        System.out.println(completeFormat);
        return completeFormat;

    }
}
