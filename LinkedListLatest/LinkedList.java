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
}
