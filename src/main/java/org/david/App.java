package org.david;

import org.david.Graph.DirectedGraph.DirectedGraph;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {
        DirectedGraph graph = new DirectedGraph();

        graph.addVertex(1, "A");
        graph.addVertex(2, "B");
        graph.addVertex(3, "C");
        graph.addVertex(4, "D");
        graph.addVertex(5, "E");
        graph.addVertex(6, "F");
        graph.addVertex(7, "G");
        graph.addVertex(8, "H");


        graph.addEdge(1, 2, 5);
        graph.addEdge(2, 3, 3);
        graph.addEdge(1, 3, 10);
        graph.addEdge(3, 4, 5);
        graph.addEdge(4, 5, 6);
        graph.addEdge(5, 6, 7);
        graph.addEdge(6, 7, 8);
        graph.addEdge(7, 8, 9);
        graph.addEdge(8, 1, 10);
        graph.addEdge(1, 3, 11);
        graph.addEdge(1, 5, 12);
        graph.addEdge(1, 6, 13);
        graph.addEdge(1, 7, 14);
        graph.addEdge(1, 1, 15);

        graph.printGraph();
    }
}
