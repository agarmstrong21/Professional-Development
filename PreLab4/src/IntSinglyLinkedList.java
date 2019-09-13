public class IntSinglyLinkedList {
    private static class Node {
        private Integer element;
        private Node next;

        public Node(Integer e, Node n) {
            element = e;
            next = n;
        }

        public Integer getElement() {
            return element;
        }

        public Node getNext() {
            return next;
        }

        public void setNext(Node n) {
            next = n;
        }
    }

    private Node head = null;
    private Node tail = null;
    private int size = 0;

    public IntSinglyLinkedList() {
    }

    public void addFirst(Integer e) {
// a
        Node n = new Node(e, head); // b
        head = n; // c
        if (size == 0)
            tail = head;
        size++; // d
    }

    public static void main(String args[]){
        Node a = new Node(0, new Node(5, null));
        Node b = a;
        Node c = null;
    }
}







