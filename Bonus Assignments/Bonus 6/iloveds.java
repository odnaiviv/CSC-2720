import java.util.*;

public class iloveds {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        //prompting user to enter their panther id
        System.out.print("Enter your Panther ID: ");
        int pantherID = scan.nextInt();

        //calling ILoveDataStructure method to print results
        int results = ILoveDataStructure(pantherID);
    }

    //method to count up the odd & even numbers in the panther id
    public static int ILoveDataStructure(int pantherID) {
        //counter
        int even = 0;
        int odd = 0;
        //checking through panther id
        while (pantherID > 0) {
            int remainder = pantherID % 10;
            //counting up even numbers
            if (remainder % 2 == 0) {
                even++;
            }
            //counting up odd numbers
            else {
                odd++;
            }
            pantherID /= 10;
        }
        //comparing if there are more even numbers than odd numbers & vice verse
        //printing results
        if (even > odd) {
            System.out.println("Now I am an expert using Data Structure!");
        }
        else {
            System.out.println("I will get an A+ in the final exam.");
        }
        return 0;
    }
}
