package LinkedListLatest;

public class Main {
    public static void main(String args[]) {
        LinkedList myLinkedList = new LinkedList(4);
        myLinkedList.append(1);
        // myLinkedList.getHead();
        // myLinkedList.getTail();
        // myLinkedList.getLength();
        myLinkedList.prepend(5);
        myLinkedList.printList();

        // System.out.println(myLinkedList.removeLast().value); // for 2 items and
        // returns Node so use .value
        // System.out.println(myLinkedList.removeLast().value);// for 1 item
        // System.out.println(myLinkedList.removeLast()); // for 0 item and returns null
        // so null.value not correct

    }
}
