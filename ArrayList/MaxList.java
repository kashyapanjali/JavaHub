import java.util.*;

public class MaxList {
    public static void main(String args[]){
        ArrayList<Integer>list=new ArrayList<>();
        list.add(3);
        list.add(5);
        list.add(9);
        list.add(1);
        list.add(4);

        //maximum number
        int max=Integer.MIN_VALUE;
        for(int i=0;i<list.size();i++){
            max=Math.max(max,list.get(i));
            
        // if(max<list.get(i)){
        // max=list.get(i);}
          }
        System.out.println("Maximum number is:"+max);
    }
    
}
