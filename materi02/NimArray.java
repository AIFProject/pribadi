package materi02;

public class NimArray {
    public static void main(String[] args) {
        long nim = 230605110133L;
        int length = 0;
        long temp = nim;

        while (temp > 0) {
            length++;
            temp /= 10;
        }

        int [] nimArray = new int[length];

        temp = nim;
        for (int i = length - 1; i >= 0; i--) {
            nimArray[i] = (int)(temp%10);
            temp /= 10;
        }

        System.out.println("Array dari nim: ");
        for (int  digit : nimArray) {
            System.out.print(digit + " ");
        }
    }
}

