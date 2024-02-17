import java.util.*;
public class Sum {
    public static void main(String args[]){
    Scanner sc=new Scanner (System.in);
    int a=sc.nextInt();
    int b=sc.nextInt();
    int sum=a+b;
    int product=a*b;
    System.out.println("sum is:"+sum);
    System.out.println("product of two number is:"+product);
    int radius=sc.nextInt();
    double area=(3.14*radius*radius);
    System.out.println("area of circle is:"+area);
    int side=sc.nextInt();
    System.out.println("area of the square is :"+side*side);
    sc.close();
    }
}
