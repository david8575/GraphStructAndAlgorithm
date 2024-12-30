package org.david.Graph.UndirectedGraph;

public class UndirectedEdge {
    private UndirectedVertex v1;
    private UndirectedVertex v2;
    private int weight;

    public UndirectedEdge(UndirectedVertex v1, UndirectedVertex v2, int weight) {
        this.v1 = v1;
        this.v2 = v2;
        this.weight = weight;
    }

    public UndirectedVertex getScr() {
        return v1;
    }

    public void setScr(UndirectedVertex v1) {
        this.v1 = v1;
    }

    public UndirectedVertex getDst() {
        return v2;
    }

    public void setDst(UndirectedVertex v2) {
        this.v2 = v2;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "Edge[scr="
                + v1
                + ", dst="
                + v2
                + ", weight="
                + weight + "]";
    }
}
