package Graph;

public class Stack {
    private int maxSize;
    private int[] stacksArray;
    private int top;

    public Stack(int size) {
        maxSize = size;
        stacksArray = new int[maxSize];
        top = -1;
    }

    public void push(int item) {
        stacksArray[++top] = item;
    }

    public long pop() {
        return stacksArray[top--];
    }

    public int peek() {
        return stacksArray[top];
    }

    public boolean IsEmpty() {
        return (top == -1);
    }

    public boolean IsFull() {
        return (top == maxSize - 1);
    }
}
