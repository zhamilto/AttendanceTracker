package AttendanceTracker;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class YearTest {
    @Test
    void enteredYear() {
        int inputYear = 2022;
        //InputStream in = new ByteArrayInputStream(inputYear.getBytes());
        //System.setIn(in);
        assertEquals(2022, EnteredYear.enteredYear());

    }

    @Test
    void defaultYear() {
        assert 2023 == DefaultYear.defaultYear();

    }

    @Test
    void notDefaultYear() {
        assert 2021 != DefaultYear.defaultYear();

    }
}
