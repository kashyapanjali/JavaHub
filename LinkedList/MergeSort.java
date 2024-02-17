public class MergeSort{
    public static class Node{
        int data;
        Node next;
        public Node(int data){
            this.data=data;
            this.next=null;
        }
    }
        public Node head;
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

    public Node getMid(Node head){
        Node slow=head;
        Node fast=head.next;
        while(fast!=null&&fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }
        return slow;    //mod Node
    }
    private Node merge(Node head1,Node head2){
        Node mergeLL=new Node(-1);
        Node temp=mergeLL;
        while(head1!=null&&head2!=null){
            if(head1.data<=head2.data){
                temp.next=head1;
                head1=head1.next;
                temp=temp.next;
            }else{
                temp.next=head2;
                head2=head2.next;
                temp=temp.next;
            }
        }
        while(head1!=null){
            temp.next=head1;
            head1=head1.next;
            temp=temp.next;
        }
        while(head2!=null){
            temp.next=head2;
            head2=head2.next;
            temp=temp.next;
        }
        return mergeLL.next;
    }
    public Node mergeSort(Node head){
        if(head==null||head.next==null){
            return head;
        }
        //find mid
        Node mid=getMid(head);
        //left&right MS
        Node righthead=mid.next;
        mid.next=null;
        Node newleft=mergeSort(head);
        Node newright=mergeSort(righthead);
        return merge(newleft,newright);
    }
    public static void main(String args[]){
        MergeSort ll=new MergeSort();
        ll.addLast(4);
        ll.addLast(3);
        ll.addLast(5);
        ll.addLast(7);
        ll.addLast(1);
        //1->2->3->4->5
        ll.print();
        System.out.println("mergeSort is");
        ll.head=ll.mergeSort(ll.head);
        ll.print();      
        }
        

    }
