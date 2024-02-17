public class campare {
    public static void main(String args[]){
        String s1="Hello";
        String s2="Hello";
        String s3=new String("Hello");
        //directly use comparsion
        if(s1==s2){
            System.out.println("string s1 equal to the s2");
        }
        else{
            System.out.println("strings are not equal");
        }
        // when new String is assign the we have to use different function
        if(s1.equals(s3)){
            System.out.println("string s1 equal to the s2");
        }
        else{
            System.out.println("strings are not equal");
        }
    }
    
}
