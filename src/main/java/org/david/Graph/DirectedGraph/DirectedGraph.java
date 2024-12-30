package org.david.Graph.DirectedGraph;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class DirectedGraph {
    private Map<Integer, DirectedVertex> vertices;
    private List<DirectedEdge> edges;

    public DirectedGraph() {
        vertices = new HashMap<Integer, DirectedVertex>();
        edges = new ArrayList<DirectedEdge>();
    }

    public void addVertex(int id, String name) {
        vertices.put(id, new DirectedVertex(id, name));
    }

    public void addEdge(int scrId, int dstId, int weight) {
        DirectedVertex src = vertices.get(scrId);
        DirectedVertex dst = vertices.get(dstId);

        if (src == null && dst == null) {
            throw new IllegalArgumentException("[해당 정점이 존재하지 않음]");
        }

        edges.add(new DirectedEdge(src, dst, weight));
    }

    public void printGraph(){
        System.out.println("Vertices: ");
        for (DirectedVertex vertex : vertices.values()) {
            System.out.println(vertex);
        }

        System.out.println("\nEdges: ");
        for (DirectedEdge edge : edges) {
            System.out.println(edge);
        }

        System.out.println("\nGraph Representation:");

        for (DirectedEdge edge : edges) {
            System.out.println(edge.getScr().getName()
                    + " --"
                    + edge.getWeight()
                    +"-> "
                    + edge.getDst().getName());
        }
    }
}
