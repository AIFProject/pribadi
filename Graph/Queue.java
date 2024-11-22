package Graph;

public class Queue {
    private int[] queArray;
    private int front, rear, nItems, size;

    public Queue(int size) {
        this.size = size;
        this.queArray = new int[size];
        this.front = 0;
        this.rear = -1;
        this.nItems = 0;
    }

    public void insert(int item) {
        if (isFull()) {
            System.out.println("Queue is full! Cannot insert elemen.");
            return;
        }
        rear = (rear + 1) % size;
        queArray[rear] = item;
        nItems++;
        System.out.println(item + " inserted to the queue.");
    }

    public int remove() {
        if (isEmpty()) {
            System.out.println("Queue is empty! cannot remove element.");
            return -1;
        }
        int item = queArray[front];
        front = (front + 1) % size;
        nItems--;
        System.out.println(item + " removed from the queue");
        return item;
    }

    public int peek() {
        if (isEmpty()) {
            System.out.println("Queue is empty! cannot peek element.");
            return -1;
        }
        return queArray[front];
    }

    public boolean isEmpty(){
        return nItems ==0;
    }

    public boolean isFull(){
        return nItems == size;
    }

    public int size(){
        return nItems;
    }

    public void displayQueue(){
        if (isEmpty()) {
            System.out.println("Queue is empty!");
            return;
        }
        System.out.print("Queue elements: ");
        for (int i = 0; i < nItems; i++) {
            System.out.println(queArray[(front + i) % size] + " ");
        }
    }
}
