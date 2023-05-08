package AttendanceTracker;

import java.util.*;

public class EmailPreview {
    //Instance variables are declared statically for use in private method
    static String sender;
    static String recepient;
    static String subject;
    static String body;

    public EmailPreview(String inSender, String inRecepient,String inSubject, String inBody){
        sender = inSender;
        recepient = inRecepient;
        subject = inSubject;
        body = inBody;
    }

    public static void emailPreviewSelector() {
        Scanner input = new Scanner(System.in);

        System.out.println("Would you like to preview the e-mail (Y/N)?");
        String choice;

        while(true) {
            choice = input.nextLine();
            if(choice.toLowerCase().equals("y")) {
                emailPreview(sender, recepient, subject, body);
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

    private static void emailPreview(String sender, String recepient, String subject, String body) {
        System.out.println("To: " + recepient);
        System.out.println("From: " + sender);
        System.out.print("Subject: " + subject + "\n");
        System.out.println(body);      
    }
}
