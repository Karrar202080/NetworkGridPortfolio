package com.company;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.PriorityQueue;

public class AdjacencyList {
    public ArrayList<Vertex> vertices; // Making graph by using ArrayList

        double MSTLength = 0;

    public AdjacencyList() {
            vertices = new ArrayList<>();
        }

        // adding vertexes to to our list
        public void addVertex(Vertex V) {
            vertices.add(V);
        }

        //Making a method that makes new Edge
        public void newEdge(Vertex from, Vertex to, Integer distance) {

            // controls if the vertices  does not contain a connection
            if (!(vertices.contains(from) && vertices.contains(to))) {
                System.out.println(" This city no exist");
            }
            Edge edge = new Edge(from, to ,distance);
            Edge edge1 = new Edge(to, from ,distance);

        }

        public void PrintEdges() {

            // for each loop that print out vertices
            for (Vertex CurrentVertex : vertices) {

                // initialization of the Vertex and insert value for the vertex,
                // used to print the current position in the list.
                Vertex CurrentV;
                CurrentV = CurrentVertex;

                System.out.println(" Edge from Vertex: " + CurrentV.getName());
                System.out.println(" ");

// for each loop which print the edge OutEdge is in relation to the current vertex and distance,

                for (Edge OutEdge : CurrentV.getOut_Edges()) {
                    Integer DistanceV = OutEdge.getWeight();

                    System.out.println(" To: " + OutEdge.getToVertex().getName() + " distance : " + DistanceV);

                    System.out.println(" ");
                }
            }
        }

        // (The Algorithm ;make a method for the Minimum Spanning Tree for the  Arraylist
        public void MST() {

        // Makes a PriorityQueue for our vertex and saves then in a priority list
            PriorityQueue<Vertex> Q = new PriorityQueue<>();

            // if statement looks for the first vertex to put in the priority list.
            if (vertices.size() > 0) {

                vertices.get(0).Distance = 0;

                Q.offer(vertices.get(0));
            }

            // while loop that looks at the PQ and see if its empty
            while (!Q.isEmpty()) {

                // make a vertex for the smallest edge and retrieve it from the priority list.
                //and if not, then it is out of tree
                Vertex SmallestCost = Q.poll();
                SmallestCost.IsInTree = false;

                //iterate the length of edges
                for (int e = 0; e < SmallestCost.getOut_Edges().size(); e++) {
                    Edge edge = SmallestCost.getOut_Edges().get(e);
                    Vertex toVertex = edge.getToVertex();

                // if statement that checks if vertex weight less than distance of edge and it is not inside tree
                    if (edge.getWeight() < edge.getToVertex().Distance && !edge.getToVertex().IsInTree) {
                        Q.remove(toVertex);
                        edge.getToVertex().Distance = edge.getWeight();
                        edge.getToVertex().PreviousVertex = SmallestCost;
                        Q.offer(edge.ToVertex);
                    }
                }
                SmallestCost.IsInTree = true;
                MSTLength += SmallestCost.Distance;
            }
        }

        // Method to print the minimum spanning tree, looks for the root of the tree and parent for the vertices
        public void PrintMST() {

        // for each loop print the name of vertices in relation to vertex
            for (Vertex vertex : vertices) {
                System.out.print(vertex.getName());

                // we get the name, if the vertex previous is not null and the weight of the edge between them,
                if (vertex.PreviousVertex != null)
                    System.out.print(" coming from  " + vertex.PreviousVertex.getName()
                                      + " The cost " + vertex.Distance);

                // otherwise it states that the vertex has no parent
                else{

                    System.out.println("Vertex " + vertex.getName() + " Has no parent ");
                }
                System.out.println("  ");
            }

            // Print the MST tree length out
            System.out.println("The total distance for network grid is: " + MSTLength + " KM");

            System.out.println("  ");

            // Print the cost of the grid with short decimal
            System.out.println(" The total cost for the network grid is:  " +
                    new DecimalFormat("### ### ###").format(MSTLength * 100000) + "kroner");
        }
    }
