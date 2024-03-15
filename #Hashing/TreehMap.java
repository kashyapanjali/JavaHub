import java.util.*;
public class TreehMap {
    public static void main(String args[]){
        TreeMap<String,Integer>tm=new TreeMap<>();
        tm.put("India",100);
        tm.put("China",150);
        tm.put("Nepal",50);
        System.out.println(tm);
        System.out.println(tm.get("India"));
        System.out.println(tm.containsKey("India"));
        System.out.println(tm.isEmpty());
        System.out.println(tm.remove("india"));

    }  
}
