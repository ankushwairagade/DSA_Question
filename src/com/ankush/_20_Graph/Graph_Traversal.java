package com.ankush._20_Graph;


import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class Graph_Traversal {
  LinkedList<Integer>[] ls;
  int V , E;
  Graph_Traversal(int size)
  {    this.V=size;
      this.E=0;
      ls=new LinkedList[size];
      for (int i = 0; i < V; i++) {
          ls[i] = new LinkedList<Integer>();
      }
  }

  void AddEdge(int u , int v)
  {  E+=1;
      // for directed graph
      this.ls[u].add(v);
      this.ls[v].add(u);

  }

  public String toString()
  {
        StringBuilder sb = new StringBuilder();
        sb.append("Vertices = "+V+"  Edges = "+E+"\n");
        for (int i = 0; i < V; i++) {
            sb.append(i+": -> ");
            for(int w : ls[i])
            {
                sb.append(w+" ");
            }sb.append("\n");
        }
        return sb.toString();
    }

   void DFS(int s)  // Iterative
  {
      boolean [] visited = new boolean[V];
      Stack<Integer> stack = new Stack<>();
      stack.push(s);

      while(!stack.isEmpty())
      {
          int u = stack.pop();

          if(!visited[u]) {
              visited[u] = true;
              System.out.print(u + "  ");
              for(int i : ls[u])
              {
                  if(!visited[i])
                  {
                      stack.push(i);
                  }
              }
          }
      }
  }

  void BFS(int s)  // Iterative way
  {
      boolean [] visited = new boolean[V];
      Queue<Integer> queue = new LinkedList<>();
      queue.offer(s);

      while(!queue.isEmpty())
      {
          int u=queue.poll();
          visited[u] =true;
          System.out.print(u+"  ");

          for(int i : ls[u])
          {
              if(!visited[i]){
                  visited[i]=true;
                  queue.offer(i);
              }
          }
      }

  }

    void DFSUtil(int v , boolean[] visited)
    {
        visited[v]=true;
        System.out.print(v+" ");
        for(int x : ls[v])
        {
            if(!visited[x])
            {
                DFSUtil(x,visited);
            }
        }


    }
    void dfs()
    { boolean[] visited = new boolean[V];
        for (int i = 0; i < V; i++) {
            if(!visited[i]) {
                DFSUtil(i, visited);
            }
        }
    }

    public static void main(String[] args) {
        Graph_Traversal graph = new Graph_Traversal(6);
        graph.AddEdge(0,1);
        graph.AddEdge(2,3);
        graph.AddEdge(4,0);
        graph.AddEdge(5,3);
        System.out.println(graph);

       graph.DFS(0);
       System.out.println();
       graph.BFS(0);
       System.out.println();
       graph.dfs();
  }

}
