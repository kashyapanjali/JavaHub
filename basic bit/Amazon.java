public class Amazon {
    public static int countbit(int n){
        int count =0;
        while(n>0){
            if((n&1)!=0){
                count++;      //check our lsb
            }
            
            n=n>>1;
        }
        return count;
    }
    //fast exponentiation term find 
    public static int fastExp(int a,int n){
        int ans=1;
        while(n>0){
            if((n&1)!=0) {
                ans=ans*a;
            }//check lsb
       a=a*a;
       n=n>>1;
     }
     return ans;

    }
    public static void main(String args[]){
        System.out.println(countbit(9));
        
        System.out.println(fastExp(4,4));

    }
    
}
