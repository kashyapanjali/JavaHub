public class BuySell {
    static int maxProfit(int price[],int n){
        int buy=price[0],max_profit=0;
        for(int i=1;i<n;i++){
            if(buy>price[i]){
                buy=price[i];
            }else if(price[i]-buy>max_profit){
                max_profit=price[i]-buy;
            }
        }
        return max_profit;
    }
    //tc=o(n),sc=o(1)
    public static void main(String args[]){
        int prices[]={7,1,5,6,4};
        int n=prices.length;
        int max_profit=maxProfit(prices,n);
        System.out.println(max_profit);
    }
    
}
