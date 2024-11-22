package Graph.praktikum;

// Class Graph untuk representasi adjacency list
public class GraphAdjacencyList {
    private int vertices; // Jumlah vertex
    private LinkedList[] adjacencyList; // Array of LinkedLists untuk adjacency list

    // Constructor
    public GraphAdjacencyList(int vertices) {
        this.vertices = vertices;
        adjacencyList = new LinkedList[vertices];

        // Inisialisasi LinkedList untuk setiap vertex
        for (int i = 0; i < vertices; i++) {
            adjacencyList[i] = new LinkedList();
        }
    }

    // Tambahkan edge ke adjacency list
    public void addEdge(int source, int destination) {
        adjacencyList[source].add(destination);

        // Uncomment baris di bawah jika graf undirected
        // adjacencyList[destination].add(source);
    }

    // Cetak adjacency list
    public void printGraph() {
        for (int i = 0; i < vertices; i++) {
            System.out.print("Vertex " + i + ":");
            adjacencyList[i].printList();
            System.out.println();
        }
    }
}
