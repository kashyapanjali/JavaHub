//print x to the power n
public class SquNum {

    public static int power(int x,int n){
        //base case
        /*if(n==0){
            return 1;
        }
        return x*power(x,n-1);
        */
        //time complexity=O(n);
        //optimised Solution
        if(n==0){
            return 1;
        }
        int halfpower=power(x,n/2);
        int Squarehalf=halfpower*halfpower;
        if(n%2!=0){
            Squarehalf=x*Squarehalf;
        }
        return Squarehalf;
        //time complexity=O(logn)
    }
    public static void main(String args[]){
        System.out.println(power(2,5));
    }
    
}
