import java.util.*;
public class Item {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        float pencil_price=sc.nextFloat();
        float pen_price=sc.nextFloat();
        float eraser_price=sc.nextFloat();
        float total_price=pencil_price+pen_price+eraser_price;
        System.out.println("total price is :"+total_price);
        System.out.println("gst of total is:"+total_price+(total_price*(18.0/100.0)));
        sc.close();
    }
}
