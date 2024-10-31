package stacks.modul;

public class StackApp {
    public static void main(String[] args) {
        stacks theStacks = new stacks(10);
        System.out.println(">>Push some items");

        theStacks.push(20);
        theStacks.push(40);
        theStacks.push(60);
        theStacks.push(80);

        System.out.println("\n>> pop items in the stacks");

        while (!theStacks.IsEmpty()) {
            long value = theStacks.pop();
            System.out.print(value + " ");
        }
    }
}
