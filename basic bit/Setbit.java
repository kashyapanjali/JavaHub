public class Setbit {
    public static int setdigit(int n,int i){
        int bitmask=1<<i;
        return n|bitmask;
    }
    public static void main(String args[]){
        System.out.println(setdigit(8,2));
    }   
}
