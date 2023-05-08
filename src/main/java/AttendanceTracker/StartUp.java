package AttendanceTracker;

public class StartUp {
    public static String repeat_char(int num, String c) {
        String s = "";
        for(int i = 0; i < num; i++){
            s = s + c;

        }
        return s;
    }
    public static void displayTitle(){
        System.out.println(repeat_char(40, "-"));
        System.out.println(repeat_char(5, "-") + "Welcome to Attendance Tracker" + repeat_char(5, "-"));
        System.out.println(repeat_char(40, "-"));
    }


}
