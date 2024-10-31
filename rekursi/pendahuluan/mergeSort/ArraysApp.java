package rekursi.pendahuluan.mergeSort;

public class ArraysApp {
    public static void main(String[] args) {
        Arrays arr = new Arrays(10);

        arr.insert(29);
        arr.insert(10);
        arr.insert(76);
        arr.insert(45);
        arr.insert(67);
        arr.insert(12);
        arr.insert(34);
        arr.insert(56);
        arr.insert(9);
        arr.insert(50);

        System.out.println("Data sebelum diurutkan:");
        arr.display();

        arr.mergeSort();

        System.out.println("Data setelah diurutkan:");
        arr.display();
    }
}
