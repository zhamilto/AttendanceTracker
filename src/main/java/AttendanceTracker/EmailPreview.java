package AttendanceTracker;

import java.util.*;

public class EmailPreview {
    //Instance variables are declared statically for use in private method
    static String email;

    public EmailPreview(String inEmail){
        email = inEmail;
    }

    public static void emailPreviewSelector() {
        Scanner input = new Scanner(System.in);

        System.out.println("Would you like to preview the e-mail (Y/N)?");
        String choice;

        while(true) {
            choice = input.nextLine();
            if(choice.toLowerCase().equals("y")) {
                emailPreview(email);
                break;
            }
            if(choice.toLowerCase().equals("n")) { 
                break;
            } else { 
                System.out.println("Invalid Option.");
                System.out.println("Would you like to preview the e-mail (Y/N)?");
            }
        }
    }

    private static void emailPreview(String email) {
        System.out.println("To: registrars@xula.edu");
        System.out.println("From: attendancetracker@xula.edu"+"\n");
        System.out.println(email);      
    }
}
