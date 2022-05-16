package com.ankush._20_Graph;

public class RepresentAdjMatrix {
    int [][] AdjMat;

    RepresentAdjMatrix(int V)
    {
        this.AdjMat = new int[V][V];
    }

    void addEdge(int u , int v)
    {   // two line for undirected graph
        this.AdjMat[u][v]=1;
        this.AdjMat[v][u]=1;
    }

    void display()
    {
        for (int i = 0; i < AdjMat.length; i++) {
            for (int j = 0; j < AdjMat[0].length; j++) {
                System.out.print("  "+AdjMat[i][j]);
            }
            System.out.println();
        }
    }


    public static void main(String[] args) {
        RepresentAdjMatrix graph = new RepresentAdjMatrix(4);
        graph.addEdge(0,3);
        graph.addEdge(0,2);
        graph.addEdge(0,1);
        graph.addEdge(1,2);
        graph.addEdge(2,3);
        graph.display();

    }

}
