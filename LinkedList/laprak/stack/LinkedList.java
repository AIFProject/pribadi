package laprak.stack;

public class LinkedList {
    Link first;

    public LinkedList(){
        first = null;
    }

    public boolean isEmpty(){
        return (first == null);
    }

    public void insert(int id, String nama){
        Stack newStack = new Stack(id, nama);
        Link newLink = new Link(newStack);

        if (first == null) {
            first = newLink;
        } else {
            newLink.next = first;
            first = newLink;
        }
    }

    public void delete(){
        if (first != null) {
            first = first.next;
        }
    }

    public void displayList(){
        Link temp = first;
        System.out.println("Stack (top-->bottom)");
        while (temp != null) {
            System.out.println("{" + temp.Data.id + ", " + temp.Data.nama + "}");
            temp = temp.next;
        }
    }
}
