import java.util.Scanner;
import java.util.ArrayList;

public class Balance {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        //prompting user to enter (, ), or both
        System.out.println("Enter String with ( or ): ");
        String parentheses = scan.nextLine();
        //initializing method to check if parentheses are balanced
        String checkForBalance = parenthesesBalanced(parentheses);
        //printing results
        System.out.println(checkForBalance);
    }

    //method to check if parentheses are balanced or not
    public static String parenthesesBalanced (String parentheses) {
        String isbalanced = "False";
        //initializing array list
        ArrayList<String> arrayL = new ArrayList<String>();

        for (int i = 0; i < parentheses.length(); i++) {
            //checking to see if string starts with (
            if (parentheses.charAt(i) == '(') {
                arrayL.add(Character.toString(parentheses.charAt(i)));
            }
            //checking to see if string ends with )
            else if (parentheses.charAt(i) == ')') {
                if (arrayL.size() != 0 && arrayL.get(arrayL.size() - 1).equals("(") && parentheses.charAt(i) == ')') {
                    arrayL.remove(arrayL.size() - 1);
                }
                //returns false when a pair of parentheses () cannot be found/when parentheses are unbalanced
                else {
                    return isbalanced = "False";
                }
            }
        }
        //returns true when parentheses are balanced
        if (arrayL.isEmpty() == true) {
            return isbalanced = "True";
        }
        return isbalanced;
    }
}
