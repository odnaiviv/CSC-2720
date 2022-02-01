//1) prompting user to input and to display their name
import java.util.Scanner;

public class HelloName {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        //prompting user to enter name
        System.out.print("What is your name? ");
        String name = scan.nextLine();
        //if user only presses enter key, this loop will reprompting user to input
        while (name.equals("")) {
            System.out.print("What is your name? ");
            name = scan.nextLine();
        }
        //prints results
        System.out.print("Hello, " + name + "!");
    }
}
