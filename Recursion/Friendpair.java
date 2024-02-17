//WAP to friends pairing problem ask in Goldman Sachs
public class Friendpair {
    
    public static int Pairways(int n){
        if(n==1||n==2){
            return n;
        }
        return Pairways(n-1)+(n-1)*Pairways(n-2);
    } 
    public static void main(String args[]){
        System.out.println(Pairways(5));

    }
}
