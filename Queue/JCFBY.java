import java.util.*;
public class JCFBY {
    public static void main(String args[]){
        Queue<Integer>q=new ArrayDeque<>();  //LinkedList<>();
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        while(!q.isEmpty()){
            System.out.println(q.peek());
            q.remove();
        }
    }
    
}
