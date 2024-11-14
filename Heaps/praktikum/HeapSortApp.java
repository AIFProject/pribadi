package Heaps.praktikum;

// import java.util.Random;

public class HeapSortApp {
    public static void main(String[] args) {
        HeapSort heap = new HeapSort(10);
        heap.insertAt(0, 20);
        heap.insertAt(1, 15);
        heap.insertAt(2, 30);
        heap.insertAt(3, 5);
        
        heap.displayArray();
    }
}
