import java.util.ArrayList;

public class BasicArrayList {
    public static void main(String args[]){
        ArrayList<Integer>List=new ArrayList<>();
        //ArrayList<String>List2=new ArrayList<>();
        //ArrayList<Boolean>List3=new ArrayList<>();
       // Add element
        List.add(1);
        List.add(2);
        List.add(3);
        List.add(4);
        List.add(5);
        
        //Add at index
        List.add(2,7);
        System.out.println(List);

        System.out.println();

        //find an element
        int element=List.get(0);
        System.out.println(element);

        System.out.println();

        //Remove an element at index
        List.remove(2);
        System.out.println(List);

        System.out.println();

        //Set an element at index
        List.set(2,10);
        System.out.println(List);

        System.out.println();

        //Contains an element
        System.out.println(List.contains(2));
        System.out.println(List.contains(11));

        //Find length of the arraylist
        System.out.println(List.size());

        //To print ArrayList
        for(int i=0;i<List.size();i++){
            System.out.print(List.get(i)+" ");
        }
         System.out.println();

        //Reverse of Arraylist
        for(int i=List.size()-1;i>=0;i--){
            System.out.print(List.get(i)+" ");
        }
        System.out.println();
       //Find Maximum number
       for(int i=0;i<List.size()-1;i++){
        if(List.get(i)>List.get(i+1)){
            System.out.println(List.get(i)+" at index:"+i);
        }
       }

    }
    
}
