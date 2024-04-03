import java.util.*;
import java.util.LinkedList;

public class CheapestFlight {
    static class Edge{
        int src;
        int dest;
        int wt;


        public Edge(int s,int d,int wt){
            this.src=s;
            this.dest=d;
            this.wt=wt;
       }
    }

    public static void createGraph(int flight[][],ArrayList<Edge>graph[]){
        for(int i=0;i<graph.length;i++){
            graph[i]=new ArrayList<>();
        }

        for(int i=0;i<flight.length;i++){
            int src=flight[i][0];
            int dest=flight[i][1];
            int wt=flight[i][2];

            Edge e=new Edge(src,dest,wt);
            graph[src].add(e);

        }
    }

    static class Info{
        int v;
        int cost;
        int stops;

        public Info(int v,int c,int s){
            this.v=v;
            this.cost=c;
            this.stops=s;
        }
    }

    public static int cheapestFlight(int n,int flight[][],int src,int dest,int k){
        @SuppressWarnings("unchecked")
        ArrayList<Edge>graph[]=new ArrayList[n];
        createGraph(flight, graph);

        int dist[]=new int[n];
        for(int i=0;i<n;i++){
            if(i!=src){
                dist[i]=Integer.MAX_VALUE;
            }
        }

        Queue<Info>q=new LinkedList<>();
        q.add(new Info(src, 0, 0));

        while(!q.isEmpty()){
            Info curr=q.remove();
            if(curr.stops>k){
                break;
            }

            for(int i=0;i<graph[curr.v].size();i++){
                Edge e=graph[curr.v].get(i);
                int v=e.dest;
                int wt=e.wt;

                //ralxation-step
                //if(dist[u]!=Integer.MAX_VALUE &&dist[u]+wt<dist[v]&&curr.stops<=k)
                if(curr.cost+wt < dist[v] && curr.stops <= k){
                    dist[v]=curr.cost+wt;
                    q.add(new Info(v, dist[v], curr.stops+1));
                }
            }
        }

        //dist[dest]
        if(dist[dest]==Integer.MAX_VALUE){
            return -1;
        }else{
            return dist[dest];
        }
    }

    public static void main(String args[]){
        int n=4;
        int flights[][]={{0,1,100},{1,2,100},{2,0,100},{1,3,600},{2,3,200}};
        int src=0,dest=3,k=1;
        int cheapestCost = cheapestFlight(n, flights, src, dest, k);
        System.out.println("Cheapest cost from " + src + " to " + dest + " with at most " + k + " stops is: " + cheapestCost);
    }
}
    

