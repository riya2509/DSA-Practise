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

    // Constructor - a special type of method which is used to initialize the
    // object.
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

    public Node getHead() {
        // System.out.println("Head:" + head.value);
        return head;
    }

    public Node getTail() {
        // System.out.println("Tail:" + tail.value);
        return tail;
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
        if (index < 0 || index > length)
            return false;
        if (index == 0) {
            prepend(value);
            return true;
        }
        if (index == length) {
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

    // Reversing the same LL no duplicate reversed LL and it
    // will have no return type
    public void reverse() {
        Node temp = head;
        head = tail;
        tail = temp;
        Node after = temp.next;
        Node before = null;
        for (int i = 0; i < length; i++) {
            after = temp.next;
            temp.next = before;
            before = temp;
            temp = after;
        }
    }

    // Finding Middle Node of LL using Floyd's Tortoise and Hare algorithm
    public Node findMiddleNode() {
        Node slow = head;
        Node fast = head;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }

    // Detecting a cycle in a LL using Floyd's cycle finding or Tortoise
    // and Hare algorithm

    // Note: Both the conditions in while loop are necessary
    // fast!=null if fast pointer reached the end of the list
    // fast.next!=null so that the code doesn't throw a NullPointerException

    public boolean hasLoop() {
        Node slow = head;
        Node fast = head;
        if (length == 0 || length == 1)
            return false;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
            if (slow == fast)
                return true;
        }
        return false;
    }

    // Merging Two sorted lists using recursion
    public Node mergeTwoLists(Node list1, Node list2) {
        if (list1 == null)
            return list2;
        if (list2 == null)
            return list1;
        if (list1.value < list2.value) {
            list1.next = mergeTwoLists(list1.next, list2);
            return list1;
        } else {
            list2.next = mergeTwoLists(list1, list2.next);
            return list2;
        }
    }

    // declared static so that it can be called without an instance of 'LinkedList'
    public static void printList(Node head) {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.value + " -> ");
            temp = temp.next;
        }
        System.out.println("null");
    }

    // Find Kth Node from end Using the two pointer method / runner technique.

    public Node findKthFromEnd(int k) {
        Node slow = head;
        Node fast = head;

        for (int i = 0; i < k; i++) {
            if (fast == null) {
                return null;
            }
            fast = fast.next;
        }

        while (fast != null) {
            slow = slow.next;
            fast = fast.next;
        }

        return slow;
    }
}
