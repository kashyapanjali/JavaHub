public class palindrome {
    public static void palind(int n){
        int num=n;
        int lastdigit=0;
        while(num>0){
            int rem=num%10;
            lastdigit=lastdigit*10+rem;
            num=num/10;
        }
        if(n==lastdigit){
            System.out.println("palindrome");
        }
        else{
            System.out.println("not palindrome");
        }
        return;
    }
    public static void main(String args[]){
       palind(656);
    }
}
