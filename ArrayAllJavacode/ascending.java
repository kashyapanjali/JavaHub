import java.util.*;
public class ascending {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int size=sc.nextInt();
        int numbers[]=new int[size];
        for(int i=0;i<size;i++){
            numbers[i]=sc.nextInt();
        }
        boolean isascending=true;
        for(int i=0;i<numbers.length-1;i++){
            if(numbers[i]>numbers[i+1]){
                 isascending=false;
            }
        }
        if(isascending){
            System.out.println("the array is sorted in ascending");
        }
        else{
        System.out.println("the array is not sorted in ascending order");
    } sc.close();
}
}
