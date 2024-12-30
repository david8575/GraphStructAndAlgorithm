package org.david.Graph.DirectedGraph;

public class DirectedGraphTest {
    public static void main(String[] args) {
        DirectedGraph graph = new DirectedGraph();

        graph.addVertex(1, "A");
        graph.addVertex(2, "B");
        graph.addVertex(3, "C");

        graph.addEdge(1, 2, 5);
        graph.addEdge(2, 3, 3);
        graph.addEdge(1, 3, 10);

        graph.printGraph();
    }
}
