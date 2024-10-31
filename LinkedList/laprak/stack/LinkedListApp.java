package laprak.stack;

public class LinkedListApp {
    public static void main(String[] args) {
        LinkedList theList = new LinkedList();
        theList.insert(1, "LCD");
        theList.insert(2, "TV");
        theList.displayList();

        theList.insert(3, "Kulkas");
        theList.insert(4, "PC");
        theList.insert(5, "Rice Cooker");
        theList.insert(6, "Dispenser");
        theList.displayList();

        theList.delete();
        theList.delete();
        theList.displayList();
    }
}
