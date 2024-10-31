package laprak.queue;

public class Link {
    queue Data;
    Link next;

    public Link(queue Data){
        this.Data = Data;
        this.next = null;
    }

    public void displayLink(){
        System.out.println(Data + " ");
    }
}
