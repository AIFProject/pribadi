package UAS;

public class LinkedList {
    private Node head;

    public void add(Node node) {
        if (head == null) {
            head = node;
        } else {
            Node curNode = head;
            while (curNode.next != null) {
                curNode = curNode.next;
            }
            curNode.next = node;
        }
    }

    public Node find(String key) {
        Node curNode = head;
        while (curNode != null) {
            if (curNode.key.equals(key)) {
                return curNode;
            }
            curNode = curNode.next;
        }
        return null;
    }

    public void remove(String key) {
        if (head.key.equals(key)) {
            head = head.next;
        } else {
            Node curNode = head;
            while (curNode.next != null) {
                if (curNode.next.key.equals(key)) {
                    curNode.next = curNode.next.next;
                    break;
                }
                curNode = curNode.next;
            }
        }
    }
}
