import java.util.*;

//class to create nodes
class Node {
    public int number;
    public Node left;
    public Node right;

    public Node(int number) {
        this.number = number;
        this.left = null;
        this.right = null;
    }
}
//binary search tree class to insert and delete nodes
public class BinarySearchTree {
    //declaring root as a private node that's null
    private Node root;
    public BinarySearchTree() {
        root = null;
    }
    //method to return root
    public Node getRoot() {
        return root;
    }
    //method to set root
    public void setRoot(Node root) {
        this.root = root;
    }
    //method to recursively check and put elements into tree
    public Node checkForInsert(int number, Node head) {
        //checking if head is empty
        if (head == null) {
            return new Node(number);
        }
        //checking if element numbers from head node is greater than element node
        else if (head.number < number) {
            //putting head on right side
            head.right = checkForInsert(number, head.right);
            return head;
        }
        else {
            //putting head node on left side
            head.left = checkForInsert(number, head.left);
            return head;
        }
    }
    //method to put elements into tree
    public void insert(int number) {
        //calling recursive method to put elements into tree
        root = checkForInsert(number, root);
    }
    //method to print tree in order
    public void printTree() {
        Node tempNode = root;
        //using queue and linked list to better format my tree print
        Queue<Node> que = new LinkedList<Node>();
        //checking if temporary node is empty
        if (tempNode == null) {
            //printing an empty tree array
            System.out.println("[]");;
        }
        else {
            //printing tree with elements
            System.out.print("[" + tempNode.number);
            que.add(tempNode);
            while (!que.isEmpty()) {
                tempNode = que.poll();
                //checking if left and right side of temporary node is empty or not
                if (tempNode.left != null || tempNode.right != null) {
                    System.out.print(", ");
                    //checking for left side
                    if (tempNode.left != null) {
                        //putting element in left side
                        System.out.print(tempNode.left.number + ", ");
                        que.add(tempNode.left);
                    }
                    //printing "null" if element is not found
                    else {
                        System.out.print("null, ");
                    }
                    //checking for right side
                    if (tempNode.right != null) {
                        //putting element in right side
                        System.out.print(tempNode.right.number);
                        que.add(tempNode.right);
                    }
                    //printing "null" if element is not found
                    else {
                        System.out.print("null");
                    }
                }
            }
            System.out.println("]");
        }
    }
    //method to return the successor of tree in order
    public Node getSuccessor (Node head) {
        //checking if left of head is empty or not
        while (head.left != null) {
            head = head.left;
        }
        return head;
    }
    //method to delete key from tree and return root node
    public Node delete(Node head, int key) {
        //checking if head is empty
        if (head == null) {
            return head;
        }
        //removing node from right side
        else if (head.number < key) {
            head.right = delete(head.right, key);
            return head;
        }
        //removing node from left side
        else if (head.number > key) {
            head.left = delete(head.left, key);
            return head;
        }
        //checking if left and right side are empty or not
        else {
            if (head.left == null) {
                return head.right;
            }
            else if (head.right == null) {
                return head.left;
            }
            else {
                head.number = getSuccessor(head.right).number;
                head.right = delete(head.right, head.number);
            }
        }
        return head;
    }
}
