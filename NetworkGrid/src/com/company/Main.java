package com.company;

public class Main {

    public static void main(String[] args) {

    // Making Adjacency List and adding vertex class to our list
        AdjacencyList NetworkGrid = new AdjacencyList ();
        AddingVerticesAndEdges(NetworkGrid);
        NetworkGrid.PrintEdges();
        NetworkGrid.MST();
        NetworkGrid.PrintMST();
    }

    public static AdjacencyList AddingVerticesAndEdges( AdjacencyList cities){

        Vertex Eskildstrup = new Vertex ("Eskildstrup");
        Vertex Haslev      = new Vertex ("Haslev"     );
        Vertex HolbæK      = new Vertex ("Holbæk"     );
        Vertex Jærgerspris = new Vertex ("Jærgerspris");
        Vertex Kalundborg  = new Vertex ("Kalundborg" );
        Vertex Korsør      = new Vertex ("Korsør"     );
        Vertex Køge        = new Vertex ("Køge"       );
        Vertex Maribo      = new Vertex ("Maribo"     );
        Vertex Nakskov     = new Vertex ("Nakskov"    );
        Vertex Nykoebing_F = new Vertex ("Nykoebing_F");
        Vertex Næstved    = new Vertex  ("Næstved"    );
        Vertex Ringsted    = new Vertex ("Ringsted"   );
        Vertex Roskilde    = new Vertex ("Roskilde"   );
        Vertex Slagelse    = new Vertex ("Slagelse"   );
        Vertex Sorø        = new Vertex ("Sorø"       );
        Vertex Vordingborg = new Vertex ("Vordingborg");

 // Here Vertex is added to the graph
        cities.addVertex(Eskildstrup);
        cities.addVertex(Haslev);
        cities.addVertex(HolbæK);
        cities.addVertex(Jærgerspris);
        cities.addVertex(Kalundborg);
        cities.addVertex(Korsør);
        cities.addVertex(Køge);
        cities.addVertex(Maribo);
        cities.addVertex(Nakskov);
        cities.addVertex(Nykoebing_F);
        cities.addVertex(Næstved);
        cities.addVertex(Ringsted);
        cities.addVertex(Roskilde);
        cities.addVertex(Slagelse);
        cities.addVertex(Sorø);
        cities.addVertex(Vordingborg);

// We add all edges between different cities  as they are parted by the start cities

         cities.newEdge(Eskildstrup, Maribo,                28);
         cities.newEdge(Eskildstrup, Nykoebing_F,           13);
         cities.newEdge(Eskildstrup, Vordingborg,           24);

         cities.newEdge(Haslev,   Korsør,                   60);
         cities.newEdge(Haslev,   Køge,                     24);
         cities.newEdge(Haslev,   Næstved,                  25);
         cities.newEdge(Haslev,   Ringsted,                 19);
         cities.newEdge(Haslev,   Roskilde,                 47);
         cities.newEdge(Haslev,   Slagelse,                 48);
         cities.newEdge(Haslev,   Sorø,                     34);
         cities.newEdge(Haslev,   Vordingborg,              40);

         cities.newEdge(HolbæK,          Jærgerspris,       34);
         cities.newEdge(HolbæK,          Kalundborg,        44);
         cities.newEdge(HolbæK,          Korsør,            66);
         cities.newEdge(HolbæK,          Ringsted,          36);
         cities.newEdge(HolbæK,          Roskilde,          32);
         cities.newEdge(HolbæK,          Slagelse,          46);
         cities.newEdge(HolbæK,          Sorø,              34);

         cities.newEdge(Jærgerspris,     Korsør,            95);
         cities.newEdge(Jærgerspris,     Køge,              58);
         cities.newEdge(Jærgerspris,     Ringsted,          56);
         cities.newEdge(Jærgerspris,     Roskilde,          33);
         cities.newEdge(Jærgerspris,     Slagelse,          74);
         cities.newEdge(Jærgerspris,     Sorø,              63);

         cities.newEdge(Kalundborg,      Ringsted,          62);
         cities.newEdge(Kalundborg,      Roskilde,          70);
         cities.newEdge(Kalundborg,      Slagelse,          39);
         cities.newEdge(Kalundborg,      Sorø,              51);

         cities.newEdge(Korsør,          Næstved,           45);
         cities.newEdge(Korsør,          Slagelse,          20);

         cities.newEdge(Køge,            Næstved,           45);
         cities.newEdge(Køge,            Ringsted,          28);
         cities.newEdge(Køge,            Roskilde,          25);
         cities.newEdge(Køge,            Vordingborg,       60);

         cities.newEdge(Maribo,          Nakskov,           27);
         cities.newEdge(Maribo,          Nykoebing_F,       26);

         cities.newEdge(Næstved,         Roskilde,          57);
         cities.newEdge(Næstved,         Ringsted,          26);
         cities.newEdge(Næstved,         Slagelse,          37);
         cities.newEdge(Næstved,         Sorø,              32);
         cities.newEdge(Næstved,         Vordingborg,       28);

         cities.newEdge(Ringsted,        Roskilde,          31);
         cities.newEdge(Ringsted,        Sorø,              15);
         cities.newEdge(Ringsted,        Vordingborg,       58);

         cities.newEdge(Slagelse,        Sorø,              14);

      return cities;
    }
}
