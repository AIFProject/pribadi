package UAS;

public class Hashmap {
    private LinkedList[] buckets;
    private int capacity;
    private int size;

    public Hashmap() {
        capacity = 16;
        buckets = new LinkedList[capacity];
        size = 0;
    }

    public int hash(String key) {
        return (key.hashCode() & 0x7FFFFFFF) % capacity;
    }

    public void put(String key, String value) {
        int index = hash(key);
        if (buckets[index] == null) {
            buckets[index] = new LinkedList();
        }
        Node exitingNode = buckets[index].find(key);
        if (exitingNode != null) {
            exitingNode.value = value;
        } else {
            buckets[index].add(new Node(key, value));
            size++;
        }
    }

    public String get(String key){
        int index = hash(key);
        LinkedList bucket = buckets[index];
        if (bucket != null) {
            Node node = bucket.find(key);
            if (node != null) {
                return node.value;
            }
        }
        return null;
    }

    public void remove(String key){
        int index = hash(key);
        LinkedList bucket = buckets[index];
        if (bucket != null) {
            bucket.remove(key);
        }
    }
}
