package sloppyHeap;
import java.util.*;
public class SelectableSloppyHeapApp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        SelectableSloppyHeap heap = new SelectableSloppyHeap(10);

        heap.insert(10);
        heap.insert(5);
        heap.insert(30);
        heap.insert(20);
        heap.insert(15);
        heap.display();
        System.out.println();

        System.out.print("Insert the element: ");
        int element = sc.nextInt();
        int elementI = heap.select(element);
        if (elementI != -1) {
            System.out.println("Element " + element + " found at index: " + elementI);
        } else{
            System.out.println("Element " + element + " not found in the heap.");
        }
        System.out.println();
        

        System.out.print("Insert the elements to be deleted :");
        element = sc.nextInt();
        heap.remove(element);
        System.out.println("------heap after deleted------");
        heap.display();
        System.out.println();

        heap.heapSort();
        System.out.println("------heap after sorting------");
        heap.display();
        sc.close();
    }
}
