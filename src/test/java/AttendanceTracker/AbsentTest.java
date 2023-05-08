package AttendanceTracker;

import org.junit.jupiter.api.Test;

import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.InputMismatchException;

import static AttendanceTracker.AbsentStudent.markAllStudents;
import static org.junit.jupiter.api.Assertions.*;

public class AbsentTest {
    @Test
    void listSize() {
        ArrayList<String>testList = new ArrayList<>();
        testList.add("Tia Bishop");
        testList.add("Zari Hamiltion");
        testList.add("Elana Perriott");
        testList.add("Josh Green");
        testList.add("Terrance Myles");
        assertEquals(5,testList.size());

    }
    @Test
    void markAll() {
        ArrayList<String>testList = new ArrayList<>();
        testList.add("Tia Bishop PRESENT");
        testList.add("Zari Hamiltion PRESENT");
        testList.add("Elana Perriott PRESENT");
        testList.add("Josh Green PRESENT");
        testList.add("Terrance Myles PRESENT");
        assertEquals(testList,markAllStudents());
    }
/*
void markAll() {
       has user input that can be validated through console
    }
*/


   //other function
}
