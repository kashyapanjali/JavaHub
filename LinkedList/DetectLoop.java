
public class DetectLoop {
    public static class Node{
        int data;
        Node next;
        public Node(int data){
            this.data=data;
            this.next=null;
        }
    }
    public static Node tail;
    public static Node head;
    public void addFirst(int data){
        Node newNode=new Node (data);
        if(head==null){
            head=tail=null;
            return;
        }
        newNode.next=head;
        head=newNode;
    }
    public void print(){
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.data+"->");
             temp=temp.next;
        }
        System.out.println("null");
    }
    public static boolean isCycle(){
        Node slow=head;
        Node fast=head;
        while(slow!=null&&fast.next!=null){
            slow=slow.next;  //+1
            fast=fast.next.next;//+2
            if(slow==fast){
                return true;
            }
        }return false;
    }
    public static void removeLoop(){
        //detect loop
        Node slow=head;
        Node fast=head;
        boolean cycle=false;
        while(fast!=null&&fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
            if(slow==fast){
                cycle=true;
                break;
            }
        }
        if(cycle==false){
            return;
        }

        //meeting fast and slow node by moving one step
        slow=head;
        Node prev=null;
        while(slow!=fast){   
            prev=fast;    //last node
            slow=slow.next; //+1
            fast=fast.next;  //+2
        }
        prev.next=null;   //removing cycle from last 
    }
    public static void main(String args[]){
       // LinkedList ll=new LinkedList();
        head = new Node(1);
        Node temp= new Node(2);
        head.next=temp;
        head.next.next = new Node(3);
        head.next.next.next = temp;
        // head.next.next.next.next = new Node(5);
        // Creating a loop for testing (connecting the last node to the second node)
        // head.next.next.next.next.next = head.next;
        System.out.println(isCycle());
        removeLoop();
        System.out.println(isCycle());
    }
}
