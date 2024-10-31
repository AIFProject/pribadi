package advancedSort.shellsort;

public class shellsortApp {
    public static void main(String[] args) {
        shellsort shell = new shellsort(10);
        shell.insert(20);
        shell.insert(10);
        shell.insert(90);
        shell.insert(40);
        shell.insert(60);
        shell.insert(80);
        shell.insert(50);
        shell.insert(30);
        shell.insert(70);
        shell.insert(00);
        System.out.println("before sorting ");
        shell.display();

        shell.ShellSort();
        System.out.println("after sorting");
        shell.display();
    }
}
