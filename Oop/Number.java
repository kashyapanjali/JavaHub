public class Number {
    public static void main(String args[]){
        Complex c=new Complex();
        int A=c.realnum=5;
        int B=c.imgnum=6;
        System.out.println("a value is: "+A+"||b value is: "+B);
    }
    
}
class Complex{
    int realnum;
    int imgnum;
    void complex(int a,int b){
        realnum=a;
        imgnum=b;
    }  
}