import java.util.HashMap;
public class BasicHash {
    public static void main(String args[]){
        HashMap<String, Integer>hm=new HashMap<>();
        //create a hashmap O(1)
        hm.put("India",100);
        hm.put("Chaina",150);
        hm.put("US",50);
        System.out.println(hm);
        //get data O(1)
        int population=hm.get("India");
        System.out.println(population);
        //containsKey O(1)  
        System.out.println(hm.containsKey("India"));  
        System.out.println(hm.containsKey("Indonesia")); 
        
        //remove function O(1)
        System.out.println(hm.remove("India"));
        System.out.println(hm);

        //size
        System.out.println(hm.size());
        //isEmpty
        System.out.println(hm.isEmpty());

        //clear function
        hm.clear();
        System.out.println(hm.isEmpty());
    }   
}
