package stacks.kesimpulan;

public class stack {
    private int maxsize;
    private char[] stackArr;
    private int top;

    public stack (int size){
        maxsize = size;
        stackArr = new char[maxsize];
        top = -1;
    }

    public void push(char item){
        stackArr[++top] = item;
    }

    public char pop(){
        return stackArr[top--];
    }

    public char peek(){
        return stackArr[top];
    }

    public boolean isEmpty(){
        return (top == -1);
    }

    public boolean isFull(){
        return (top == maxsize - 1);
    }
}
