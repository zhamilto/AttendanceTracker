package AttendanceTracker;

import java.util.*;

public class EmailPreview {

    public static void emailPreviewSelector() {
        Scanner input = new Scanner(System.in);

        System.out.println("Would you like to preview the e-mail (Y/N)?");
        String choice;

        while(true) {
            choice = input.nextLine();
            if(choice.toLowerCase().equals("y")) {
                emailPreview();
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

    private static void emailPreview() {

    }

}
