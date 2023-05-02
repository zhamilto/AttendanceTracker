package AttendanceTracker;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.io.*;
import java.util.*;

public class DisplayCoursesTest {
    @Test void readFileTest(){
        List<String> data = DisplayCourses.readFile("C:\\Users\\elana\\AttendanceTracker\\src\\test\\java\\AttendanceTracker\\TestData.txt");
        assertEquals("['Fall 2022: CPSC 2740,  MATH 2550, STAT 2021, CPSC 3603, AMSL 1010' ,'Spring 2023: AADS 3020, CPSC 2120, MATH 2030, CPSC 3113', 'Fall 2023: PHYS 1010, MGMT 2060, CPSC 3140, CPSC 3710, XCORE 3010']", data);
        assertNotEquals("[]", data);
    }
    

    
}
