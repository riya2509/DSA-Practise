package Basics.LinkedList;

class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
    }

}

public class deletion {
    public static void main(String args[]) {
        Node n1 = new Node(10);
        Node n2 = new Node(20);
        Node n3 = new Node(30);

        Node head = n1;
        head.next = n2;
        n2.next = n3;
        n3.next = null;

        Delete(head, 1);
        Traverse(head);
    }

    static void Delete(Node head, int pos) {
        if (pos == 0) {
            head = head.next;
            return;
        }

        Node prev = head;
        for (int i = 0; i < pos - 1; i++) {
            prev = prev.next;
        }
        prev.next = prev.next.next;
    }

    static void Traverse(Node head) {
        Node cur = head;
        while (cur != null) {
            System.out.println(cur.data);
            cur = cur.next;
        }

    }

}
