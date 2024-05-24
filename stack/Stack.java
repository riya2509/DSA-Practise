//  LIFO - Last in First Out
//  Implemented using Linked List
// push -> prepend, pop -> removeFirst, head -> top, length -> height
// As both remove and insert operation is O(1) from the start of the 
// LL therefore the stack's last element's next pointer will point to null

package stack;

public class Stack {

    private Node top;
    private int height;

    class Node {
        int value;
        Node next;

        Node(int value) {
            this.value = value;
        }
    }

    public Stack(int value) {
        Node newNode = new Node(value);
        top = newNode;
        height = 1;
    }

    public void printStack() {
        Node temp = top;
        while (temp != null) {
            System.out.print(temp.value);
            temp = temp.next;
        }

    }

    public void getTop() {
        System.out.println("Top : " + top.value);
    }

    public void getHeight() {
        System.out.println("Height : " + height);
    }
}
