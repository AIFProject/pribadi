package laprak.queue;

public class LinkListApp {
    public static void main(String[] args) {
        LinkedList theList = new LinkedList();

        theList.push(1665100, "Dea");
        theList.push(1665200, "Deaja");
        theList.display();
        
        theList.push(1665300, "Ami");
        theList.push(1665400, "Haya");
        theList.push(1665500, "Yati");
        theList.display();

        theList.pop();
        theList.pop();
        theList.display();
    }
}
