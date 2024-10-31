public class sorting {
    private int [] arr;
    
    public sorting(int[] arr){
        this.arr = new int[9];
        arr[0] = 5;
        arr[1] = 2;
        arr[2] = 4;
        arr[3] = 6;
        arr[4] = 3;
        arr[5] = 9;
        arr[6] = 1;

        for (int i : arr) {
            System.out.println(i);
        }
    }

    // int [] arr = new int[9];
    // public void swap (int one, int two){
    //     int temp = arr[one];
    //     arr[one] = arr[two];
    //     arr[two] = temp; 
    // }

    // public void bubbleSort (){
    //     int limit, i;
    //     for ( limit = arr.length -1; limit > 0; limit--) {
    //         for ( i = 0; i < limit; i++) {
    //             if (arr[i] > arr[i+1]) swap(i, i+1);
    //             System.out.print(i);
    //         }
    //     }
    // }
}
