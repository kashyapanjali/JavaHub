import java.util.ArrayList;

public class PairSum1 {
    public static boolean SumPair1(ArrayList<Integer>list,int target){
        for(int i=0;i<list.size();i++){
            for(int j=i+1;j<list.size();j++){
                if(list.get(i)+list.get(i+1)==target){
                    return true;
                }
            }
        }return false;
    }
    
    //pointer2-Approach
    public static boolean SumPair1Ptr(ArrayList<Integer>list,int target){
        int lp=0;
        int rp=list.size()-1;
        while(lp<rp){
            if(list.get(lp)+list.get(rp)==target){
                return true;
            }
            if(list.get(lp)+list.get(rp)<target){
                lp++;
            }else{
                rp--;
            }
        }
        return false;
    }
    public static void main(String args[]){
        ArrayList<Integer>list=new ArrayList<>();
        //Sorted Array
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);
        int target=5;
        System.out.println(SumPair1(list,target));
        System.out.println(SumPair1Ptr(list,target));
    }
}
