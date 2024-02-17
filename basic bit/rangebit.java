public class rangebit {
    public static int clearRange(int n,int i,int j){
        int a=((~0)<<(j+1));
        int b=(1<<i)-1;
        int bitmask=a/b;
        return n&bitmask;
    }

    //check if a number is power of two or not
    public static boolean ispowertwo(int n){
        if((n&(n-1))==0){
            return true;
        }
        else{
            return false;
        }
    }
    
    public static void main(String args[]){

        System.out.println(clearRange(10,2,4));
        
        System.out.println(ispowertwo(9));
        
    }
    
}
