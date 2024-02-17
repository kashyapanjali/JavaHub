//print number from n to 1(Decreasing order and Increasing order)

public class DecInc {
    public static void printDec(int n){
        if(n==1){
            System.out.println(1); 
            return;   
        }
        
        //for decreasing order
        System.out.print(n+" ");
        printDec(n-1);

        //for increasing order
        System.out.print(n-1+" ");  
    }
    public static void main(String args[]){
        printDec(9);
    }  
}
