package advancedSort.quickSort;

public class QuickSortApp {
    public static void main(String[] args) {
        quicksort arr = new quicksort(8);
        arr.insert(70);
        arr.insert(80);
        arr.insert(75);
        arr.insert(55);
        arr.insert(85);
        arr.insert(25);
        arr.insert(30);
        arr.insert(90);
        arr.display();

        arr.qiuckSort();
    }
}
