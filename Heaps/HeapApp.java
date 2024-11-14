package Heaps;

public class HeapApp {
    public static void main(String[] args) {
        Heap heap = new Heap(35);

        heap.insert(30);
        heap.insert(50);
        heap.insert(20);
        heap.insert(40);
        heap.insert(70);
        heap.insert(60);
        heap.insert(10);
        heap.insert(90);
        heap.insert(80);
        heap.insert(100);
        heap.insert(75);
        heap.insert(85);

        heap.displayHeap();
        System.out.println("\nChange elemen:");
        heap.change(4, 110);

        heap.displayHeap();
    }
}
