public class oddeven {
    public static int oddoreven(int n){
        int bitmask=1;
        if((n & bitmask)==0){
            System.out.println("even");
            
        }
     else{
        System.out.println("odd");
     }
     return 0 ;
    }
    public static void main(String args[]){
       System.out.println(oddoreven(7));
    }
    
}
