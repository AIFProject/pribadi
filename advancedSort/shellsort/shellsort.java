package advancedSort.shellsort;

public class shellsort {
    private int [] arr;
    private int nElemen;

    public shellsort (int max){
        arr = new int[max];
        nElemen = 0;
    }

    public void insert(int value) {
        arr[nElemen] = value;
        nElemen++;
    }

    public void display(){
        for (int i = 0; i < nElemen; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public void ShellSort(){
        int in, out;
        int temp;
        int h = nElemen / 2;

        while (h <= nElemen / 3) {
            h = 3 * h + 1;
        }

        while (h > 0) {
            for (out = h; out < nElemen; out++) {
                temp = arr[out];
                in = out;
                while (in > h - 1 && arr[in - h] >= temp ) {
                    arr[in] = arr[in - h];
                    in -= h;
                }
                arr[in] = temp;
            }
            h = (h-1) / 3;
        }
    }
}
