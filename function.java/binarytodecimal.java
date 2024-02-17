public class binarytodecimal {
    public static int bintodec(int n){
        int pow=0;
        int decimaldigit=0;
        while(n>0){
            int rem=n%10;
            decimaldigit+=rem*(int)Math.pow(2,pow);
            pow++;
            n/=10;
        }System.out.println(decimaldigit);
        return 0;
    }
    public static int dectobin(int n){
        int pow=0;
        int lastdigit=0;
        while(n>0){
            int rem=n%2;
            lastdigit+=rem*(int)Math.pow(10,pow);
            pow++;
            n/=2;
        }
        System.out.println(lastdigit);
        return 0;
    }
    public static void main(String args[]){
        bintodec(111);
        dectobin(7);
    }
}
