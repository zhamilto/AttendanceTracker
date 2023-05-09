package AttendanceTracker;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.util.*;

import static AttendanceTracker.AbsentStudent.*;
import static AttendanceTracker.FormatEmail.idToStudentMap;
import static AttendanceTracker.FormatEmail.mistakenlyMarkedAbsentFormat;
import static org.junit.jupiter.api.Assertions.*;

public class FormatEmailTest {
    @Test
    void markAll() {
        ArrayList<String> list = new ArrayList<>();
        String term = "Spring 2023";
        String CRN = "12345";
        String idList = "900234567";
        String date = "5/7";
        String test =  "\n"+ "Term: "+ term +"\n" + "CRN Number: " + CRN + "\n" + "Student ID: "+ idList  + "\n" + "Dates: "+ date + "\n";
        assertEquals(test,mistakenlyMarkedAbsentFormat());
    }

//    @Test
//    void tl() {
//        ArrayList<String> list = new ArrayList<>();
//        String term = "Spring 2023";
//        String CRN = "12345";
//        String idList = "900234567";
//        String date = "5/7";
//        String test =  "\n"+ "Term: "+ term +"\n" + "CRN Number: " + CRN + "\n" + "Student ID: "+ idList  + "\n" + "Dates: "+ date + "\n";
//        assertEquals(test,mistakenlyMarkedAbsentFormat());
//    }

}
