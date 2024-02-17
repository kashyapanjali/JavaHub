public class Primecheck {
    public static void main(String args[]){
        int n=7;
        int div=2;
        //time complexity O(n/2)
        while(div<Math.sqrt(n)){
            if(n%div==0){
                System.out.println("not prime");
                break;
            }else{
                div+=1;
            }
            System.out.println("prime");
        } 
    }
    
}
