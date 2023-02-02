class LinkedList {

    Node head;

    static class Node {
        int data;
        Node next;

        Node(int d) {
            this.data = d;
            next = null;

        }
    }

    public static void main(String args[]) {
        LinkedList list = new LinkedList();
        list.head = new Node(1)
        Node Second = new Node(2);
        Node Third = new Node(3);
        Node four = new Node(4);
    }

}