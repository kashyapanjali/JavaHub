import java.util.*;

// public class multiplication {
//     public static void main(String args[]){
//         Scanner sc=new Scanner(System.in);
//         int n=sc.nextInt();
//         for(int i=1;i<=10;i++){
//            System.out.println(i*n);
//         }

//     }
// }
class MultiplicationTable{
    public static void printMultiplicationTable(int number){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the number");
        int n=sc.nextInt();
        for(int i=1;i<=10;i++){
            System.out.println(n+"*"+i+"="+n*i);
        }
        sc.close();
     }
    // public static void main(String args[]){
    //     printMultiplicationTable(9);
    // }
}