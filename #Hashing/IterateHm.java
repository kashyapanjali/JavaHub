import java.util.Map.Entry;
import java.util.HashMap;
import java.util.Set;
public class IterateHm {
    public static void main(String args[]){
        HashMap<String,Integer>hm=new HashMap<>();
        hm.put("India", 100);
        hm.put("China",150);
        hm.put("Nepal",50);
        System.out.println(hm);

          //iterative formula
        Set<String>keys=hm.keySet();
        System.out.println(keys);

        //to give value set pairs
        Set<Entry<String, Integer>>key=hm.entrySet();
        System.out.println(key);
        for(String k:keys){
            System.out.println("the key "+k+" of value is "+hm.get(k));
        }
    }
    
}
