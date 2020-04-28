import java.util.Scanner;

public class Simple_Eliza_Application {
    public static void main(String[] args) {
        /*
            case 1:
                Good day. What is your problem? Enter your response here or Q to quit: i have headaches
                Why did you say i have headaches ?
                Enter your response here or Q to quit: i did not sleep wll last night
                Why did you say i did not sleep wll last night ?
                Enter your response here or Q to quit: i had a lot of java assignments
                Why did you say i had a lot of java assignments ?
                Enter your response here or Q to quit: coz am taking java mini boot camp course
                Why did you say coz am taking java mini boot camp course ?
                Enter your response here or Q to quit: q
                Thank you for the chat!! Bay.
           case 2:
                Good day. What is your problem? Enter your response here or Q to quit: am sick
                Why did you say am sick ?
                Enter your response here or Q to quit: coz am sick
                Why did you say coz am sick ?
                Enter your response here or Q to quit: i am feeling great
                Thank you for the chat!! Bay.
         */

        String response, question;
        Scanner in = new Scanner(System.in);

        System.out.print("Good day. What is your problem? Enter your response here or Q to quit: ");
        response = in.nextLine();
        while (!(response.equalsIgnoreCase("I am feeling great"))
                && !(response.equalsIgnoreCase("Q")))
        {
            System.out.println("Why did you say " + response + " ?");
            System.out.print("Enter your response here or Q to quit: ");
            response = in.nextLine();

        }
        System.out.println("Thank you for the chat!! Bay.");





    }
}
