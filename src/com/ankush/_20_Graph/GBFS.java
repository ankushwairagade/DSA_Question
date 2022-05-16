package com.ankush._20_Graph;


import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class GBFS {
    int V,E;
    LinkedList<Integer>[] adj;

    // constructor
    GBFS(int n)
    {
        this.V=n;
        this.E=0;
        this.adj=new LinkedList[n];
        // init all nodes
        for (int i = 0; i < n; i++) {
            adj[i]=new LinkedList<>();
        }
    }

    void addEdge(int u , int v)
    {
        this.adj[u].add(v);
        this.adj[v].add(u);
    }
    void bfs( int s)
    {
        boolean[] visited = new boolean[V];
        Queue<Integer> q = new LinkedList<>();
        visited[s]=true;
        q.offer(s);

        while(!q.isEmpty())
        {
            int u = q.poll();
            System.out.print(u +" ");

            for (int v : adj[u]) {
                if (!visited[v]) {
                    q.offer(v);
                    visited[v] = true;
                }
            }
        }
    }

    void dfs(int s)
    {
        boolean[] visited = new boolean[V];
        Stack<Integer> stack = new Stack<>();
        stack.push(s);

        while(!stack.isEmpty())
        {
            int u = stack.pop();
            if(visited[u]==false) {
                visited[u] = true;
                System.out.print(u + " ");

                for (int w : adj[u]) {
                    if (!visited[w]) {
                        stack.push(w);
                    }
                }
            }
        }
    }

    public String toString()
    {
        StringBuilder sb = new StringBuilder();
        sb.append("Vertices = "+V+"  Edges = "+E+"\n");
        for (int i = 0; i < V; i++) {
            sb.append(i+": -> ");
            for(int w : adj[i])
            {
                sb.append(w+" ");
            }sb.append("\n");
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        GBFS g = new GBFS(5);
        g.addEdge(0,1);
        g.addEdge(1,2);
        g.addEdge(2,3);
        g.addEdge(3,0);
        g.addEdge(2,4);
        System.out.println(g);

        System.out.println("Printing BFS");
        g.bfs(0);
        System.out.println();
        System.out.println("Printing DFS");
        g.dfs(0);
    }


}
