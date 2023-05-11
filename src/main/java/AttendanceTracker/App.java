package AttendanceTracker;
import java.time.Year;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.Collection;
import java.util.HashMap;

public class App {

    static void StartUp(){
        StartUp.displayTitle();
    }

    static void Preview(){
        DisplayCourses.displayAndChooseCourse();
        int year = YearOptions.userChooseYearStyle();
        SemesterOptions.displaySemestersFromMap(SemesterOptions.semesters);


        int choice = SemesterOptions.promptUserforSemester(SemesterOptions.semesters);
        String enteredSemester;
        if(choice != 0){
            enteredSemester = SemesterOptions.selectSemester(SemesterOptions.semesters, choice);
            System.out.println("Entered Semester is: " + enteredSemester);
        } else {
            enteredSemester = SemesterOptions.selectDefaultSemester(SemesterOptions.semesters);
            System.out.println("Entered Semester is: " + enteredSemester);
        }

        System.out.println("Loading courses for " + enteredSemester+ " " + year + "...");

        //CourseOptions.displayCourses(CourseOptions.courses);
        //String course = CourseOptions.selectCourse(CourseOptions.courses);


    }

    static void Adimin() {

        HashMap roster = AbsentStudent.userChooseStudentSelection();

        String email = FormatEmail.chooseTemplate();

        EmailPreview preview = new EmailPreview(email);

        EmailPreview.emailPreviewSelector();

    }

    public static void main(String[] args) {
        App.StartUp();
        App.Preview();
        App.Adimin();
    }

}