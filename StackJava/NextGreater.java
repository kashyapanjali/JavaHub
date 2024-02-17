import java.util.*;
public class NextGreater {
    public static void NextGreaterEle(Stack<Integer>s,int arr[],int nextGreater[]){
        for(int i=arr.length-1;i>=0;i--){
            //1Step
            while(!s.isEmpty()&&arr[s.peek()]<=arr[i]){
                s.pop();
            }
            if(s.isEmpty()){
               nextGreater[i]=-1;
            }
            else{
                nextGreater[i]=arr[s.peek()];
            }
            s.push(i);
        }

    }
    //Question Arises
    //next greater Right
    //next greater left
    //next smaller right
    //next smaller left
    public static void main(String args[]){
        Stack<Integer>s=new Stack<>();
        int arr[]={6,8,0,1,3};
        int nextgreater[]=new int[arr.length];
        NextGreaterEle(s,arr,nextgreater);
        for(int i=0;i<arr.length;i++){
            System.out.println(nextgreater[i]);
        }
        System.out.println();
    }
    
}
