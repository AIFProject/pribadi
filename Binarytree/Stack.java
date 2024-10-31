package Binarytree;

public class Stack {
    private Node[] stackArray;
    private int top;

    public Stack(int size) {
        stackArray = new Node[size];
        top = -1;
    }

    public Stack(){
        this(100);
    }

    public void push(Node node) {
        stackArray[++top] = node;
    }

    public Node pop() {
        return stackArray[top--];
    }

    public Node peek() {
        return stackArray[top];
    }

    public boolean isEmpty() {
        return (top == -1);
    }
}
