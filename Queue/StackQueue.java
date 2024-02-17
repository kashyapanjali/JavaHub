import java.util.Stack;
//this is also known as Queue formed by double stack 
public class StackQueue {
static class Queue{
    static Stack<Integer>s1=new Stack<>();
    static Stack<Integer>s2=new Stack<>();
    public boolean isEmpty(){
        return s1.isEmpty();
    }
    //add
    public void add(int data){
        //push data in s2 from s1
        while(!s1.isEmpty()){
            s2.push(s1.pop());
        }
        //After vacant s1push data into it
        s1.push(data);
        //push data in s1 from s2
        while(!s2.isEmpty()){
            s1.push(s2.pop());
        }
    }
    //remove
    public int remove(){
        if(isEmpty()){
            System.out.println("Queue is Empty");
        }
        return s1.pop();
    }
    public int peek(){
        if(isEmpty()){
            System.out.println("Queue is Empty");
            return -1;
        }
        return s1.peek();
    }

}
public static void main(String args[]){
    Queue q=new Queue();
    q.add(1);
    q.add(2);
    q.add(3);
    while(!q.isEmpty()){
        System.out.println(q.peek());
        q.remove();
    }
}
    
}
