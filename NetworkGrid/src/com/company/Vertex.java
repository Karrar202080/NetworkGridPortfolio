package com.company;
import java.util.ArrayList;


public class Vertex implements Comparable<Vertex> {
    String Name;

    public ArrayList<Edge> getOut_Edges() {
        return Out_Edges;
    }

    ArrayList<Edge> Out_Edges;

    // makes variables stored for the edges
    Integer Distance       = Integer.MAX_VALUE;
    Vertex PreviousVertex  = null;
    boolean IsInTree       = false;

    public String getName() {
        return Name;
    }

    // A method for naming our vertex
    public Vertex(String city) {
        this.Name = city;
        Out_Edges = new ArrayList<>();
    }
    // make method for adding the out edges
    public void AddOutEdge(Edge outEdge) {
        Out_Edges.add(outEdge);

    }
    // method that compares the vertices distance with one another
    @Override
    public int compareTo(Vertex o) {
        return this.Distance.compareTo(o.Distance);
    }
}
