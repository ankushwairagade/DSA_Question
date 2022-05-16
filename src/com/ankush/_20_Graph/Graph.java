package com.ankush._20_Graph;

public class Graph {
    // How to store Graph in Adjacency Matrix
    int V;
    int E;
    int adjMat[][];

    Graph(int n)
    {
        this.V=n;
        this.E=0;
        this.adjMat = new int[n][n];
    }

    void addEdge(int v,int u)
    {
        E+=1;
        this.adjMat[v][u]=1;
        this.adjMat[u][v]=1; // because of Graph is Undirected
    }

    @Override
    public String toString() {
     StringBuilder sb = new StringBuilder();
     sb.append(V+" Vertices "+E+" Edges"+"\n");
        for (int i = 0; i < V; i++) {
            sb.append(i +":  ");
            for (int j = 0; j < V; j++) {
                sb.append("  "+adjMat[i][j]);
            }
            sb.append("\n");
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        Graph g = new Graph(4);
        g.addEdge(0,2);
        g.addEdge(0,3);
        g.addEdge(1,3);
        System.out.println(g);
    }
}

