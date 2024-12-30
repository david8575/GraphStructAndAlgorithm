package org.david.Graph.DirectedGraph;

public class DirectedEdge {
    private DirectedVertex scr;
    private DirectedVertex dst;
    private int weight;

    public DirectedEdge(DirectedVertex scr, DirectedVertex dst, int weight) {
        this.scr = scr;
        this.dst = dst;
        this.weight = weight;
    }

    public DirectedVertex getScr() {
        return scr;
    }

    public void setScr(DirectedVertex scr) {
        this.scr = scr;
    }

    public DirectedVertex getDst() {
        return dst;
    }

    public void setDst(DirectedVertex dst) {
        this.dst = dst;
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
                + scr
                + ", dst="
                + dst
                + ", weight="
                + weight + "]";
    }
}
