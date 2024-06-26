
package LinkedList;

class Node {

    int data;
    Node next;

    Node(int data) {
        this.data = data;
    }

}

class Main {
    public static void main(String args[]) {
        Node n1 = new Node(10);
        Node n2 = new Node(20);
        Node n3 = new Node(30);

        Node head = n1;
        head.next = n2;
        n2.next = n3;
        n3.next = null;

        Traverse(head);
    }

    static void Traverse(Node head) {
        Node cur = head;
        while (cur != null) {
            System.out.println(cur.data);
            cur = cur.next;
        }
    }
}
