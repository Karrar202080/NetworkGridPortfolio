package com.company;

public class Edge {
    // Makes three variables that stores vertices and weight

    Vertex FromVertex;
    Vertex ToVertex;
    Integer Weight;

    // initialization the edge with three variables in it
    public Edge(Vertex from, Vertex to, Integer cost) {
        FromVertex = from;
        ToVertex = to;
        Weight = cost;
        from.AddOutEdge(this);
    }

    public Vertex getToVertex() {
        return ToVertex;
    }

    public Integer getWeight() {
        return Weight;
    }
}