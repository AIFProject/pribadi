package Heaps.praktikum;

public class HeapSort {
    private Node[] heapArray;
    private int maxSize;
    private int currentSize;

    public HeapSort(int size) {
        maxSize = size;
        currentSize = 0;
        heapArray = new Node[maxSize];
    }

    public void insertAt(int index, int value){
        if (index < 0  || index >= maxSize) {
            System.out.println("Index out of bounds: " + index);
            return;
        }
        heapArray[index] = new Node(value);
        currentSize++;
        System.out.println("Inserted Value " + value + " at Index" + index);
    }

    public void trickleDown(int index){
        int largerChild;
        Node top = heapArray[index];
        while (index < currentSize / 2) {
            int leftChild = 2 * index + 1;
            int rightChild = 2 * index + 2;

            if (rightChild < currentSize && heapArray[leftChild].value < heapArray[rightChild].value) {
                largerChild = rightChild;
            } else {
                largerChild = leftChild;
            }

            if (top.value >= heapArray[largerChild].value) {
                break;
            }

            heapArray[index] = heapArray[largerChild];
            index = largerChild;
        }
        heapArray[index] = top;
    }

    public void displayArray(){
        for (int i = 0; i < currentSize; i++) {
            System.out.print(heapArray[i].value + " ");
        }
        System.out.println();
    }

    public void heapSort(){
        for (int j = (currentSize / 2) - 1; j >= 0; j--) {
            trickleDown(j);
        }

        for (int k = currentSize - 1; k >= 0; k--) {
            Node temp = heapArray[0];
            heapArray[0] = heapArray[1];
            heapArray[1] = temp;
            currentSize--;
            trickleDown(0);
        }
    }
}

