package laprak.queue;

public class LinkedList {
    Link first, rear;

    public LinkedList() {
        this.first = null;
        this.rear = null;
    }

    public void push(int nim, String nama) {
        queue newQueue = new queue(nim, nama);
        Link newLink = new Link(newQueue);

        if (rear == null) {
            first = newLink;
            rear = newLink;
        }

        rear.next = newLink;
        rear = newLink;
    }

    public void pop() {
        first = first.next;
        if (first == null) {
            rear = null;
        }
    }

    public void display() {
        Link temp = first;
        System.out.println("Queue (front-->rear)");
        while (temp != null) {
            System.out.println("{" + temp.Data.nim + ", " + temp.Data.nama + "}");
            temp = temp.next;
        }
    }
}
