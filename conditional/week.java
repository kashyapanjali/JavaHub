import java.util.*;
public class week {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int week_day=sc.nextInt();
        switch(week_day){
            case 1:System.out.println("Day is Sunday");
            break;
            case 2:System.out.println("Day is Monday");
            break;
            case 3:System.out.println("Day is Tuesday");
            break;
            case 4:System.out.println("day is wednesday");
            break;
            case 5:System.out.println("Day is thursday");
            break;
            case 6:System.out.println("Day is friday");
            break;
            case 7:System.out.println("Day is saturday");
            break;
            default:System.out.println("Wrong day");
        }
        sc.close();
    }
}
