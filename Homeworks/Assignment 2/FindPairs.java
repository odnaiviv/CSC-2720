import java.util.Scanner;

public class FindPairs {
    public static void main(String[] args) {
        //code works perfectly fine with example array!
        //prof changed runtime from O(n) to O(n^2), so code runtime is O(n^2)
        Scanner scan = new Scanner(System.in);
        //initializing variables
        int k;
        int n;

        //prompting usesr to input k and n values
        System.out.println("Enter the value of k: ");
        //storing k and n values
        k = scan.nextInt();
        System.out.println("Enter the value of n: ");
        n = scan.nextInt();
        //initializing array
        int[] array = new int[n];
        //prompting user to enter values in array
        System.out.println("Enter elements in Array: ");
        for (int i = 0; i < array.length; i++) {
            array[i] = scan.nextInt();
        }
        //printing results
        System.out.println("Pairs Found: " + sumPairs(array, k));
    }

    //method to find the sum of the pairs
    public static int sumPairs(int[] array, int k) {
        //initializing variables
        int count = 0;

        for (int i = 0; i < array.length; i++) {
            for (int j = i + 1; j < array.length; j++) {
                //checking to see if sum equals k
                if (array[i] + array[j] == k) {
                    count++;
                }
            }
        }
        return count;
    }
}
