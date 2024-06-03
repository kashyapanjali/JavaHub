public class BySellStock {
    public static int tillProfit(int prices[]){
        int buyPrice = Integer.MAX_VALUE;
        int maxProfit = 0;
        for(int i = 0; i < prices.length; i++){
            int sellingPrice = prices[i];
            if(buyPrice < sellingPrice ){   //profit
               int profit = sellingPrice - buyPrice;
               maxProfit = Math.max(maxProfit, profit);
            }else{
                buyPrice = sellingPrice;
            }
        }
        return maxProfit; 

    }
    public static void main(String args[]){
        int prices[] = {7,1,5,3,6,4};
        System.out.println(tillProfit(prices));
    }
    
}
