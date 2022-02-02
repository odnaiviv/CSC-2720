//1) my double circular linked list code from 10/15 lab
public class doublecirclelink {
  private doublecirclelink.Node head;

  static class Node {
    public int list;
    public Node next;
    public Node previous;
  }
  
  //question 1
    //method to check if element is in linked list or not
    public void contain(int num) {
        int count = 0;
        //checking if element is in linked list
        if (head.list == num) {
            System.out.println("\nIndex Number: " + 1);
        }
        //checking if element is in linked list
        Node tempNode = head.next;
        while (tempNode != head) {
            count += 1;
            if (tempNode.list == num) {
                System.out.println("\nIndex Number: " + count);
                return;
            }
            tempNode = tempNode.next;
        }
        //prints when element is not in linked list
        System.out.println("\nElement is not in this linked list.");
    }

    //question 2
    //method to add element to doubly circular linked list
    public void addElement(int num) {
        Node tempNode = new Node();
        tempNode.list = num;
        //checking if head is null
        if (head == null) {
            tempNode.next = tempNode.previous = tempNode;
            head = tempNode;
        }
        else {
            //checking if linked list is not null
            Node lastNode = head.previous;
            tempNode.next = head;
            head.previous = tempNode;
            tempNode.previous = lastNode;
            lastNode.next = tempNode;
        }
    }

    //method to get element from doubly circular linked list
    public Node get(int num) {
        Node tempNode = head;
        while (tempNode.next != head) {
            if (tempNode.list == num) {
                return tempNode;
            }
            else {
                tempNode = tempNode.next;
            }
        }
        return null;
    }

    //method to count elements in double circular linked list
    public int size() {
        Node tempNode = head.next;
        int count = 1;
        while(tempNode != head) {
            count += 1;
            tempNode = tempNode.next;
        }
        return count;
    }

    //method to update specific element with new value
    public void update(int previous, int num) {
        Node tempNode = head;
        while(tempNode.list != previous) {
            tempNode = tempNode.next;
        }
        tempNode.list = num;
    }

    //method to remove element from double circular linked list
    public void remove(int num) {
        Node tempNode = head;
        while(tempNode.next.list != num) {
            tempNode = tempNode.next;
        }
        Node removeNode = tempNode.next.next;
        tempNode.next = removeNode;
        removeNode.previous = tempNode;
    }

    //printing the node
    public void printNode() {
        Node tempNode = head.next;
        System.out.print(head.list + " -> ");
        while(tempNode != head) {
            System.out.print(tempNode.list + " -> ");
            tempNode = tempNode.next;
        }
    }
}
