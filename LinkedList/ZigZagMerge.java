public class ZigZagMerge{
    public static class Node{
        int data;
        Node next;
        public Node(int data){
            this.data=data;
            this.next=null;
        }
    }
        public static Node head;
        public static Node tail;
        //Add LinkedList in first
        public void addFirst(int data){
            // Step 1-create new node
            Node newNode=new Node(data);
            if(head==null){
                head=tail=newNode;
                return;
            }
            //Step 2-newNode-next=next
            newNode.next=head;//link
            //Step 3-head-newNode
            head=newNode;
        }
        //add Linkedlist In Last
        public void addLast(int data){
            Node newNode=new Node(data);
            if(head==null)//or tail==null
            {
                head=tail=newNode;
                return;
            }
            tail.next=newNode;
            tail=newNode;
        }
        //print LinkedList
        public void print(){
            Node temp=head;
            while(temp!=null){
                System.out.print(temp.data+"->");
                temp=temp.next;
            }
            System.out.println("null");
        }
        public void ZigZagTerm(){
            //find mid
            Node slow=head;
            Node fast=head.next;
            while(fast!=null&&fast.next!=null){
                slow=slow.next;
                fast=fast.next.next;
            }
            Node mid=slow; //mid element
            //reverse 2nd half
            Node curr=mid.next;
            mid.next=null;
            Node prev=null;
            Node next;
            while(curr!=null){
                next=curr.next;
                curr.next=prev;
                prev=curr;
                curr=next;
            }
            Node left=head;
            Node right=prev;
            Node nextL,nextR;
            //Alt merge-Zig-Zag merge
            while(left!=null&&right!=null){
                nextL=left.next;
                left.next=right;
                nextR=right.next;
                right.next=nextL;
                left=nextL;
                right=nextR;
            }
        }
        public static void main(String args[]){
            ZigZagMerge ll=new ZigZagMerge();
            ll.addLast(1);
            ll.addLast(2);
            ll.addLast(3);
            ll.addLast(4);
            ll.addLast(5);
            ll.addLast(6);
            ll.print();
            System.out.print("Zig-Zag Merge is: ");
            ll.ZigZagTerm();
            ll.print();
        }

}