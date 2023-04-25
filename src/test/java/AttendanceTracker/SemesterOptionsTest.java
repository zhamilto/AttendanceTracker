package AttendanceTracker;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import java.util.HashMap;

public class SemesterOptionsTest {
    private HashMap<Integer, String> testsemesters = new HashMap<Integer,String>() {{
        put(1, "Spring 2020");
        put(2, "Summer 2020");
        put(3, "Fall 2020");
        put(4, "Spring 2021");
        put(5, "Summer 2021");
        put(6, "Fall 2021");
    }};

    @Test void selectSemesterReturnsAtKey() {
        int choice1 = 1;
        String actual = SemesterOptions.selectSemester(testsemesters, choice1);

        assertNotEquals("Summer 2020", actual);
        assertFalse(actual.isBlank());
        assertFalse(actual.isEmpty());
        assertEquals("Spring 2020", actual);
    } 

    @Test void selectDefaultSemesterRetunsLastSemester() {
        String actual = SemesterOptions.selectDefaultSemester(testsemesters);
        assertFalse(actual.isEmpty());
        assertFalse(actual.isBlank());
        assertNotEquals("Spring 2020", actual);
        assertNotEquals("Summer 2020", actual);
        assertEquals("Fall 2021", actual);
    }
    
}
