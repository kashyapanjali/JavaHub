public class swap {
    public static void swapp(int a,int b){
        int temp=a;
        a=b;
        b=temp; 
        System.out.println(a);//call by value works
        System.out.println(b);
        return;
    }
    public static void main(String args[]){
        int a=9;
        int b=8;
        swapp(a,b);
       System.out.println(a); // call by reference does not work
       System.out.println(b);
    
    }
}
