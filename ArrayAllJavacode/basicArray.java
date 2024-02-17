import java.util.*;
public class basicArray {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        //size of an array
        int size=sc.nextInt();
        int marks []=new int[size];
        // take input of the element
        for(int i=0;i<size;i++){
            marks[i]=sc.nextInt();
        }
        //create an array
        for(int i=0;i<size;i++){
            System.out.println(marks[i]);
        }
        //linear search
        int x=sc.nextInt();
        for(int i=0;i<marks.length;i++){
            if(marks[i]==x){
                System.out.println("element is present at "+i+ " index");
            }
        
        else{
            System.out.println("element is not present");
        }
    }
        sc.close();
    }
}
