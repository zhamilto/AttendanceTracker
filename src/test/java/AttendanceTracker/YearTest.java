package AttendanceTracker;

import org.junit.jupiter.api.Test;

import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.util.Calendar;
import java.util.InputMismatchException;

import static org.junit.jupiter.api.Assertions.*;

public class YearTest {
    @Test
    void enteredYear() {
        String inputCourse = "2022";
        int year = Integer.parseInt(inputCourse);
        InputStream in = new ByteArrayInputStream(inputCourse.getBytes());
        System.setIn(in);
        assertEquals(year, YearOptions.enteredYear());
    }


    @Test
    void defaultYear() {
        Calendar calendar = Calendar.getInstance();
        int currentYear = calendar.get(Calendar.YEAR);
        assertEquals(currentYear,YearOptions.defaultYear());

    }

    @Test
    void notDefaultYear() {
        Calendar calendar = Calendar.getInstance();
        int currentYear = calendar.get(Calendar.YEAR);
        assertNotEquals(2021,YearOptions.defaultYear());

    }

    @Test
    public void whenExceptionThrown_thenAssertionSucceeds() {
        Exception exception = assertThrows(NumberFormatException.class, () -> {
            Integer.parseInt("q");
        });

        String expectedMessage = "For input string";
        String actualMessage = exception.getMessage();

        assertTrue(actualMessage.contains(expectedMessage));
    }


}
