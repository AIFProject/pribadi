package rekursi.pendahuluan.no2;

public class Iterasi {
    public int triangIter(int n){
        int result = 0;
        for (int i = n; i > 0; i--) {
            result += i;
        }
        return result;
    }
    public static void main(String[] args) {
        Iterasi Iterasi = new Iterasi();
        int n = 5;
        System.out.println(Iterasi.triangIter(n));
    }
}
