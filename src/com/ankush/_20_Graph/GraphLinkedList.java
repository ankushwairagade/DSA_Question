package com.ankush._20_Graph;

import java.util.LinkedList;
import java.util.Queue;

public class GraphLinkedList {
     LinkedList<Integer>[] adj;
     int V,E;
    public GraphLinkedList(int node) {
        this.adj = new LinkedList[node];
        this.V=node;
        for (int i = 0; i < node; i++) {
            this.adj[i] = new LinkedList<>();
        }
    }

    void addEdge(int u ,int v)
    {
        E+=1;
        this.adj[u].add(v);
        this.adj[v].add(u);
    }

    @Override
    public String toString() {

        StringBuilder sb = new StringBuilder();
        sb.append(V+" Vertices  "+ E+" Edges"+"\n");
        for (int i = 0; i < V; i++) {
           sb.append(i+": -> ");
            for (int w:adj[i]) {
                sb.append(w+" -> ");
            }
            sb.append("\n");
        }
        return sb.toString();

    }

    public static void main(String[] args) {
        GraphLinkedList g = new GraphLinkedList(5);
        g.addEdge(0,1);
        g.addEdge(1,2);
        g.addEdge(2,3);
        g.addEdge(3,0);
        g.addEdge(3,4);

        System.out.println(g);

        g.bfs(0);
    }

    private void bfs(int s) {
        boolean [] visited = new boolean[V];
        Queue<Integer> q = new LinkedList<>();
        visited[s]=true;
        q.offer(s);

        while(!q.isEmpty())
        {
            int u =q.poll();
            System.out.print(u+"  ");

            for(int w:adj[u])
            {
                if(visited[w]==false)
                {
                    visited[w]=true;
                    q.offer(w);
                }
            }

        }
    }
}
