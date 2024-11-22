package Graph.praktikum;
// Class LinkedList untuk adjacency list
public class LinkedList {
    private Node head; // Kepala dari LinkedList

    // Constructor
    public LinkedList() {
        this.head = null;
    }

    // Tambahkan data ke LinkedList
    public void add(int data) {
        Node newNode = new Node(data);

        if (head == null) {
            head = newNode;
        } else {
            Node temp = head;
            while (temp.next != null) {
                temp = temp.next;
            }
            temp.next = newNode;
        }
    }

    // Cetak isi LinkedList
    public void printList() {
        Node temp = head;
        while (temp != null) {
            System.out.print(" -> " + temp.data);
            temp = temp.next;
        }
    }
}
