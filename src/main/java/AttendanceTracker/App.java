/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package AttendanceTracker;

public class App {
    public String getGreeting() {
        return "Hello world.";
    }

    public static void main(String[] args) {
        System.out.println(new App().getGreeting());
       int userchoice = AppHelper.yearOption();
        int year = AppHelper.yearFromChoice(userchoice);
        System.out.println(year);
    }
}
