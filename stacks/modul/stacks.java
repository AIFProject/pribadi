package stacks.modul;

public class stacks {
    private int maxSize;
    private long[] stacksArray;
    private int top;

    public stacks(int size) {
        maxSize = size;
        stacksArray = new long[maxSize];
        top = -1;
    }

    public void push(long item) {
        stacksArray[++top] = item;
    }

    public long pop() {
        return stacksArray[top--];
    }

    public long peek() {
        return stacksArray[top];
    }

    public boolean IsEmpty() {
        return (top == -1);
    }

    public boolean IsFull() {
        return (top == maxSize - 1);
    }


}
