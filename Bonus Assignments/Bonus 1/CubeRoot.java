import java.util.Scanner;

public class CubeRoot {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        //prompting user to enter number
        System.out.println("Enter a Number: ");
        int num = scan.nextInt();
        //printing results
        System.out.println("Square Root: " + cube(num));
    }

    //method to find the cube root of a number through binary search
    public static int cube(int num) {
        //initializing variables
        //upper and lower bound
        int leftNum = 1;
        int rightNum = num;

        int results = 0;
        while (leftNum <= rightNum) {
            //finding the value of the middle number
            int middleNum = leftNum + (rightNum - leftNum) / 2;
            //checking if middle number is a perfect cube
            if (middleNum * middleNum * middleNum == num) {
                return middleNum;
            }
            //if number is not perfect cube, program shifts to lower bound
            if (middleNum * middleNum * middleNum < num) {
                leftNum = middleNum + 1;
                results = middleNum;
            }
            //program shifts to upper bound
            else {
                rightNum = middleNum - 1;
            }
        }
        return results;
    }
}
