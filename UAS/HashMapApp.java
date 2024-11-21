package UAS;

import java.util.Scanner;

public class HashMapApp {
    public static void main(String[] args) {
        Hashmap kamus = new Hashmap();

        kamus.put("adus", "mandi");
        kamus.put("wedhi", "pasir");
        kamus.put("kula", "saya");
        kamus.put("ndalem", "rumah");
        kamus.put("cah", "anak");
        kamus.put("mbiyen", "dulu");
        kamus.put("anggo", "pakai");
        kamus.put("esuk", "pagi");
        kamus.put("gawe", "buat");
        kamus.put("tangi", "bangun");
        kamus.put("ngombe", "minum");
        kamus.put("sawon", "ikan");
        kamus.put("kembang", "bunga");
        kamus.put("dhuwur", "tinggi");
        kamus.put("krupuk", "kerupuk");
        kamus.put("jajan", "makanan ringan");
        kamus.put("longkrong", "duduk santai");
        kamus.put("lumpat", "lari");
        kamus.put("turun", "jatuh");
        kamus.put("pangan", "makanan");
        kamus.put("seneng", "senang");
        kamus.put("sedih", "sedih");
        kamus.put("rabi", "istri");
        kamus.put("bojo", "suami");
        kamus.put("keplek", "terjatuh");
        kamus.put("mlaku", "berjalan");
        kamus.put("belanja", "membeli");
        kamus.put("mikir", "berpikir");
        kamus.put("tirakat", "berusaha");
        kamus.put("dolan", "bermain");
        kamus.put("mbangun", "membangun");
        kamus.put("nduk", "mengambil");
        kamus.put("nyekel", "memegang");
        kamus.put("tutup", "penutupan");
        kamus.put("senyum", "tersenyum");
        kamus.put("sesek", "penat");
        kamus.put("golek", "mencari");
        kamus.put("gugur", "jatuh");
        kamus.put("sampun", "sudah");
        kamus.put("ngajeng", "menghadiri");
        kamus.put("sakit", "sakit");
        kamus.put("kenceng", "cepat");
        kamus.put("cetek", "dangkal");
        kamus.put("nyandhet", "terhenti");
        kamus.put("bagus", "baik");
        kamus.put("cemlorot", "berkilau");
        kamus.put("manis", "manis");
        kamus.put("garing", "kering");
        kamus.put("urip", "hidup");
        kamus.put("mateni", "membunuh");
        kamus.put("nguncal", "melempar");

        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("\n=== Kamus Jawa-Indonesia ===");
            System.out.println("1. Cari arti kata.");
            System.out.println("2. Tambah kata.");
            System.out.println("3. Hapus kata.");
            System.out.println("4. Keluar.");
            int pilihan = sc.nextInt();
            sc.nextLine();
            switch (pilihan) {
                case 1:
                    System.out.print("Masukkan kata: ");
                    String find = sc.nextLine();
                    String arti = kamus.get(find);
                    if (arti == null) {
                        System.out.println("Kata tidak ditemukan.");
                    } else {
                        System.out.println("Arti: " + arti);
                    }
                    break;
                case 2:
                    System.out.print("Masukkan kata jawa: ");
                    String key = sc.nextLine();
                    System.out.print("Masukkan arti dalam bahasa indonesia: ");
                    String value = sc.nextLine();
                    kamus.put(key, value);
                    System.out.println("Kata berhasil ditambahkan.");
                    break;
                case 3:
                    System.out.print("Masukkan kata yang ingin dihapus: ");
                    String delete = sc.nextLine();
                    kamus.remove(delete);
                    System.out.println("Kata berhasil dihapus.");
                    break;
                case 4:
                    System.out.println("Terima kasih telah menggunakan kamus");
                    sc.close();
                    return;
                default:
                    System.out.println("pilihan tidak valid");
            }
        }
    }
}
