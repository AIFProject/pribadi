package Graph.praktikum;

// Main class untuk menjalankan program
public class GraphApp {
    public static void main(String[] args) {
        // Buat graph dengan 5 vertex
        GraphAdjacencyList graph = new GraphAdjacencyList(5);

        // Tambahkan edge
        graph.addEdge(0, 1); // A -> B
        graph.addEdge(0, 4); // A -> E
        graph.addEdge(1, 2); // B -> C
        graph.addEdge(1, 3); // B -> D
        graph.addEdge(1, 4); // B -> E
        graph.addEdge(2, 3); // C -> D
        graph.addEdge(3, 4); // D -> E

        // Cetak adjacency list
        System.out.println("Graph representation using adjacency linked list:");
        graph.printGraph();
    }
}
