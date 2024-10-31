package queue;

public class Queue {
    private int maxSize;
    private String [] queArray;
    private int front;
    private int rear;
    private int nItems;

    public Queue(int size){
        this.maxSize = size;
        this.queArray = new String[maxSize];
        front = 0;
        rear = -1;
        nItems = 0;
    }

    public void insert(String item){
        if (nItems < maxSize) {
            if (rear == maxSize - 1) {
                rear = -1;
            }
            queArray[++rear] = item;
            nItems++;
            System.out.println(item + " ditambahkan ke antrian");
        } else {
            System.out.println("Antrian sudah penuh! Tidak dapat menambahkan " + item);
        }
    }

    public String remove(){
        if (isEmpty()) {
            return null;
        }
        String temp = queArray[front++];
        if (front == maxSize) {
            front = 0;
        }
        nItems--;
        return temp;
    }

    public String peekfront(){
        return queArray[front];
    }

    public boolean isEmpty(){
        return (nItems == 0);
    }

    public boolean isFull(){
        return (nItems == maxSize);
    }

    public void display(){
        System.out.println("Isi Antrian: ");
        for (int i = 0; i < nItems; i++) {
            System.out.print(queArray[(front + i) % maxSize] + " ");
        }
        System.out.println();
    }

}
