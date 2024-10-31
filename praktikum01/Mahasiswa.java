package praktikum01;
public class Mahasiswa {
    private long nim;
    private String nama;
    private String asal;

    public Mahasiswa(long nim, String nama, String asal){
        this.nim = nim;
        this.nama = nama;
        this.asal = asal;
    }

    public void display (){
        System.out.print(" \tNIM: " + nim);
        System.out.print(", \tNama: " + nama);
        System.out.println(", \tAsal: " + asal);
    }

    public long getNim(){
        return nim;
    }

    public String getNama(){
        return nama;
    }
}
