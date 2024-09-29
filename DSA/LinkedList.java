package DSA;

class Node {
    int data;
    Node next;

    public Node(int value) {
        this.data = value;
        this.next = null;
    }
}

public class LinkedList {
    Node head;

    public LinkedList() {
        this.head = null;
    }

    public void add(int data) {
        Node newNode = new Node(data);

        if (isEmpty()) {
            head = newNode;
        } else {
            Node current = head;
            while (current.next != null) {
                current = current.next;
            }
            current.next = newNode;
        }
    }

    public String toString() {
        Node current = head;
        StringBuilder res = new StringBuilder();
        while (current != null) {
            res.append(current.data);
            if(current.next != null) {
                res.append(" --> ");
            }
            current = current.next;
        }
        return res.toString();
    }

    public boolean isEmpty() {
        if (head == null) { 
            return true;
        }
        return false;
    }
}
