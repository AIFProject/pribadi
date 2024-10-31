package middleTest;

public class BubbleSort {
    DataMahasiswa[] mhs;
    private int nElemen;

    public BubbleSort(int max){
        mhs = new DataMahasiswa[max];
        nElemen = 0;
    }

    public void BubbleSortNim(){
        int batas, i;
        for (batas = nElemen - 1; batas > 0; batas--) {
            for (i = 0; i < batas; i++) {
                if (mhs[i].getNim() < mhs[i + 1].getNim()) {
                    swap(i, i +1);
                }
            }
        }
    }

    public void BubbleSortNilai(){
        int batas, i;
        for (batas = nElemen - 1; batas > 0; batas--){
            for (i = 0; i < batas; i++) {
                if (mhs[i].getNilai() < mhs[i + 1].getNilai()){
                    swap(i, i + 1);
                }
            }
        }
    }

    private void swap(int one, int two) {
        DataMahasiswa temp = mhs[one];
        mhs[one] = mhs[two];
        mhs[two] = temp;
    }
}
