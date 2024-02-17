public class LinkedList {
    //Create a node
    public static class Node{
        int data;
        Node next;
        public Node(int data){
            this.data=data;
            this.next=null;
        }
    }
        public Node head;
        public Node tail;
        public int size;
        //Add LinkedList in first
        public void addFirst(int data){
            // Step 1-create new node
            Node newNode=new Node(data);
            size++;
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
            size++;
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
            // if(head==null){
            //     System.out.println("empty Linkedlist");
            //     return;
            // }
            Node temp=head;
            while(temp!=null){
                System.out.print(temp.data+"->");
                temp=temp.next;
            }
            System.out.println("null");
        }

        //Add in middle
        public void add(int idx,int data){
            //when element is added in first index
            if(idx==0){
                addFirst(data);
                return;
            }
            Node newNode=new Node(data);
            size++;
            Node temp=head;
            int i=0;
            while(i<idx-1){
                temp=temp.next;
                i++;
            }
            newNode.next=temp.next;
            temp.next=newNode;
        }
        //Remove first
        public int removefirst(){
            if(size==0){
                System.out.println("LL is empty");
                return Integer.MIN_VALUE;
            }else if(size==1){
                int val=head.data;
                head=tail=null;
                size=0;
                return val;
            }
         int val=head.data;
         head=head.next;
         size--;
         return val;  
        }
        //remove node at last
        public int removeLast(){
            if(size==0){
                System.out.println("LL is empty");
                return Integer.MIN_VALUE;
            }else if(size==1){
                int val=head.data;
                head=tail=null;
                size=0;
                return val;
            }
            //prev:i=size-2;
            Node prev=head;
            for(int i=0;i<size-2;i++){
                prev=prev.next;
            }
            int val=prev.next.data;  //tail.data
            prev.next=null;
            tail=prev;
            size--;
            return val;
        }

        //key found in iterative way
        public int itrSearch(int key){
            Node temp=head;
            int i=0;
            while(temp!=null){
                if(temp.data==key){
                    return i;
                }
                temp=temp.next;
                i++;
            }
            return -1;
        }
        //key found in Recursive way
        public int helper(Node head,int key){
            if(head==null){
                return -1;
            }
            if(head.data==key){
                return 0;
            }
            int idx=helper(head.next,key);
                if(idx==-1){
                    return -1;
                }
                return idx+1;
            }
        
        public int recSearch(int key){
                return helper(head,key);
            }
        //Reverse a linkedList
        public void reverse(){
            Node prev=null;
            Node curr=tail=head;
            Node next;
            while(curr!=null){
                next=curr.next;
                curr.next=prev;
                prev=curr;
                curr=next;
            }
            head=prev;
        }
        //Find and remove nth node from end
        //iterative approach
        public void deleteNthFromEnd(int n){
            //calculate size
            int sz=0;
            Node temp=head;
            while(temp!=null){
                temp=temp.next;
                sz++;
            }
            if(n==sz){
                head=head.next;//remove first
                return;  
            }
            //sz-n
            int i=1;
            int iToFind=sz-n;
            Node prev=head;
            while(i<iToFind){
                prev=prev.next;
                i++;
            }
            prev.next=prev.next.next;
            return;
        }
        //check linkedlist is a palindrome
        //slow-fast technique

        public Node findMidNode(Node head){  //helper
             Node slow=head;
             Node fast=head;
             while(fast!=null&&fast.next!=null){
                slow=slow.next;  //+1
                fast=fast.next.next;  //+2
             }
             return slow; 
               }   //slow is my mid node
        public boolean checkPalindrome(){
            if(head==null||head.next==null){
                    return true;
                }
                //step1-find mid
                Node mid=findMidNode(head);
                //step2-reverse second half
                Node prev=mid;
                Node curr=null;
                Node next;
                while(curr!=null){
                    next=curr.next;
                    curr.next=prev;
                    prev=curr;
                    curr=next;
                }
                Node right=prev;  //right half head
                Node left=head;
                //step3-check left half and right half
                while(right!=null){
                    if(left.data!=right.data){
                        return false;
                    }
                    left=left.next;
                    right=right.next;
                }
                return true;
             }
        
    public static void main(String args[]){
        LinkedList ll=new LinkedList();
        ll.addFirst(1);
        ll.addFirst(2);

        ll.addLast(2);
        ll.addLast(1);

        ll.add(3,3);

        ll.print();
        System.out.println(ll.size);
        ll.removefirst();
        ll.print();
        System.out.println(ll.size);
        ll.removeLast();
        ll.print();
        System.out.println(ll.size);
        System.out.println(ll.itrSearch(3));
        System.out.println(ll.itrSearch(10));
        System.out.println(ll.recSearch(3));
        System.out.println(ll.recSearch(10));
        ll.reverse();
        ll.print();
        ll.deleteNthFromEnd(2);
        ll.print();
        System.out.println(ll.size);
        System.out.println(ll.checkPalindrome());
        //System.out.println(ll.addFirst(1));
    }
    
}
