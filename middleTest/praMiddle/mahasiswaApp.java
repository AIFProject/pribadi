package middleTest.praMiddle;

public class mahasiswaApp {
    public static void main(String[] args) {
        DataMahasiswa mhs = new DataMahasiswa();

        mhs.insert(1765027, 100.0);
        mhs.insert(1765009, 95.6);
        mhs.insert(1765019, 95.0);
        mhs.insert(1765013, 85.5);
        mhs.insert(1765025, 80.0);
        mhs.insert(1765035, 75.0);
        mhs.insert(1765010, 70.3);
        mhs.insert(1765023, 60.5);
        mhs.insert(1765029, 55.5);
        mhs.insert(1765011, 52.7);

        mhs.display();

        double average = mhs.getAverage();
        System.out.println("\nrata: " + average);

        double median = mhs.getMedian();
        System.out.println("\nmedian: " + median);

        mhs.countPassingStudents(60.0);
    }
}
