package middleTest;

public class DataMahasiswa {
    private long nim;
    private String nama;
    private double nilai;
    private DataMahasiswa [] mhs;
    private int nElemen;

    public DataMahasiswa(long nim, String nama, double nilai){
        this.nim = nim;
        this.nama = nama;
        this.nilai = nilai;
        this.mhs = new DataMahasiswa[nElemen];
    }

    public void display(){
        System.out.println(" \tNama: " + nama);
        System.out.println(" \tNim: " + nim);
        System.out.println(" \tNilai: " + nilai);
    }

    public void insert (long nim, String nama, double nilai){
        mhs[nElemen] = new DataMahasiswa(nim, nama, nilai);
        nElemen++;
    }

    public long getNim(){
        return nim;
    }

    public String getNama(){
        return nama;
    }

    public double getNilai(){
        return nilai;
    }
}
