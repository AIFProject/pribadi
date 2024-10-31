package advancedSort.quickSort;

public class quicksort {
    private int[] arr;
    private int nElemen;

    public quicksort(int nElemen) {
        arr = new int[nElemen];
        nElemen = 0;
    }

    public void insert(int value) {
        arr[nElemen] = value;
        nElemen++;
    }

    public void qiuckSort() {
        recQuickSort(0, nElemen - 1);
    }

    private void recQuickSort(int left, int right) {
        if (right - left <= 0) {
            return;
        } else {
            int pivot = arr[right];
            int partisi = partitionIt(left, right, pivot);
            recQuickSort(left, partisi - 1);
            recQuickSort(partisi + 1, right);
        }
    }

    private int partitionIt(int left, int right, int pivot) {
        int Ileft = left - 1;
        int Iright = right;
        while (true) {
            while (Ileft < right && arr[++Ileft] < pivot)
                ;
            while (Iright > left && arr[--Iright] > pivot)
                ;
            if (Ileft >= Iright) {
                break;
            } else {
                Swap(Ileft, Iright);
            }
        }
        Swap(Ileft, right);
        display();
        return Ileft;
    }

    public void Swap(int one, int two) {
        int temp = arr[one];
        arr[one] = arr[two];
        arr[two] = temp;
    }

    public void display() {
        for (int i = 0; i < nElemen; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println(" ");
    }
}
