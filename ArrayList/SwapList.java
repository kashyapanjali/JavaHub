import java.util.ArrayList;
import java.util.Collections;

public class SwapList {
    public static void SwapNumber(ArrayList<Integer>list,int idx1,int idx2){
        int temp=list.get(idx1);
        list.set(idx1,list.get(idx2));
        list.set(idx2,temp);

}
    public static void main(String args[]){
        ArrayList<Integer>list=new ArrayList<>();
        list.add(2);
        list.add(4);
        list.add(1);
        list.add(9);
        list.add(8);
        System.out.println(list);
        int idx1=1, idx2=3;
        //swap number
        SwapNumber(list,idx1,idx2);
        System.out.println(list);

        //Ascending order
        Collections.sort(list);
        System.out.println(list);

        //decending order
        Collections.sort(list,Collections.reverseOrder());
        System.out.println(list);
        
    }
    
}
