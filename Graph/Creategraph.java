import java.util.*;

public class Creategraph {
    static class Edge{
        int src;
        int dest;
        int wt;

        Edge(int s,int d,int w){
            this.src=s;
            this.dest=d;
            this.wt=w;
        }
    }

    public static void main(String args[]){
        int V=5;
        @SuppressWarnings("unchecked")
        ArrayList<Edge>graph[]=new ArrayList[V];  //null-->empty arrayList

        for(int i=0;i<V;i++){
            graph[i]=new ArrayList<>();
        } 
        
        //Graph---O(V+E)


        /*         4
            0     /
            |    /  
            |   2
            |  / \
            | /   \
            1------3   
         */

        //0-Vertex
        graph[0].add(new Edge(0,1,5));
        //1-Vertex
        graph[1].add(new Edge(1,0,5));
        graph[1].add(new Edge(1,2,3));
        graph[1].add(new Edge(1,3,2));
        //2-Vertex
        graph[2].add(new Edge(2,1,3));
        graph[2].add(new Edge(2,3,1));
        graph[2].add(new Edge(2,4,3));
        //3-Vertex
        graph[3].add(new Edge(3,1,2));
        graph[3].add(new Edge(3,2,1));
        //4-Vertex
        graph[4].add(new Edge(2,4,3));

        //2's neighbours
        for(int i=0;i<graph[2].size();i++){
            Edge e=graph[2].get(i);  //size.dest,wt
            System.out.println(e.src+","+e.dest+","+e.wt);

        }   
    }
    
}
