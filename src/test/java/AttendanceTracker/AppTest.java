/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package AttendanceTracker;

import org.checkerframework.checker.units.qual.A;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.util.List;
import java.util.ArrayList;

class AppTest {
    @Test void appHasAGreeting() {
        App classUnderTest = new App();
        assertNotNull(classUnderTest.getGreeting(), "app should have a greeting");
    }

    
    @Test void testselectingClass() {
        List<String> mockList = new ArrayList<>();
        mockList.add("MATH 1234");
        mockList.add("MATH 5678");
        mockList.add("MATH 3579");

        String inputCourse = "MATH 1234";
        InputStream in = new ByteArrayInputStream(inputCourse.getBytes());
        System.setIn(in);
        // assertEquals("MATH 1234", App.selectingClass(mockList));
        assertEquals("MATH 1234", SelectingClass.selectingClass(mockList));
    }
 
}




// class AppTest {
//     @Test void appHasAGreeting() {
//         App classUnderTest = new App();
//         assertNotNull(classUnderTest.getGreeting(), "app should have a greeting");
//     }

    
//     @Test void testselectingClass() {
//         List<String> mockList = new ArrayList<>();
//         mockList.add("MATH 1234");
//         mockList.add("MATH 5678");
//         mockList.add("MATH 3579");

//         String inputCourse = "MATH 1234";
//         InputStream in = new ByteArrayInputStream(inputCourse.getBytes());
//         System.setIn(in);
//         assertEquals("MATH 1234", App.selectingClass(mockList));
//     }
 
// }

