public class Main {
  public static void main(String[] args) {
    HashMap map = new HashMap();
    //setting up hash map
    //adding elements in from the Leetcode 706 problem

    //current map is (1, 1)
    map.insert(1, 1);
    //current map is (1, 1), (2, 2)
    map.insert(2, 2);
    //printing results with key (returns 1)
    System.out.println(map.get(1));
    //printing results with no key (returns -1)
    System.out.println(map.get(3));
    //current map is (1, 1), (2, 1)
    map.insert(2, 1);
    //printing results with key (returns 1)
    System.out.println(map.get(2));
    //current map is (1, 1)
    map.remove(2);
    //printing results with no key (returns -1)
    System.out.println(map.get(2));
  }
}
