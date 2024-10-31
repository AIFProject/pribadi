public class Link{
    public int data;
    public Link next;

    public Link(int data){
        this.data = data;
    }

    public void displayLink(){
        System.out.print(data + " ");
    }
}