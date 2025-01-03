package org.david.Graph.UndirectedGraph;

public class UndirectedVertex {
    private int id;
    private String name;

    public UndirectedVertex(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Vertex [id=" + id + ", name=" + name + "]";
    }
}
