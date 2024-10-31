    public class insertArray {
    private int[] array;
    private int size;

    public insertArray(int Elemen) {
        array = new int[Elemen];
        size = 0;
    }

    public void insert(int value) {
        int i = 0;
        while (i < size && array[i] < value) {
            i++;
        }
        for (int j = size; j > i; j--) {
            array[j] = array[j - 1];
        }
        array[i] = value;
        size++;
    }

    public void display() {
        for (int i = 0; i < size; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }

    public boolean find(int value) {
        int i;
        for (i = 0; i < size; i++) {
            if (array[i] == value) {
                break;
            }
        }
        if (i == size) {
            System.out.println("elemen tidak ditemukan");
            return false;
        } else {
            System.out.println("elemen " + value + " ditemukan");
            return true;
        }
    }

    public static void main(String[] args) {
        insertArray insert = new insertArray(100);
        insert.insert(5);
        insert.insert(3);
        insert.insert(4);
        insert.insert(7);
        insert.insert(2);

        insert.display();
        insert.find(5);
    }
}
