public class Main {
  public static void main(String[] args) {
    BinarySearchTree bstree = new BinarySearchTree();
    //setting up binary search tree
    //adding elements from example
    bstree.insert(5);
    bstree.insert(6);
    bstree.insert(3);
    bstree.insert(2);
    bstree.insert(4);
    bstree.insert(7);
    //printing tree input
    System.out.print("Input: ");
    bstree.printTree();

    //deleting node from tree
    //key = 3
    System.out.println("Key = 3");
    bstree.setRoot(bstree.delete(bstree.getRoot(), 3));
    //printing tree output after removing node 3 from tree
    System.out.print("Output: ");
    bstree.printTree();
  }
}
