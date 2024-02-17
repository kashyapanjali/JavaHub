import java.util.LinkedList;
public class JavaColl {
    public static void main(String args[]){
        LinkedList<Integer>ll=new LinkedList<>();
        ll.addLast(1);
        ll.addLast(2);
        ll.addFirst(3);
        System.out.println(ll);
        ll.removeFirst();
        ll.removeLast();
        System.out.println(ll);
    }
    
}
