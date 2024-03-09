import java.util.*;

public class BasicSet {
    public static void main(String args[]){
        HashSet<Integer>set=new HashSet<>();//basic set

        //add element
        set.add(1);
        set.add(2);
        set.add(4);
        set.add(1);
        set.add(2);
        //print element
        System.out.println(set);

        // if(set.contains(2)){
        //     System.out.println("set contains");
        // }
         
        //remove element
        set.remove(2);

        //exist or not
        if(set.contains(2)){
            System.out.println("set contains");
        }
        System.out.println(set);

        if(set.contains(3))//not run
         System.out.println("set contains");
        

        //find size
        System.out.println(set.size());
        
        //empty or not
        System.out.println(set.isEmpty());
        
        //clear the set
        set.clear();
        System.out.println(set);
        System.out.println(set.isEmpty());
    } 
}
