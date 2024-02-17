public class clearlast {
    public static int clearbit(int n,int i){
        int bitmask=(-1)<<i;
        return n&bitmask;
    }
    public static void main(String args[]){
        System.out.println(clearbit(15,2));

    }
    
}
