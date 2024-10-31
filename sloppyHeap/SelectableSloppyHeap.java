package sloppyHeap;

public class SelectableSloppyHeap {
    private int [] heap;
    private int size;
    private int maxSize;

    public SelectableSloppyHeap(int maxSize){
        this.maxSize = maxSize;
        this.heap = new int[maxSize];
        this.size = 0;
    }

    public void insert(int value){
        if (size >= maxSize) throw new IllegalStateException("Heap is full");
        heap[size] = value;
        siftUp(size);
        size++;
    }

    private void siftUp(int index) {
        int parIn = (index - 1) / 2;
        while (index > 0 && heap[index] < heap[parIn]) {
            swap(index, parIn);
            index = parIn;
            parIn = (index - 1) / 2;
        }
    }

    public boolean remove(int value){
        if (size == 0) throw new IllegalStateException("Heap is Empty");
        int index = select(value);
        if (index == -1) return false;
        heap[index] = heap[size - 1];
        size--;
        siftDown(index);
        siftUp(index);
        return true;
    }

    private void siftDown(int i) {
        int left, right, smallest;
        while ((left = 2 * i + 1) < size) {
            right = left + 1;
            smallest = left;

            if (right < size && heap[right] < heap[left]) {
                smallest = right;
            }

            if (heap[i] <= heap[smallest]) break;
            swap(i, smallest);
            i = smallest;
        }
    }

    public int select(int value){
        for (int i = 0; i < size; i++) {
            if (heap[i] == value) {
                return i;
            }
        }
        return -1;
    }

    public void swap(int one, int two){
        int temp = heap[one];
        heap[one] = heap[two];
        heap[two] = temp;
    }

    public void display(){
        System.out.print("Heap: ");
        for (int i = 0; i < size; i++) {
            System.out.print(heap[i] + " ");
        }
        System.out.println();
    }

    public int[] heapSort(){
        int[] sortedArray = new int[size];
        int originalSize = size;

        for (int i = 0; i < originalSize; i++) {
            int minValue = heap[0];
            sortedArray[i] = minValue;
            remove(minValue);
        }

        for (int value : sortedArray) {
            insert(value);
        }
        return sortedArray;
    }
}
