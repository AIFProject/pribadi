package rekursi.pendahuluan.no2;

public class rekursi {
    public int triangRecur(int n){
        if (n == 1) {
            return 1;
        } else {
            return n * triangRecur(n);
        }
    }
    public static void main(String[] args) {
        rekursi rk = new rekursi();
        int n = 5;
        System.out.println(rk.triangRecur(n));
    }
}
