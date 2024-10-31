package rekursi.praktikum;
import java.util.*;
public class recursion {
    public static int Power(int base, int exponent){
        if (exponent == 0) {
            return 1;
        } else if (exponent % 2 == 0) {
            int half = Power(base, exponent / 2);
            return half * half;
        } else {
            return base * Power(base, exponent - 1);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan angka base: ");
        int base = sc.nextInt();
        System.out.print("Masukkana angka exponen: ");
        int exponent = sc.nextInt();

        int hasil = Power(base, exponent);
        System.out.println(base + "^" + exponent + " = " + hasil);
        sc.close();
    }
}
