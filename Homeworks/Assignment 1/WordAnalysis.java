//3) word analysis
import java.util.Scanner;

public class WordAnalysis {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        //prompting user to pick a method to call
        System.out.println("Input method (MIN, MAX, RANGE, AVERAGE, MODE): ");
        String method = scan.nextLine();
        //prompting user to enter amount of words in their list
        System.out.println("Input number for word list: ");
        int wordNum = scan.nextInt();
        //prompting user to enter a list of words
        System.out.println("Input word in word list: ");
        String[] wordsInList = new String[wordNum];
        for (int i = 0; i <= wordNum; i++) {
            wordsInList[i] = scan.nextLine();
        }

        //choosing method based on what user inputted in first line/question
        //didn't have enough time make it robust but whatever lol
        if (method.equals("MIN")) {
            //calling minWordLength method
            System.out.println(minWordLength(wordsInList));
        }
        else if (method.equals("MAX")) {
            //calling maxWordLength method
            System.out.println(maxWordLength(wordsInList));
        }
        else if (method.equals("RANGE")) {
            //calling wordLengthRange method
            System.out.println(wordLengthRange(wordsInList));
        }
        else if (method.equals("AVERAGE")) {
            //calling averageWordLength method
            System.out.println(averageWordLength(wordsInList));
        }
        else if (method.equals("MODE")) {
            //calling mostCommonWordLength method
            System.out.println(mostCommonWordLength(wordsInList));
        }
        else {
            System.out.println("Invalid method.");
        }
    }
    //minWordLength method to find the smallest word in list
    public static int minWordLength(String[] wordsInList) {
        //using max number to find the least length in array
        int maxNum = Integer.MAX_VALUE;
        for (int i = 0; i < wordsInList.length; i++) {
            if (wordsInList[i].length() < maxNum) {
                maxNum = wordsInList[i].length();
            }
        }
        return maxNum;
    }
    //maxWordLength method to find the largest word in list
    public static int maxWordLength(String[] wordsInList) {
        //using min number to find the greatest length in array
        int minNum = Integer.MIN_VALUE;
        for(int i = 0; i < wordsInList.length; i++) {
            if (wordsInList[i].length() > minNum) {
                minNum = wordsInList[i].length();
            }
        }
        return minNum;
    }
    //wordLengthRange to find the range of the word lengths in list
    public static int wordLengthRange(String[] wordsInList) {
        //initializing min and max values
        int max = maxWordLength(wordsInList);
        int min = minWordLength(wordsInList);
        //calculating the range by subtracting max from min
        int range = max - min;
        return range;
    }
    //averageWordLength method to find the average of the word length in list
    public static double averageWordLength(String[] wordsInList) {
        //initializing temporary sum
        double sumOfWords = 0;
        for(int i = 0; i < wordsInList.length; i++) {
            sumOfWords = sumOfWords + wordsInList[i].length();
        }
        //calculating for average from sum
        double averageNum = sumOfWords / wordsInList.length;
        return averageNum;
    }
    //mostCommonWordLength method to find the most common length of words
    //the method i struggled the most with :(
    public static int mostCommonWordLength(String[] wordsInList) {
        int countLen[] = new int[101];
        int maxLen = -1;
        int maxNum = Integer.MIN_VALUE;

        //loop to get the count of all length types
        for (int i = 0; i < wordsInList.length; i++) {
            countLen[wordsInList[i].length()]++;
            //storing max number and max length
            if (countLen[wordsInList[i].length()] > maxNum) {
                maxNum = countLen[wordsInList[i].length()];
                maxLen = wordsInList[i].length();
            }
        }
        //loop to find a tie
        for (int i = 0; i < countLen.length; i++) {
            if (countLen[i] == maxNum) {
                if (i != maxLen) {
                    //returning -1
                    return -1;
                }
            }
        }
        //returning max length
        return maxLen;
    }
}
