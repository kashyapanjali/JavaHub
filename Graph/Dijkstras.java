import java.util.*;
public class Dijkstras {
    public static class Edge{
        int src;
        int dest;
        int wt;
        Edge(int s,int d,int w){
            this.src=s;
            this.dest=d;
            this.wt=w;
        }
    }
    public static void creategraph(ArrayList<Edge>graph[]){
        for(int i=0;i<graph.length;i++){
            graph[i]=new ArrayList<Edge>();
        }
        graph[0].add(new Edge(0,1,2));
        graph[0].add(new Edge(0,2,4));

        graph[1].add(new Edge(1,2,1));
        graph[1].add(new Edge(1,3,7));

        graph[2].add(new Edge(2,4,3));

        graph[3].add(new Edge(3,5,1));

        graph[4].add(new Edge(4,3,2));
        graph[4].add(new Edge(4,5,5));
    }

     public static class Pair implements Comparable<Pair>{
        int n;
        int path;
        public Pair(int n,int path){
            this.n=n;
            this.path=path;
        }
        @Override
        public int compareTo(Pair p2){
            return this.path-p2.path; //path based sorting
        }

    }
    //O(E + E logV)
    public static void dijkstras(ArrayList<Edge>graph[],int src){
        int dist[]=new int [graph.length];//distance src to i
        for(int i=0;i<graph.length;i++){
            if(i!=src){
                dist[i]=Integer.MAX_VALUE;  //+infinity
            }
        }
        boolean vis[]=new boolean[graph.length];
        PriorityQueue<Pair>pq=new PriorityQueue<>();
        pq.add(new Pair(0,0));
        //loop
        while(!pq.isEmpty()){
            Pair curr=pq.remove(); //shortest
            if(!vis[curr.n]){
                vis[curr.n]=true;

                //neighbour
                for(int i = 0; i < graph[curr.n].size(); i++) {
                    Edge e = graph[curr.n].get(i);
                    int v = e.dest;
                    int wt = e.wt;
                    if (dist[curr.n] + wt < dist[v]) { // relaxation
                        dist[v] = dist[curr.n] + wt;
                        pq.add(new Pair(v, dist[v])); // Corrected to add (v, dist[v])

                    }
                }
            }
        }
        for(int i=0;i<dist.length;i++){
            System.out.println(dist[i]+" ");
        }
        System.out.println();
    }
    public static void main(String args[]){
        int V=8;
        @SuppressWarnings("unchecked")
        ArrayList<Edge>graph[]=new ArrayList[V];
        creategraph(graph);
        dijkstras(graph, 0);
    }
    
}
