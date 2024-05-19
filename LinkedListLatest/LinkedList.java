package LinkedListLatest;

public class LinkedList {
    private Node head;
    private Node tail;
    private int length;

    // Inner class for creating a new node whenever needed (First create this class
    // then shift it inside LinkedList class)
    class Node {
        int value;
        Node next;

        // Constructor
        Node(int value) {
            this.value = value;
            // this.value means "value" declared in class Node
            // value means "value" used in brackets
        }
    }

    // Constructor
    public LinkedList(int value) {
        Node newNode = new Node(value);
        // newNode is a variable of type Node
        // new Node(value) this creates a new Node
        head = newNode;
        tail = newNode;
        length = 1;
    }

    // Method inside of LinkedList class
    public void printList() {
        Node temp = head;
        while (temp != null) {
            System.out.println(temp.value);
            temp = temp.next;
        }
    }

    public void getHead() {
        System.out.println("Head:" + head.value);
    }

    public void getTail() {
        System.out.println("Tail:" + tail.value);
    }

    public void getLength() {
        System.out.println("Length:" + length);
    }

    public void append(int value) {
        Node newNode = new Node(value);
        if (length == 0) {
            head = newNode;
            tail = newNode;
        } else {
            tail.next = newNode;
            tail = newNode;
        }
        length++;
    }

    // The return type of the method is Node
    public Node removeLast() {
        // Edge case When the Linked List is empty
        if (length == 0) // When the initial length of the LL is 0
            return null;
        // When the Linked List has some value
        Node temp = head;
        Node pre = head;
        while (temp.next != null) {
            pre = temp;
            temp = temp.next;
        }
        tail = pre; // pre's task over
        tail.next = null; // breaking that node from the end
        length--;
        // Edge case when the linked list has only one item
        if (length == 0) { // When the length of LL is decremented to 0
            head = null;
            tail = null;
        }
        return temp;
    }

    public void prepend(int value) {
        Node newNode = new Node(value);
        if (length == 0) {
            head = newNode;
            tail = newNode;
        } else {
            newNode.next = head;
            head = newNode;
        }
        length++;
    }

    public Node removeFirst() {
        if (length == 0)
            return null;
        Node temp = head;
        head = head.next;
        temp.next = null;
        length--;
        if (length == 0) {
            // head = null not needed as head already null in case of one item
            tail = null;
        }
        return temp;
    }

    // Getting a node at a particular index
    public Node get(int index) {
        if (index < 0 || index >= length)
            return null;
        Node temp = head;
        for (int i = 0; i < index; i++) {
            temp = temp.next;
        }
        return temp;
    }

    // Set method for returning a boolean value if we could set a new value in the
    // node
    public boolean set(int index, int value) {
        Node temp = get(index);
        if (temp != null) {
            temp.value = value; // value means setting the value present in the parameter
            return true;
        }
        return false;
    }

    // Insert a node and returning boolean value
    public boolean insert(int index, int value) {
        if (index < 0 || index >= length)
            return false;
        if (index == 0) {
            prepend(value);
            return true;
        }
        if (index == length - 1) {
            append(value);
            return true;
        }
        Node newNode = new Node(value);
        Node temp = get(index - 1);
        newNode.next = temp.next;
        temp.next = newNode;
        length++;
        return true;
    }

    // Remove a node and return node
    public Node remove(int index) {
        if (index < 0 || index >= length)
            return null;
        if (index == 0)
            return removeFirst();
        if (index == length - 1)
            return removeLast();
        Node prev = get(index - 1);
        Node temp = prev.next; // Can also use get method here but minimizing from O(n) to O(1)
        prev.next = temp.next;
        temp.next = null;
        length--;
        return temp;
    }
}
