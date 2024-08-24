import java.util.*;
public class basicbit {
    public static void main(String args[]){
    Scanner sc=new Scanner (System.in);
    System.out.println("enter the value of a and b");
    int a=sc.nextInt();
    int b=sc.nextInt();
    //AND opeartion
    System.out.println(a&b);
    //OR operation
    System.out.println(a|b);
    //XOR operation
    System.out.println(a^b);
    //NOT operation
    int c=sc.nextInt();
    System.out.println(~c);
    //left shift
    System.out.println(a<<b);
    //right shift
    float d = (a>>b);
    System.out.println(d);
    sc.close();
         }
    }
    
