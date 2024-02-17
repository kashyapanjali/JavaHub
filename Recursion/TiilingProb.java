//How many ways to fit a tile on floor of size 2*1 of 2*n size of floor.
public class TiilingProb {
    public static int TillingProblem(int n){
        //base case
        if(n==0||n==1){
            return 1;
        }
        return TillingProblem(n-1)+TillingProblem(n-2);
    }
    public static void main(String args[]){
        System.out.println(TillingProblem(4));

    }
    
}
