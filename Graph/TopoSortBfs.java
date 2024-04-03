import java.util.*;
import java.util.LinkedList;

public class TopoSortBfs {
    public static class Edge{
        int src;
        int dest;
        Edge(int s,int d){
            this.src=s;
            this.dest=d;
        }
    }

    public static void creategraph(ArrayList<Edge> graph[]) {
        for (int i = 0; i < graph.length; i++) {
            graph[i] = new ArrayList<Edge>();
        }
    
        // nodes
        graph[2].add(new Edge(2, 3));
        graph[3].add(new Edge(3, 1));
        graph[4].add(new Edge(4, 0));
        graph[4].add(new Edge(4, 1));
        graph[5].add(new Edge(5, 0));
        graph[5].add(new Edge(5, 2));
    }
    
    //calIndegree
    public static void calIndeg(ArrayList<Edge>graph[],int indeg[]){
        for(int i=0;i<graph.length;i++){
            int v=i;
            for(int j=0;j<graph[v].size();j++){
                Edge e=graph[v].get(i);
                indeg[e.dest]++;

            }
        }
    }
    public static void topoSort(ArrayList<Edge>graph[]){
        int V=graph.length;
        int indeg[]=new int[V];
        calIndeg(graph, indeg);
        Queue<Integer>q=new LinkedList<>();
        for(int i=0;i<V;i++){
            if(indeg[i]==0){
                q.add(i);
            }
        }
        //bfs
        while(!q.isEmpty()){
            int curr=q.remove();
            System.out.println(curr+" ");  //topological sort
            for(int i=0;i<graph[curr].size();i++){
                Edge e=graph[curr].get(i);
                indeg[e.dest]--;
                if(indeg[e.dest]==0){
                    q.add(e.dest);
                }
                
            }
        }
        System.out.println();
    }
    public static void main(String args[]) {
        int V = 6; // Number of vertices
        @SuppressWarnings("unchecked")
        ArrayList<Edge>[] graph = new ArrayList[V]; 
        creategraph(graph);
        topoSort(graph);
    }
}
