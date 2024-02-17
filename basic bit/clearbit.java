public class clearbit {
    public static int cleardigit(int n,int i){
        int bitmask=~(1<<i);
        return n&bitmask;
    }
    public static void main(String args[]){
      System.out.println(cleardigit(10,1));
    }
    
}
