package AttendanceTracker;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.util.*;

import static AttendanceTracker.AbsentStudent.*;
import static AttendanceTracker.FormatEmail.idToStudentMap;
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
    void testMap() {
        HashMap<String,String> testMap = new HashMap<>();
        testMap.put("900770371","Ghefua Yembu");
        testMap.put("900532298","Macie Washington");
        testMap.put("900075962","Antony Vu");
        testMap.put("900016533","Darryl Terrell");
        testMap.put("900607413","Kaleb Riley");
        testMap.put("900345640","Elana Perriott");
        testMap.put("900909512","Terrance Myles");
        testMap.put("900334898","Darren Metoyer");
        testMap.put("900828886","Ashleigh McKinney");
        testMap.put("900476308","Mulundano Machiya");
        testMap.put("900098727","Anas Jebreel");
        testMap.put("900210890","Chioma Ifezie");
        testMap.put("900112329","Zari Hamilton");
        testMap.put("900879674","Joshua Green");
        testMap.put("900718765","Shelby Goff");
        testMap.put("900102358","Modesola Giwa");
        testMap.put("900881100","Jalen Evans Moore");
        testMap.put("900212345","Ahmed El-Desoky");
        testMap.put("900098765","Robert Daniels");
        testMap.put("900946802","Carrington Body");
        testMap.put("900523445","Tia Bishop");
        testMap.put("900197330","Dominick Bioc");
        testMap.put("900398703","Evan Bell");
        testMap.put("900280981","Gabriel Allen");
        assertEquals(testMap,markAllStudents(idToStudentMap));
    }


    @Test
    void testMapHasEntry() {
        HashMap<String,String> testMap = new HashMap<>();
        testMap.put("900770371","Ghefua Yembu");
        testMap.put("900532298","Macie Washington");
        testMap.put("900075962","Antony Vu");
        testMap.put("900016533","Darryl Terrell");
        testMap.put("900607413","Kaleb Riley");
        testMap.put("900345640","Elana Perriott");
        testMap.put("900909512","Terrance Myles");
        testMap.put("900334898","Darren Metoyer");
        testMap.put("900828886","Ashleigh McKinney");
        testMap.put("900476308","Mulundano Machiya");
        testMap.put("900098727","Anas Jebreel");
        testMap.put("900210890","Chioma Ifezie");
        testMap.put("900112329","Zari Hamilton");
        testMap.put("900879674","Joshua Green");
        testMap.put("900718765","Shelby Goff");
        testMap.put("900102358","Modesola Giwa");
        testMap.put("900881100","Jalen Evans Moore");
        testMap.put("900212345","Ahmed El-Desoky");
        testMap.put("900098765","Robert Daniels");
        testMap.put("900946802","Carrington Body");
        testMap.put("900523445","Tia Bishop");
        testMap.put("900197330","Dominick Bioc");
        testMap.put("900398703","Evan Bell");
        testMap.put("900280981","Gabriel Allen");
        assertTrue(testMap.containsKey("900523445"));

    }

    @Test
    void testMarkAll() {
        HashMap<String,String> testMap = new HashMap<>();
        testMap.put("900770371","Ghefua Yembu");
        testMap.put("900532298","Macie Washington");
        testMap.put("900075962","Antony Vu");
        testMap.put("900016533","Darryl Terrell");
        testMap.put("900607413","Kaleb Riley");
        testMap.put("900345640","Elana Perriott");
        testMap.put("900909512","Terrance Myles");
        testMap.put("900334898","Darren Metoyer");
        testMap.put("900828886","Ashleigh McKinney");
        testMap.put("900476308","Mulundano Machiya");
        testMap.put("900098727","Anas Jebreel");
        testMap.put("900210890","Chioma Ifezie");
        testMap.put("900112329","Zari Hamilton");
        testMap.put("900879674","Joshua Green");
        testMap.put("900718765","Shelby Goff");
        testMap.put("900102358","Modesola Giwa");
        testMap.put("900881100","Jalen Evans Moore");
        testMap.put("900212345","Ahmed El-Desoky");
        testMap.put("900098765","Robert Daniels");
        testMap.put("900946802","Carrington Body");
        testMap.put("900523445","Tia Bishop");
        testMap.put("900197330","Dominick Bioc");
        testMap.put("900398703","Evan Bell");
        testMap.put("900280981","Gabriel Allen");
        assertEquals(testMap,markAllStudents(idToStudentMap));
    }

    @Test
    void testUserChoose() {
        HashMap<String,String> testMap = new HashMap<>();
        testMap.put("900770371","Ghefua Yembu");
        testMap.put("900532298","Macie Washington");
        testMap.put("900075962","Antony Vu");
        testMap.put("900016533","Darryl Terrell");
        testMap.put("900607413","Kaleb Riley");
        testMap.put("900345640","Elana Perriott");
        testMap.put("900909512","Terrance Myles");
        testMap.put("900334898","Darren Metoyer");
        testMap.put("900828886","Ashleigh McKinney");
        testMap.put("900476308","Mulundano Machiya");
        testMap.put("900098727","Anas Jebreel");
        testMap.put("900210890","Chioma Ifezie");
        testMap.put("900112329","Zari Hamilton");
        testMap.put("900879674","Joshua Green");
        testMap.put("900718765","Shelby Goff");
        testMap.put("900102358","Modesola Giwa");
        testMap.put("900881100","Jalen Evans Moore");
        testMap.put("900212345","Ahmed El-Desoky");
        testMap.put("900098765","Robert Daniels");
        testMap.put("900946802","Carrington Body");
        testMap.put("900523445","Tia Bishop");
        testMap.put("900197330","Dominick Bioc");
        testMap.put("900398703","Evan Bell");
        testMap.put("900280981","Gabriel Allen");
        String input = "S";
        InputStream in = new ByteArrayInputStream(input.getBytes());
        System.setIn(in);
        assertEquals(testMap, userChooseStudentSelection());
    }
}
