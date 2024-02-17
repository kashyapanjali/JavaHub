public class ArrayQueue {
    static class Queue{
        static int arr[];
        static int rear;
        static int size;
        Queue(int n){
            arr=new int[n];
            size=n;
            rear=-1;
        }

        //isEmpty
        public boolean isEmpty(){
            return rear==-1;
        }
        //add
        //time complexity O(1)
        public void add(int data){
           if(rear==size-1){
            System.out.println("queue is full");
            return ;
           }
           rear+=1;
           arr[rear]=data;
        }
        //remove
        //Time complexity O(n)
        //Inefficient
        public int remove(){
           if(isEmpty()){
            System.out.println("queue is empty");
            return -1;
           }

           int front=arr[0];
           for(int i=0;i<rear;i++){
            arr[i]=arr[i+1]; 
           }
           rear=rear-1;
           return front;
        }
        //peek
        public int peek(){
            if(isEmpty()){
                System.out.println("queue is empty");
                return -1;
               }
               return arr[0];
        }

    }
    public static void main(String args[]){
        Queue q=new Queue(5);
        q.add(1);
        q.add(2);
        q.add(3);
        while(!q.isEmpty()){
            System.out.println(q.peek());
            q.remove();
        }

    }
    
}
