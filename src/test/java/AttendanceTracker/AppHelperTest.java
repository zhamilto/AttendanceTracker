package AttendanceTracker;

import java.util.Calendar;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class AppHelperTest {
    
    @Test void yearFromChoiceTworeturnsCurrentYear () {
        int currentyear =  Calendar.getInstance().get(Calendar.YEAR);

        assertEquals(currentyear, AppHelper.yearFromChoice(2));
        assertNotEquals(currentyear, AppHelper.yearFromChoice(0));
        assertNotEquals(currentyear, AppHelper.yearFromChoice(1));

    }

    @Test void yearFromChoicenotOneorTwoReturnsZero() {
        int currentyear = Calendar.getInstance().get(Calendar.YEAR);

        assertEquals(0, AppHelper.yearFromChoice(0));
        assertEquals(0, AppHelper.yearFromChoice(4));
        assertEquals(0, AppHelper.yearFromChoice(3));
        assertEquals(0, AppHelper.yearFromChoice(5));

        assertNotEquals(currentyear, AppHelper.yearFromChoice(0));
    }
}
