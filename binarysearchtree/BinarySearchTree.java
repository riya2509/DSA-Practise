package binarysearchtree;

public class BinarySearchTree {
    /* private */ Node root; // Removing private cuz we want to have access to rrot outside the class

    class Node {
        int value;
        Node left;
        Node right;

        // Constructor
        private Node(int value) {
            this.value = value;
        }
    }
    // We don't need a constructor for BinarySearchTree class as the only thing it
    // does is to create a root node which will be set as null which will be
    // redundant as it is already set to null when initially writting private Node
    // root
}
