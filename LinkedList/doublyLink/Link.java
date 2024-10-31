package doublyLink;

public class Link {
    public int Data;
    public Link next;
    public Link previous;

    public Link (int Data){
        this.Data = Data;
    }

    public void displayLink(){
        System.out.print(Data + " ");
    }
}
