import java.util.*;
public class average {
    public static int averagenum(int a,int b,int c){
        return (a+b+c)/3;
    }
    public static void main(String args[]){
      Scanner sc=new Scanner(System.in);
      int a=sc.nextInt();
      int b=sc.nextInt();
      int c=sc.nextInt();
      System.out.print("average of three number is:");
      int x=averagenum(a,b,c);
      System.out.print(x);
      sc.close();
    }
}
