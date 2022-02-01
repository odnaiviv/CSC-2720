public class HashMap {
    //initializing data structure
    int[] array;
    public HashMap() {
        array = new int[1000001];
    }
    //method to put in non-negative value
    public void insert(int key, int value) {
        array[key] = value + 1;
    }
    //method to return mapped key value or -1
    public int get(int key) {
        return array[key] - 1;
    }
    //method to remove mapping of key
    public void remove(int key){
        array[key] = 0;
    }
}

// Time Complexity: O(1)
// Space Complexity: O(1)
