package LinkedListLatest;

public class Main {
    public static void main(String args[]) {
        LinkedList myLinkedList = new LinkedList(11);
        myLinkedList.append(3);
        myLinkedList.append(23);
        myLinkedList.append(7);
        int k = 2;
        int result = myLinkedList.findKthFromEnd(k).value;
        System.out.println(result);

        // myLinkedList.getHead();
        // myLinkedList.getTail();
        // myLinkedList.getLength();
        // myLinkedList.prepend(5);
        // System.out.println(myLinkedList.get(2).value + "\n");
        // myLinkedList.set(1, 4);
        // myLinkedList.insert(1, 1);
        // myLinkedList.remove(2);
        // myLinkedList.reverse();
        // System.out.println(myLinkedList.findMiddleNode().value);
        // myLinkedList.printList();

        // myLinkedList.getTail().next = myLinkedList.getHead().next;
        // System.out.println("Has Loop:");
        // System.out.println(myLinkedList.hasLoop());

        // System.out.println(myLinkedList.removeFirst().value); // for 2 items and
        // returns Node so use .value
        // System.out.println(myLinkedList.removeFirst().value);// for 1 item
        // System.out.println(myLinkedList.removeFirst()); // for 0 item and returns
        // null so null.value not correct

        // LinkedList list1 = new LinkedList(1);
        // list1.append(3);
        // list1.append(4);
        // list1.append(7);

        // LinkedList list2 = new LinkedList(1);
        // list2.append(2);
        // list2.append(5);
        // list2.append(10);
        // System.out.println("List 1:");
        // list1.printList();
        // System.out.println("List 2:");
        // list2.printList();

        // LinkedList.Node mergedHead = list1.mergeTwoLists(list1.getHead(),
        // list2.getHead());// Merge two lists
        // // Print the merged list
        // System.out.println("Merged List:");
        // LinkedList.printList(mergedHead);

    }
}
