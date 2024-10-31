package middleTest.praMiddle;

public class Mahasiswa {
    long nim;
    double score;
    Mahasiswa prev;
    Mahasiswa next;

    public Mahasiswa(long nim, double score){
        this.nim = nim;
        this.score = score;
        this.prev = null;
        this.next = null;
    }
}
