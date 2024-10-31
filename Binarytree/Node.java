package Binarytree;

public class Node {
    public int id;
    public String data;
    public Node left;
    public Node right;

    public void displayNode(){
        System.out.println(" { " + id + ", " + data + " } ");
    }
}
