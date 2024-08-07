public class LLToStack {
    static class Node{
        Node next;
        int data;
     public Node(int data){
            this.data=data;
            this.next=null;
        }
    }
    static class Stack{
        //time complexity O(n)
        static Node head=null;
        //Empty case
        public boolean isEmpty(){
            return head==null;
        }
        //Push
        public void push(int data){
            Node newNode=new Node(data);
            if(isEmpty()){
                head=newNode;
                return;
            }
            newNode.next=head;
            head=newNode;
    
        }
          //pop
        public int pop(){
            if(isEmpty()){
                return -1;
            }
            int top=head.data;
            head=head.next;
            return top;
        }
        //peek
        public int peek(){
            if(isEmpty()){
                return -1;
            }
            return head.data;
        }
    }
    public static void main(String args[]){
        Stack s=new Stack();
        s.push(1);
        s.push(2);
        s.push(3);
        while(!s.isEmpty()){
            System.out.println(s.peek());
            s.pop();
        }

    }    
    
}

