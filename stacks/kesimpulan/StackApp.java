package stacks.kesimpulan;
import java.util.*;
public class StackApp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input;

        while (true) {
            System.out.print("Masukkan kata (atau 'keluar' untuk berhenti): ");
            input = sc.nextLine();

            if (input.equalsIgnoreCase("keluar")) {
                System.out.println("program selesai");
                break;
            }

            reverser rev = new reverser(input);
            String out = rev.reverse();
            System.out.println("Kata setelah dibalik: " + out);
        }
        sc.close();
    }
}
