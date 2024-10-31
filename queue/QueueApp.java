package queue;

import java.util.Scanner;

public class QueueApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Queue theQueue = new Queue(5);
        String input;

        while (true) {
            System.out.print("Masukkan nama untuk ditambahkan ke antrian (atau 'exit' untuk berhenti): ");
            input = scanner.nextLine();

            if (input.equalsIgnoreCase("exit")) {
                break;
            }

            theQueue.insert(input);
            theQueue.display();
        }

        System.out.println("\nMengeluarkan elemen dari antrian:");
        while (!theQueue.isEmpty()) {
            String nama = theQueue.remove();
            System.out.println(nama + " keluar dari antrian");
        }

        scanner.close();
    }
}
