//  Queue use FIFO - First In First Out
// Adding -> enqueued, remove -> dequeued, head -> first, tail -> last
// add from last i.e. from the tail side and remove from the 
// head side , as both operation then takes O(1)

package queue;

public class Queue {
    private Node first;
    private Node last;
    private int length;

    class Node {
        int value;
        Node next;

        Node(int value) {
            this.value = value;
        }
    }

    public Queue(int value) {
        Node newNode = new Node(value);
        first = newNode;
        last = newNode;
        length = 1;
    }

    public void printQueue() {
        Node temp = first;
        while (temp != null) {
            System.out.print(temp.value);
            temp = temp.next;
        }
    }

}
