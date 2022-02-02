import java.util.Scanner;

public class BinarySearchTree {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[] binaryTree;

        //prompting user to enter elements in tree
        System.out.println("Enter Binary Tree Elements: ");
        String input = scan.nextLine();
        //converting input from string to int
        if (input.equals("")) {
            binaryTree = new int[0];
        }
        else {
            String[] treeString = input.split(" ");
            binaryTree = new int[treeString.length];
            for (int i = 0; i < treeString.length; i++) {
                binaryTree[i] = Integer.parseInt(treeString[i]);
            }
        }
        //printing results
        System.out.println("Results: " + checkBinaryTree(binaryTree));
    }

    //method to check if binary tree is a binary search tree
    private static boolean checkBinaryTree(int[] binaryTree) {
        return checkTree(binaryTree, 0, Integer.MIN_VALUE, Integer.MAX_VALUE);
    }

    //method to check if tree is a binary search tree
    private static boolean checkTree(int[] binaryTree, int index, int minValue, int maxValue) {
        if (binaryTree[index] < minValue || binaryTree[index] > maxValue) {
            return false;
        }
        if (index * 2 + 1 < binaryTree.length &&
        !checkTree(binaryTree, index * 2 + 1, minValue, binaryTree[index])) {
            return false;
        }
        if (index * 2 + 2 < binaryTree.length &&
        !checkTree(binaryTree, index * 2 + 2, binaryTree[index], maxValue)) {
            return false;
        }
        return true;
    }
}

// Time Complexity: O(n)
// Space Complexity: O(1)