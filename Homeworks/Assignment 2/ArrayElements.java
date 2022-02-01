import java.util.Scanner;

public class ArrayElements {
    public static void main(String[] args) {
        //code works perfectly fine with example array!
        Scanner scan = new Scanner(System.in);
        //initializing variables
        int size1;
        int size2;
        int size3;

        //prompting user to make arr1 length
        System.out.println("Enter Number of Elements for Array 1: ");
        //storing user input
        size1 = scan.nextInt();
        int[] arr1 = new int[size1];
        //prompting user to put numbers in arr1
        System.out.println("Enter Elements for Array 1: ");
        for(int i = 0; i < size1; i++) {
            arr1[i] = scan.nextInt();
        }
        //prompting user to make arr2 length
        System.out.println("Enter Number of Elements for Array 2: ");
        size2 = scan.nextInt();
        int[] arr2 = new int[size2];
        //prompting user to put numbers in arr2
        System.out.println("Enter Elements for Array 2: ");
        for(int i = 0; i < size2; i++) {
            arr2[i] = scan.nextInt();
        }
        //prompting users to make arr3 length
        System.out.println("Enter Number of Elements for Array 3: ");
        size3 = scan.nextInt();
        int[] arr3 = new int[size3];
        //prompting user to put numbers in arr3
        System.out.println("Enter Elements for Array 3: ");
        for(int i = 0; i < size3; i++) {
            arr3[i] = scan.nextInt();
        }
        //initializing temporary swappable variables
        int z1 = 0;
        int z3 = 0;
        int arr1sp[] = new int [size1 - size2];
        int arr3sp[]=new int [size3 - size2];

        //sorting elements between arr1 and arr2
        for(int i = 0; i < size1; i++) {
            //using flag to see if valid or not
            int flag = 1;
            for(int j = 0; j < size2; j++) {
                if(arr1[i] == arr2[j]) {
                    flag = 0;
                    break;
                }
            }
            if(flag == 1) {
                arr1sp[z1] = arr1[i];
                z1++;
            }

        }
        //sorting elements between arr3 and arr2
        for(int i = 0; i < size3; i++) {
            //using flag to see if valid or not
            int flag = 1;
            for(int j = 0; j < size2; j++) {
                if(arr3[i] == arr2[j]) {
                    flag = 0;
                    break;
                }
            }
            if(flag == 1) {
                arr3sp[z3] = arr3[i];
                z3++;
            }
        }
        //sorting arr1 in ascending order
        int tempArray = 0;
        for (int i = 0; i < arr1sp.length; i++) {
            for (int j = i + 1; j < arr1sp.length; j++) {
                if(arr1sp[i] > arr1sp[j]) {
                    tempArray = arr1sp[i];
                    arr1sp[i] = arr1sp[j];
                    arr1sp[j] = tempArray;
                }
            }
        }
        //sorting arr3 in ascending order
        for (int i = 0; i < arr3sp.length; i++) {
            for (int j = i + 1; j < arr3sp.length; j++) {
                if(arr3sp[i] > arr3sp[j]) {
                    tempArray = arr3sp[i];
                    arr3sp[i] = arr3sp[j];
                    arr3sp[j] = tempArray;
                }
            }
        }
        //putting together the sorted arrays
        int sortedSize = size2 + (size1 - size2) + (size3 - size2);
        int sortedArray[] = new int[sortedSize];
        int count = 0;
        for (int i = 0; i < size3 - size2; i++) {
            sortedArray[count] = arr3sp[i];
            count++;
        }
        for (int i = 0; i < size2; i++) {
            sortedArray[count] = arr2[i];
            count++;
        }
        for (int i = 0; i < size1-size2; i++) {
            sortedArray[count] = arr1sp[i];
            count++;
        }
        //printing sorted array
        System.out.println("Sorted Array: ");
        for (int i = 0; i < sortedSize; i++) {
            System.out.print(sortedArray[i]+" ");
        }
    }
}
