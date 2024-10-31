public class binarySearch {
    private int[] arr;
    private int nElemen;

    public binarySearch(int size) {
        arr = new int[size];
        nElemen = 0;
    }

    public void insert(int value) {
        int i = 0;
        if (nElemen >= arr.length) {
            System.out.println("array is full cannot insert new element.");
            return;
        }

        while (i < nElemen && arr[i] < value) {
            i++;
        }

        for (int j = nElemen; j > i; j--) {
            arr[j] = arr[j - 1];
        }

        arr[i] = value;
        nElemen++;
    }

    public boolean find(int value) {
        int left = 0;
        int right = nElemen - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (arr[mid] == value) {
                return true;
            } else if (arr[mid] < value) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return false;
    }

    public void display(){
        for (int i = 0; i < nElemen; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        binarySearch binarySearch = new binarySearch(10);

        binarySearch.insert(1);
        binarySearch.insert(2);
        binarySearch.insert(3);
        binarySearch.insert(4);
        binarySearch.insert(5);
        binarySearch.insert(6);

        binarySearch.display();
    }
}
