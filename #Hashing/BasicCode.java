public class BasicCode {
    public static int checkNumber(int number){
        if(number%2==0){
            return 1;
        }else{
            return 0;
        }
    }
    public static void main(String args[]){
         int result=checkNumber(2);
         System.out.println(result==1);
    }
    
}
