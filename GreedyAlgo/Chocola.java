import java.util.Collections;
import java.util.Arrays;
public class Chocola {
    public static void main(String args[]){
        Integer costVer[]={2,1,3,1,4};//m-1
        Integer costHor[]={4,1,2};  //n-1
        Arrays.sort(costVer,Collections.reverseOrder());
        Arrays.sort(costHor,Collections.reverseOrder());
        int h=0,v=0;  //pointer->increment
        int hp=1,vp=1;
        int cost=0;
        while(h<costHor.length&&v<costVer.length){
         if(costVer[v]<=costHor[h]){
            cost+=(costHor[h]*vp);  //horizontal cut
            hp++;
            h++;
           }else{
            cost+=(costVer[v]*hp); //vertical cut
            vp++;
            v++; 
         } 
        }
        while(h<costHor.length){
            cost+=(costHor[h]*vp);  //horizontal cut rest
            hp++;
            h++;
        }
        while(v<costVer.length){
        cost+=(costVer[v]*hp);  //horizontal cut rest
            vp++;
            v++;
        }
     System.out.println("min cost of cuts="+cost);
    }
}
