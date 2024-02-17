import java.util.*;
public class set {
   public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
     
     int evensum=0,oddsum=0,choice;
     int n;
     do{
        System.out.println("enter the number");
        n=sc.nextInt();
        if(n%2==0){
            evensum+=n;
        }
        else{
            oddsum+=n;
        }
        System.out.println("when you want to continue? yes,take a number then press 1 and otherwise 0 for no");
        choice=sc.nextInt();
     } while(choice==1);
     System.out.println(evensum);
     System.out.println(oddsum);
     
     sc.close();
   } 
}
