package hashtable;

import java.util.ArrayList;

//Hash Table - Key value pairs "key":1000 <-- value

// 1. Works only in one way passing key we get index where it is stored
// 2. Deterministic - Every time we get the same index when we pass the same key
// 3. Separate Chaining - When collision occurs put two keys at the same index
// The above method uses a linked list at that index to store multiple keys
// 4. Linear probing - When collision occurs iterate the indexes until we get the next empty spot
//  Above is also a type of open addressing

public class HashTable {
    private int size = 7;
    private Node[] dataMap; // array of pointers

    class Node {
        String key;
        int value;
        Node next;

        // Constructor
        Node(String key, int value) {
            this.key = key;
            this.value = value;
        }
    }

    public HashTable() {
        dataMap = new Node[size];
    }

    public void printTable() {
        for (int i = 0; i < dataMap.length; i++) {
            System.out.println(i + ":");
            Node temp = dataMap[i];
            while (temp != null) {
                System.out.println(" {" + temp.key + "= " + temp.value + "}");
                temp = temp.next;
            }
        }
    }

    // Hash Method private cuz only going to be used by other methods in the
    // HashTable class

    private int hash(String key) {
        int hash = 0;
        char[] keyChars = key.toCharArray(); // ['p','a','i','n','t']
        for (int i = 0; i < keyChars.length; i++) {
            int asciiValue = keyChars[i]; // for p asciiValue = 112
            hash = (hash + asciiValue * 23) % dataMap.length; // Any prime number instead of
            // 23 can be used and prime number is used to get a more random number
            // and % will give remainder ranging from 0-6 as length =7
        }
        return hash;
    }

    // Set method
    public void set(String key, int value) {
        int index = hash(key);
        Node newNode = new Node(key, value);
        // if no items in LL
        if (dataMap[index] == null) {
            dataMap[index] = newNode;
        }
        // after there are some items in LL
        else {
            Node temp = dataMap[index]; // Pointing temp to the first node
            // Now iterating through the LL
            while (temp.next != null) {
                temp = temp.next;
            } // This loop stops us at last node
            temp.next = newNode;
        }
    }

    // Get method taking key input and return value of the key which is int
    public int get(String key) {
        int index = hash(key);
        Node temp = dataMap[index]; // If no LL present then temp = null and return 0
        // This code snippet if there is a LL present at that index
        while (temp != null) {
            if (temp.key == key)
                return temp.value;
            temp = temp.next;
        }
        return 0;
    }

    // Keys Method - taking keys in the hash table , put them in an array list and
    // return it
    public ArrayList keys() {
        // Creating the ArrayList
        ArrayList<String> allKeys = new ArrayList<>();
        for (int i = 0; i < dataMap.length; i++) {
            Node temp = dataMap[i];
            // Cannot use a for loop cuz we don't know how many items in LL
            while (temp != null) {
                // Adding items to ArrayList
                allKeys.add(temp.key);
                temp = temp.next;
            }
        }
        return allKeys;
    }
}
