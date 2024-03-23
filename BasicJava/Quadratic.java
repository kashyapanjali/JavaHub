public class Quadratic {
    public static void main(String s[]){
      
        double z1,z2,d;
        int a=4,b=4,c=2;
        System.out.println("the value of a b c: "+a+" "+b+" "+" "+c);
        d=Math.sqrt((b*b)-(4*a*c));
        if(d==0){
            System.out.println("real and equal");
            z1=(-b)/2*a;
            System.out.println(z1);
        }else if(d>0){
            System.out.println("real and unequal");
            z1=(-b+d)/(2*a);
            z2=(-b-d)/(2*a);
            System.out.println(z1);
            System.out.println(z2);
        }else{
            System.out.println("complex");
            double realPart = -b /(2*a);
            double imaginaryPart =(-d)/(2*a);
            System.out.println(realPart);
            System.out.println(imaginaryPart +"i");
        }
    }  
}
