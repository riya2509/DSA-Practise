package LinkedListLatest;

public class Main {
    public static void main(String args[]) {
        LinkedList myLinkedList = new LinkedList(11);
        myLinkedList.append(3);
        myLinkedList.append(23);
        myLinkedList.append(7);

        // myLinkedList.getHead();
        // myLinkedList.getTail();
        // myLinkedList.getLength();
        // myLinkedList.prepend(5);
        // System.out.println(myLinkedList.get(2).value + "\n");
        // myLinkedList.set(1, 4);
        // myLinkedList.insert(1, 1);
        myLinkedList.remove(2);
        myLinkedList.printList();

        // System.out.println(myLinkedList.removeFirst().value); // for 2 items and
        // returns Node so use .value
        // System.out.println(myLinkedList.removeFirst().value);// for 1 item
        // System.out.println(myLinkedList.removeFirst()); // for 0 item and returns
        // null so null.value not correct

    }
}
