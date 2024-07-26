import java.util.*;

public class SpaceOptimization {
    public static void bitspace(int a, int b){
        int size = Math.abs(b-a)+1;
        //initialize with zero
        int arr[] = new int[size];

        for(int i = a; i <= b; i++){
            if(i % 2 == 0 || i % 5 == 0){
                arr[i-a] = 1;
            }
        }
        System.out.println("Multiple of a and b is:");
        for(int i = a; i <= b; i++){
            if(arr[i-a] == 1){
                System.out.println(i + " ");
            }
        }
    }
    public static void main(String args[]){
       @SuppressWarnings("resource")
       Scanner sc = new Scanner(System.in);
       int a = sc.nextInt();
       int b = sc.nextInt();
       bitspace(a, b);
    }   
}
