package middleTest.praMiddle;
public class DataMahasiswa {
    private Mahasiswa first;
    private Mahasiswa last;
    private int nElemen;

    public DataMahasiswa(){
        this.first = null;
        this.last = null;
        this.nElemen = 0;
    }

    public void insert(long nim, double score){
        Mahasiswa mhs = new Mahasiswa(nim, score);
        if (first == null) {
            first = mhs;
            last = mhs;
        } else {
            Mahasiswa current = first;
            while (current != null && current.score > score) {
                current = current.next;
            }
            if (current == first) {
                mhs.next = first;
                first.prev = mhs;
                first = mhs;
            } else if (current == null) {
                last.next = mhs;
                mhs.prev = last;
                last = mhs;
            } else {
                mhs.prev = current.prev;
                mhs.next = current;
                current.prev.next = mhs;
                current.prev = mhs;
            }
        }
        nElemen++;
    }

    public double getAverage() {
        double total = 0;
        Mahasiswa current = first;
        while (current != null) {
            total += current.score;
            current = current.next;
        }
        return total / nElemen;
    }

    public double getMedian() {
        if (nElemen == 0) return 0;

        Mahasiswa left = first;
        Mahasiswa right = last;
        int midI = nElemen / 2;

        for (int i = 0; i < midI; i++) {
            left = left.next;
        }

        if (nElemen % 2 == 0) { 
            return (left.score + right.score) / 2;
        } else { 
            return left.score;
        }
    }

    public void countPassingStudents(double passingScore) {
        int passCount = 0;
        int failCount = 0;
        Mahasiswa current = first;

        while (current != null) {
            if (current.score >= passingScore) {
                passCount++;
            } else {
                failCount++;
            }
            current = current.next;
        }

        System.out.println("Alhamdulillah " + passCount + " Mahasiswa lulus");
        System.out.println(failCount + " Mahasiswa Perlu belajar lagi");
    }

    public void display() {
        Mahasiswa current = first;
        System.out.println("Daftar Nilai Mahasiswa:");
        while (current != null) {
            System.out.println(current.nim + ", " + current.score);
            current = current.next;
        }
    }

    public int getSize() {
        return nElemen;
    }
}
