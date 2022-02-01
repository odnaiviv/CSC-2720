import java.util.Scanner;

public class AscendingEvenOdd {
    public static void main(String[] args) {
        //code works perfectly fine with example array!
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
        //printing the original array
        System.out.println("Original Array: ");
        originalArray(array);
        //space to separate the two arrays/results
        System.out.println();
        //printing array that has been sorted
        System.out.println("Sorted Array: ");
        sortedArray(array);
    }
    //method to sort the array
    public static void sortedArray(int array[]) {
        //initializing variables
        int even = 0;
        int odd = array.length - 1;
        //checking for even numbers in the array
        while (even < odd) {
            while (array[even] % 2 == 0 && even < odd) {
                even++;
            }
            //checking for odd numbers in the array
            while (array[odd] % 2 == 1 && even < odd) {
                odd--;
            }
            //sorting the array
            if (even < odd) {
                int tempArray = array[even];
                array[even] = array[odd];
                array[odd] = tempArray;
                even++;
                odd--;
            }
            //organizing the sorted array so when called, the elements will be shown
            for (int i = 0; i < array.length; i++) {
                System.out.print(array[i] + " ");
            }
        }
    }
    //method to print the original array
    public static void originalArray(int array[]) {
        int len = array.length;

        for (int i = 0; i < len; i++) {
            System.out.print(array[i] + " ");
        }
    }
}
