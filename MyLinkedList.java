class MyLinkedList1 {
    static class Node {
        int data;
        Node next; // next is a reference of type node

        public Node(int d) {
            this.data = d;
            this.next = null;
        }
    }

    Node head;
    void add(int d) {
        Node tad = new Node(d);
        if (head == null) {
            head = tad;
            return;
        }
        Node temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = tad;

    }

    void print() {
        Node temp = head;
        while (temp != null) {
            System.out.println(temp.data + " ");
            temp = temp.next;
        }
    }
}

public class MyLinkedList {
    public static void main(String[] args) {
        MyLinkedList1 l = new MyLinkedList1();
        l.add(5);
        l.add(8);
        l.print();

    }
}
