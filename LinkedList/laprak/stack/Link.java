package laprak.stack;

public class Link {
    Stack Data;
    Link next;

    public Link(Stack Data){
        this.Data = Data;
        this.next = null;
    }

    public void displayLink(){
        System.out.println(Data + " ");
    }
}
