import java.util.*;
import java.util.LinkedList;

public class ImplimentHm {
 public static class HashMap<K,V>{     //generic type
    private class Node{
        K key;
        V value;
        public Node(K key,V value){
            this.key=key;
            this.value=value;
        }
    } 

    private int N;   //buckets size
    private int n;  //linked initial size
    private LinkedList<Node>buckets[];//N buckets array

    @SuppressWarnings("unchecked")
    public HashMap(){
        this.N=4;
        this.buckets=new LinkedList[4];
        for(int i=0;i<4;i++){
            this.buckets[i]=new LinkedList<>();
          }     
    }
    
    private int hashFunction(K key){
        int hc=key.hashCode();  //hashcode funtion gives the value
        return Math.abs(hc)%N;   //valid: negative value
    }

    private int SearchInLL(K key, int bi){

        LinkedList<Node>ll=buckets[bi];
        int di=0;

        for(int i=0;i<ll.size();i++){
            Node node=ll.get(i);
            if(node.key==key){
                return di;
            }
            di++;
        }
       return -1;
    }
    
    @SuppressWarnings("unchecked")
    private void rehash(){
        LinkedList<Node>oldBuck[]=buckets;
        buckets=new LinkedList[N*2];
        N=2*N;
        for(int i=0;i<buckets.length;i++){
            buckets[i]=new LinkedList<>();
        }

        //nodes-> add in new buckets
        for(int i=0;i<oldBuck.length;i++){
            LinkedList<Node>ll=oldBuck[i];
            for(int j=0;j<ll.size();j++){
                Node node=ll.remove();
                put(node.key, node.value);
            }
        }
    }

    public void put(K key,V value){  //O(lambda)->O(1)
        int bi=hashFunction(key);  //0 to size-1
        int di=SearchInLL(key,bi);   //valid or -1
    
        if(di!=-1){
          Node node=buckets[bi].get(di);
          node.value=value;
        }
        else{
          buckets[bi].add(new Node(key,value));
          n++;
       } 

       double lambda=(double)n/N;
       if(lambda>2.0){
         rehash();
       }
     }

    public boolean containsKey(K key){ //O(1)
        int bi=hashFunction(key);  //0 to size-1
        int di=SearchInLL(key,bi);   //valid or -1
    
        if(di!=-1){  //valid value
          return true;
        }
        else{
         return false;
       } 
     } 

    public V remove(K key){  //O(1)
        int bi=hashFunction(key);  //0 to size-1
        int di=SearchInLL(key,bi);   //valid or -1
    
        if(di!=-1){
          Node node=buckets[bi].remove(di);
          n--;
          return node.value;
        }
        else{
            return null;
         }   
     }


    public V get(K key){  //O(1)
        int bi=hashFunction(key);  //0 to size-1
        int di=SearchInLL(key,bi);   //valid or -1
    
        if(di!=-1){
            Node node=buckets[bi].get(di);
            return node.value;
        }else{
            return null;
       } 
     }
    
    public ArrayList<K>keySet(){
        ArrayList<K>keys=new ArrayList<>();
         
        for(int i=0;i<buckets.length;i++){
            LinkedList<Node>ll=buckets[i];
            for(Node node:ll){
                keys.add(node.key);
            }
        }
        return keys;
     }
    
    public boolean isEmpty(){
        return n==0;
    } 
}

public static void main(String args[]){
    HashMap<String,Integer>hm=new HashMap<>();
    hm.put("India",100);
    hm.put("China",150);
    hm.put("Nepal",50);

    ArrayList<String>keys=hm.keySet();
    for(String key:keys){  //for each loop
        System.out.println(key);
    }

    System.out.println(hm.get("India"));
    System.out.println(hm.remove("India"));
    System.out.println(hm.get("India"));
    System.out.println(hm.isEmpty());
    
   }
}


