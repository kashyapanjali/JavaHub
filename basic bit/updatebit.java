public class updatebit {
    
    public static int setdigit(int n,int i){
        int bitmask=1<<i;
        return n|bitmask;
    }

    public static int cleardigit(int n,int i){
        int bitmask=~(1<<i);
        return n&bitmask;
    }

    /*update ith bit position by newbit of 1 and 0

    public static int update(int n,int i,int newbit){
        int bitmask=newbit<<i;
        return n|bitmask;
    }
    */

    //OR//

    public static int update(int n,int i,int newbit){
        if(newbit==0){
            return cleardigit(n,i);
        }else{
            return setdigit(n,i);
        }
    }

    public static void main(String args[]){
       // System.out.println(update(10,2,1));
        System.out.println(update(10,2,1));

    }
    
}
