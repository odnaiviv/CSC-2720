import java.util.Scanner;

public class ArrayReversing {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        //prompting user to enter length of array
        System.out.println("Length of Array?: ");
        int length = scan.nextInt();

        //initializing array
        int array[] = new int[length];
        //prompting user to enter elements in array
        System.out.println("Enter " + length + " numbers: ");
        for (int i = 0; i < array.length; i++) {
            array[i] = scan.nextInt();
        }

        //printing original array
        System.out.print("Original Array: ");
        originalArray(array);
        //space to separate the two arrays/results
        System.out.println();
        //printing the array in reversed
        System.out.print("Reversed Array: ");
        reversedArray(array);
    }

    //method to print the user inputted array
    public static void originalArray(int array[]) {
        //initializing variable(s)
        int len = array.length;

        for (int i = 0; i < len; i++) {
            System.out.print(array[i] + " ");
        }
    }

    //method to print the array in reverse order
    public static void reversedArray(int array[]) {
        //initializing variable(s)
        int firstNum = 0;
        int lastNum = array.length - 1;

        for (int i = 0; i <array.length; i++ ) {
            //swapping the numbers
            while (firstNum < lastNum) {
                int tempArray = array[firstNum];
                array[firstNum] = array[lastNum];
                array[lastNum] = tempArray;
                firstNum = firstNum + 1;
                lastNum = lastNum - 1;
            }
            System.out.print(array[i] + " ");
        }
    }
}
