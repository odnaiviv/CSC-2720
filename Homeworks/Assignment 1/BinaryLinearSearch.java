//2) binary and linear search

public class BinaryLinearSearch {
    public static void main(String[] args) {
        //creating array from example
        int arrayNum[] = {0, 5, 10};
        //searching for 10 in array from example
        int searchNum = 10;
        //you can change the values in the arrayNum and the searchNum to check and see code work

        //calling linear search method
        System.out.println("Linear Search: " + linearSearch(arrayNum, searchNum));
        //calling binary search method
        System.out.println("Binary Search: " + binarySearch(arrayNum, searchNum));
    }
    //a) linear search
    public static int linearSearch(int arrayNum[], int searchNum) {
        int len = arrayNum.length;
        //loop to store array values as i
        for (int i = 0; i < len; i++) {
            //returns i if the search number equals the element being searched
            if (arrayNum[i] == searchNum)
                return i;
        }
        //returns -1 if element in array does not exist
        return -1;
    }
    //b) binary search
    public static int binarySearch(int arrayNum[], int searchNum) {
        //temporary
        int firstNum = 0;
        int lastNum = arrayNum.length - 1;
        int middleNum = (firstNum + lastNum) / 2;
        //loop to check for searchNum
        while (firstNum <= lastNum) {
            //checking if searchNum is less than middle number but greater than first number
            if (arrayNum[middleNum] < searchNum) {
                //add one to look for searchNum again
                firstNum = middleNum + 1;
            }
            //checking if searchNum is the middle number
            else if (arrayNum[middleNum] == searchNum) {
                return middleNum;
            }
            //checking if searchNum is greater than middle number but less than last number
            else {
                lastNum = middleNum - 1;
            }
            //the average between the first and last numbers
            middleNum = (firstNum + lastNum) / 2;
        }
        //returns -1 if element in array does not exist
        return -1;
    }
}
