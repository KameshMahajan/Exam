class LinkedList {

    static Node head;

    static class Node {
        int data;
        Node next;

        Node(int d) {
            this.data = d;
            next = null;

        }
    }

    public void insertion_at_end(int d) {
        Node new_node = new Node(d);
        if (head == null) {
            head = new Node(d);
        }
        new_node.next = null;
        Node last = head;
        while (last.next != null)
            last = last.next;
        last.next = new_node;
        return;
    }

    public static void display() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + "   ");
            temp = temp.next;
        }

    }

    public static void main(String args[]) {
        LinkedList list = new LinkedList();
        head = new Node(1);
        Node Second = new Node(2);
        Node Third = new Node(3);
        Node four = new Node(4);
    }

}