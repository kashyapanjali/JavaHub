import java.util.*;
public class BDeque {
    public static void main(String args[]){
        Deque<Integer>dq=new ArrayDeque<>();
        dq.addFirst(3);
        dq.addFirst(2);
        dq.addFirst(1);
        System.out.println(dq);
        dq.addLast(4);
        dq.addLast(5);
        System.out.println(dq);
        dq.removeFirst();
        System.out.println(dq);
        dq.removeLast();
        System.out.println(dq);
        System.out.println("first element is:"+dq.getFirst());
        System.out.println("last element is:"+dq.getLast());
    }
    
}
