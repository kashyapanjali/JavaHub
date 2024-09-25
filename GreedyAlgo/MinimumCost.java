import java.util.*;
public class MinimumCost {

    public static int minCost(int coins[], int k){
        int totalCost = 0;
        int n = coins.length; 
        int i = 0;
        while(n > 0){
            totalCost += coins[i];
            i++;
            n -= (k+1);
        }
        return totalCost; 

    }
    public static void main(String args[]){
        int coins[] = {1, 2, 5, 10, 20, 50};
        Arrays.sort(coins);
        int k = 3;
        System.out.println(minCost(coins, k));
    }
    
}
