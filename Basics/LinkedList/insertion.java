package Basics.LinkedList;

class Node1 {
    int data;
    Node1 next;

    Node1(int data) {
        this.data = data;
    }
}

class insertion {
    public static void main(String args[]) {
        Node1 n1 = new Node1(10);
        Node1 n2 = new Node1(20);
        Node1 n3 = new Node1(30);

        Node1 head = n1;
        head.next = n2;
        n2.next = n3;
        n3.next = null;

        Insert(40, head, 3);
        Traverse(head);
    }

    static void Insert(int data, Node1 head, int pos) {
        Node1 toAdd = new Node1(data);
        if (pos == 0) {
            toAdd.next = head;
            head = toAdd;
            return;
        }
        Node1 prev = head;
        for (int i = 0; i < pos - 1; i++) {
            prev = prev.next;
        }

        toAdd.next = prev.next;
        prev.next = toAdd;
    }

    static void Traverse(Node1 head) {
        Node1 cur = head;
        while (cur != null) {
            System.out.println(cur.data);
            cur = cur.next;
        }
    }
}
