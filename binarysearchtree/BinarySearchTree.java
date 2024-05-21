// 1.  LL is a tree that doesn't fork
// 2. Using hash map analogy, Binary tree uses left and right nodes
// 3. We can point to only two other nodes which makes it binary tree
// 4. Different types of tree
// ->Full tree- Tree either pointing to zero nodes or two nodes
// ->Perfect tree- Every level is completely full
// ->Complete tree- Filling from left to right
// 5. If a node has more than one parent it is not a tree.
// 6. Binary Search Tree (BST) - Greater number goes to the right of the node and smaller number goes to the left of the node
// 7. All Operations are O(log n) which is achieved by divide and conquer for perfect BST
// 8. In worst case O(n) cuz it converts into a LL
// 9. If we don't have an pointer pointing to the 1st node every node will be then garbage collected

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

    // Insert Method return type boolean if we were able to insert it or not
    // 1st Edge Case - If BST is empty
    // if(root == null) then root = newNode;
    // 2nd Edge case - If the value of the newNode already exists i.e. duplicate
    // inside while loop if(newNode==temp) return false;

    public boolean insert(int value) {
        Node newNode = new Node(value);
        // 1st Edge case
        if (root == null) {
            root = newNode;
            return true;
        }

        Node temp = root;
        while (true) {
            // 2nd Edge case
            if (newNode.value == temp.value)
                return false;
            if (newNode.value < temp.value) {
                if (temp.left == null) {
                    temp.left = newNode;
                    return true;
                }
                temp = temp.left;
            } else {
                if (temp.right == null) {
                    temp.right = newNode;
                    return true;
                }
                temp = temp.right;
            }
        }
    }

    // Contains method - If the given value exists in the tree or not
    public boolean contains(int value) {
        // if (root == null)
        // return false;
        // Not needed the above step as when we set Node temp = root it is
        // initially set as null and will return false
        Node temp = root;
        while (temp != null) {
            if (value < temp.value) {
                temp = temp.left;
            } else if (value > temp.value) {
                temp = temp.right;
            } else
                return true;
        }
        return false;
    }

}
