import java.util.*;
public class Histogram {
    public static void maxArea(int arr[]){
        //total time complexity O(n)
        int max=0;
        int nsl[]=new int[arr.length];
        int nsr[]=new int[arr.length];
         
        //next smaller right
        //To find smaller from ending approach
        //time complexity O(n)
        Stack<Integer>s=new Stack<>();
        
        for(int i=arr.length-1;i>=0;i--){
            while(!s.isEmpty()&&arr[s.peek()]>=arr[i]){
                s.pop();
            }
            if(s.isEmpty()){
                nsr[i]=arr.length;
            }
            else{
                nsr[i]=s.peek();
            }
            s.push(i);

        }

        //next smaller left 
        //to find next smaller smaller left from starting
        //time complexity O(n)
        s=new Stack<>();
           for(int i=0;i<=arr.length-1;i++){
             while(!s.isEmpty()&&arr[s.peek()]>=arr[i]){
                s.pop();
                }
              if(s.isEmpty()){
                nsl[i]=-1;
              }
               else{
                nsl[i]=s.peek();
            }
            s.push(i);

        }
        //time complexity O(n)

        for(int i=0;i<arr.length;i++){
            int height=arr[i];
            //width of current bar j-i-1 =nsr[i]-nsl[i]-1
            int width=nsr[i]-nsl[i]-1;
            int currArea=height*width;
            max=Math.max(max,currArea);
        }
          System.out.println("Maximum histogram width occupy is:"+max);

    }
    public static void main(String args[]){
        int arr[]={2,1,5,6,2,3};
        maxArea(arr);
    }
    
}
