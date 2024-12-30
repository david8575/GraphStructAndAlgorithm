package org.david.Graph.UndirectedGraph;

import org.david.Graph.UndirectedGraph.UndirectedVertex;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class UndirectedGraph {
    private Map<Integer, UndirectedVertex> vertices;
    private List<UndirectedEdge> edges;

    public UndirectedGraph() {
        vertices = new HashMap<Integer, UndirectedVertex>();
        edges = new ArrayList<UndirectedEdge>();
    }

    public void addVertex(int id, String name) {
        vertices.put(id, new UndirectedVertex(id, name));
    }

    public void addEdge(int scrId, int dstId, int weight) {
        UndirectedVertex v1 = vertices.get(scrId);
        UndirectedVertex v2 = vertices.get(dstId);

        edges.add(new UndirectedEdge(v1, v2, weight));
        edges.add(new UndirectedEdge(v2, v1, weight));
    }

    public void printGraph(){
        System.out.println("Vertices: ");
        for (UndirectedVertex vertex : vertices.values()) {
            System.out.println(vertex);
        }

        System.out.println("\nEdges: ");
        for (UndirectedEdge edge : edges) {
            System.out.println(edge);
        }

        System.out.println("\nGraph Representation:");

        for (UndirectedEdge edge : edges) {
            System.out.println(edge.getScr().getName()
                    + " --"
                    + edge.getWeight()
                    +"-> "
                    + edge.getDst().getName());
        }
    }
}
