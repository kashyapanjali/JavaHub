public class parameters {
    public static int sum(int a,int b){
        int sum=a+b;
        return sum;
        
    }
    public static float sum(float a,float b){
        float sum=a+b;
        System.out.println(sum);
        return sum;
    }
    public static void main(String args[]){
       int x=sum(5,3);
       double y=sum(5.5f,3);
       System.out.println(x);
       System.out.println(y);
    }
}
